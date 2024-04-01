package com.ashok.service;

import java.util.List;

import com.ashok.exception.UserException;
import com.ashok.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
