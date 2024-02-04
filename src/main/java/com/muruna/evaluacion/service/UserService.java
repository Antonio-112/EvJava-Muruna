package com.muruna.evaluacion.service;

import com.muruna.evaluacion.model.CreateResponse;
import com.muruna.evaluacion.model.User;
import com.muruna.evaluacion.repository.UserRepository;
import com.muruna.evaluacion.utils.ResponseMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired  
    private final UserRepository repo;
    private final ResponseMapper responseMapper;

    public UserService(UserRepository repo, ResponseMapper responseMapper) {
        this.repo = repo;
        this.responseMapper = responseMapper;
    }

    public User getById(String id) {
    	// TODO: Implementar la lógica para obtener el usuario por ID
    	// No necesario para la prueba
        return null;
    }

    @Transactional
    public CreateResponse createUser(User user) {
        User request = repo.save(user);
        CreateResponse response = responseMapper.mapResponse(request);

        logger.info("User created successfully: {}", response);
        return response;
    }
    
    //*****************************************************//
    
    public boolean checkEmail(String id, String email) {
        User user = repo.findByEmail(email);
        boolean emailExists = user != null;

        if (emailExists) {
            logger.warn("Email {} is already registered.", email);
        }

        return emailExists;
    }
}
