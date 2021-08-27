package com.logos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logos.workshopmongo.domain.User;
import com.logos.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
}
