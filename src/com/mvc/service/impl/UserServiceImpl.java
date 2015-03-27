package com.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mvc.dao.UserDao;
import com.mvc.model.User;
import com.mvc.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	@Cacheable(key="#user",value={"objcache"})
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
}
