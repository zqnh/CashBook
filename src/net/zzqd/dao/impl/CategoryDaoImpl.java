
package net.zzqd.dao.impl;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.zzqd.dao.CategoryDao;
import net.zzqd.domain.Category;
import net.zzqd.utils.DruidUtils;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public class CategoryDaoImpl implements CategoryDao
{
	//查询所有分类
	@Override
	public List<Category> findAll() throws SQLException 
	{
		QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
		String sql = "select * from t_category";
	    return qr.query(sql,new BeanListHandler<Category>(Category.class));
	}
	
}

