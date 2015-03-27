package com.mvc.service;

import com.mvc.model.User;

public interface UserService {

	User getUser(User user);

	void delete(User user);

	void save(User user);

}
