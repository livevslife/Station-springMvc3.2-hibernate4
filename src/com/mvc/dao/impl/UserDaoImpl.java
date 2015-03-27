package com.mvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.mvc.dao.UserDao;
import com.mvc.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		//事务配置后，可通过getCurrentSession方法获得session
		return sessionFactory.getCurrentSession();
	}
	public void setSession(Session session) {
		this.session = session;
	}
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		String sql="from User u where u.userName='"+user.getUserName()+"' and u.passWd='"+user.getPassWd()+"'";
		return (User)getSession().createQuery(sql).list().get(0);
	}
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		String sql="delete from User u where u.userName='"+user.getUserName()+"' and u.passWd='"+user.getPassWd()+"'";
		getSession().createQuery(sql).executeUpdate();
	}
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getSession().save(user);
	}
	
}
