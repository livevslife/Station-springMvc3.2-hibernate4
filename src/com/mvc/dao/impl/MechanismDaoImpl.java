package com.mvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.dao.MechanismDao;
import com.mvc.model.Mechanism;
@Repository
public class MechanismDaoImpl implements MechanismDao {
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
	public Mechanism getMechanism(Mechanism user) {
		// TODO Auto-generated method stub
		String sql="from Mechanism";
		return (Mechanism)getSession().createQuery(sql).list().get(0);
	}
	@Override
	public void delete(Mechanism user) {
		// TODO Auto-generated method stub
		String sql="delete from Mechanism";
		getSession().createQuery(sql).executeUpdate();
	}
	
	@Override
	public void save(Mechanism user) {
		// TODO Auto-generated method stub
		getSession().save(user);
	}
	
}
