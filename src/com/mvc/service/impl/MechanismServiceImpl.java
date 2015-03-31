package com.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mvc.dao.MechanismDao;
import com.mvc.model.Mechanism;
import com.mvc.service.MechanismService;
@Service
public class MechanismServiceImpl implements MechanismService {
	@Autowired
	private MechanismDao mechanismDao;
	@Override
	@Cacheable(key="#Mechanism",value={"objcache"})
	public Mechanism getMechanism(Mechanism mechanism) {
		// TODO Auto-generated method stub
		return mechanismDao.getMechanism(mechanism);
	}
	public void setUserDao(MechanismDao mechanismDao) {
		this.mechanismDao = mechanismDao;
	}
	@Override
	public void delete(Mechanism mechanism) {
		// TODO Auto-generated method stub
		mechanismDao.delete(mechanism);
	}
	@Override
	public void save(Mechanism mechanism) {
		// TODO Auto-generated method stub
		mechanismDao.save(mechanism);
	}
}
