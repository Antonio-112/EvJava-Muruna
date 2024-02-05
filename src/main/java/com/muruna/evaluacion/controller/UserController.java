package com.muruna.evaluacion.controller;

import com.muruna.evaluacion.model.ApiResponse;
import com.muruna.evaluacion.model.CreateResponse;
import com.muruna.evaluacion.model.CreateUserDto;
import com.muruna.evaluacion.model.User;
import com.muruna.evaluacion.service.UserService;
import com.muruna.evaluacion.utils.DtoMapper;
import com.muruna.evaluacion.utils.PasswordChecker;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;
    private final DtoMapper dtoMapper;
    private final PasswordChecker passwordChecker;

    public UserController(UserService userService, DtoMapper dtoMapper, PasswordChecker passChecker) {
        this.userService = userService;
        this.dtoMapper = dtoMapper;
        this.passwordChecker = passChecker;
    }


    @GetMapping("{id}")
    public ResponseEntity<ApiResponse<User>> getUserById(@PathVariable("id") String id) throws Exception {
        User response = userService.getById(id);
        return ResponseEntity.ok(new ApiResponse<>("User retrieved successfully", response));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>> createUser(@Valid() @RequestBody CreateUserDto userDto ) {
        User user = this.dtoMapper.mapToUser(userDto);
        
        boolean isPasswordValid = passwordChecker.passwordTest(user.getPassword());
        
        if (!isPasswordValid) {
            logger.warn("La contraseña no es válida");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse<>("La contraseña no cumple con los requisitos", null));
        }
        
        if(userService.checkEmail(user.getId(), user.getEmail())) {
            logger.warn("El correo ya está registrado: {}", user.getEmail());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse<>("El correo ya está registrado", null));
        }
        
        try {
            CreateResponse response = userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse<>("User created successfully", response));
        } catch (Exception e) {
            logger.error("Error creating user", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse<>("Error creating user. Please try again later.", null));
        }
    }
    
}
