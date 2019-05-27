
package net.zzqd.service.impl;

import java.sql.SQLException;

import net.zzqd.dao.UserDao;
import net.zzqd.dao.impl.UserDaoImpl;
import net.zzqd.domain.User;
import net.zzqd.service.UserService;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User findByUsername(String username) throws SQLException {
		
		try {
			User user = userDao.findByUsername(username);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
        
	}

	@Override
	public User login(String email, String password) throws SQLException {
		
		try {
			User user = userDao.findByEAndP(email,password);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public int regist(User user) throws SQLException {
		int flag = userDao.InsterUser(user);
	    return flag;
	}

}

