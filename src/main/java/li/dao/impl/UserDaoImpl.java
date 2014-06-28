package li.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import li.dao.UserDaoI;
import li.model.TUser;

@Repository("userDao")
public class UserDaoImpl implements UserDaoI {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Serializable save(TUser tUser) {
		return this.getSessionFactory().getCurrentSession().save(tUser);
	}

}
