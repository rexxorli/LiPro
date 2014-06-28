/**
 * 
 */
package li.dao;

import java.io.Serializable;

import li.model.TUser;

/**
 * @author Administrator
 *
 */
public interface UserDaoI {
		public Serializable save(TUser tUser);
}
