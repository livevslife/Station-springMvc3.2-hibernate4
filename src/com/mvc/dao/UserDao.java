package com.mvc.dao;

import com.mvc.model.User;

public interface UserDao {

	User getUser(User user);

	void delete(User user);

	void save(User user);

}
