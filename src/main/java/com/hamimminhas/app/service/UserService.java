package com.hamimminhas.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.hamimminhas.app.dto.UserRegistrationDto;
import com.hamimminhas.app.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}