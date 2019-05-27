
package net.zzqd.service;

import java.sql.SQLException;

import net.zzqd.domain.User;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public interface UserService 
{
    User findByUsername(String username) throws SQLException;
    User login(String email, String password) throws SQLException;
    int regist(User user) throws SQLException;

}

