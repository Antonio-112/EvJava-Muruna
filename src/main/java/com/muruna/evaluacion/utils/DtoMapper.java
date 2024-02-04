package com.muruna.evaluacion.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.muruna.evaluacion.model.CreateUserDto;
import com.muruna.evaluacion.model.Phone;
import com.muruna.evaluacion.model.PhoneDto;
import com.muruna.evaluacion.model.User;

@Component
public class DtoMapper {

	public List<Phone> mapToList(List<PhoneDto> entityList) {
		List<Phone> list = new ArrayList<Phone>(); 
		for(int i = 0; i<entityList.size(); i++) {
			list.add(mapToPhone(entityList.get(i)));
		}
		return list;
	}
	
	public Phone mapToPhone(PhoneDto phoneDto) {
		Phone phone = new Phone();
		phone.setNumber(phoneDto.getNumber());
		phone.setContrycode(phoneDto.getCountrycode());
		phone.setCitycode(phone.getCitycode());
		
		return phone;
	}
	
	public User mapToUser(CreateUserDto userDto) {
		User user = new User();
		user.setActive(true);
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPhones(this.mapToList(userDto.getPhones()));
		
		return user;
	}
	
//	public<T, K> List<T> mapToList(List<K> entityList) {
//		List<T> list = new List<T>(); 
//		for(int i = 0; i<entityList.size(); i++) {
//			
//		}
//	}
}
