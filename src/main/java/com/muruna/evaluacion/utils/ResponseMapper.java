package com.muruna.evaluacion.utils;

import org.springframework.stereotype.Component;

import com.muruna.evaluacion.model.CreateResponse;
import com.muruna.evaluacion.model.User;

@Component
public class ResponseMapper {

	public CreateResponse mapResponse(User user) {
		
	CreateResponse response = new CreateResponse();
   
    response.setActive(user.isActive());
    response.setCreated(user.getCreatedAt());
    response.setId(user.getId());
    response.setLast_login(user.getLast_login());
    response.setModified(user.getUpdatedAt());
    response.setToken(user.getToken());
    
    return response;
	}
}