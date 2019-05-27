
package net.zzqd.dao;

import java.sql.SQLException;

import net.zzqd.domain.User;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public interface UserDao 
{

	User findByUsername(String username)throws SQLException;
	User findByEAndP(String email, String password)throws SQLException;
	int InsterUser(User user)throws SQLException;
	
}

