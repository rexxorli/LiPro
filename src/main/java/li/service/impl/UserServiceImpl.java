/**
 * 
 */
package li.service.impl;

import java.io.Serializable;
import java.util.Date;

import li.dao.UserDaoI;
import li.model.TUser;
import li.service.UserServiceI;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(UserServiceImpl.class);
	
	private UserDaoI userDao;
	

	public UserDaoI getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	@Override
	public void test() {
		 logger.info("测试测试！");
	}

	@Override
	public Serializable save(TUser t) {
		return userDao.save(t);
	}

}
