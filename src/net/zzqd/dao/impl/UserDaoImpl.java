
package net.zzqd.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import net.zzqd.dao.UserDao;
import net.zzqd.domain.User;
import net.zzqd.utils.DruidUtils;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public class UserDaoImpl implements UserDao{
	private QueryRunner qr =new QueryRunner(DruidUtils.getDataSource());

	@Override
	public User findByUsername(String username) {
		String sql = "select * from t_user where username = ? ";
		try {
			return (User) qr.query(sql,new BeanHandler<User>(User.class),username);
		} catch (SQLException e) {
			new RuntimeException("根据用户名查询失败");
		}
		return null;
	}

	@Override
	public User findByEAndP(String email, String password) {
		String sql = "select * from t_user where email = ? and password = ? ";
		try {
			return  (User) qr.query(sql,new BeanHandler<User>(User.class),email,password);
		} catch (SQLException e) {
			new RuntimeException("登陆用户失败");
		}
		return null;
	}

	//注册业务
	/* int uid;
	 String email;
	 String password ;
	 String nikeName;
	*/
	@Override
	public int InsterUser(User user) throws SQLException {
		String sql = "insert into t_user(email,password,nikeName) values(?,?,?)";
        Object[] params = {user.getEmail(),user.getPassword(),user.getNikeName()};
        int flag = qr.update(sql,params);
        return flag;
	}

}

