
package net.zzqd.service.impl;

import java.sql.SQLException;
import java.util.List;

import net.zzqd.dao.CategoryDao;
import net.zzqd.dao.impl.CategoryDaoImpl;
import net.zzqd.domain.Category;
import net.zzqd.service.CategoryService;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public class CategoryServiceImpl implements CategoryService
{
	CategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	public List<Category> findAll() throws SQLException
	{
		//调用dao 查询所有的分类
        List<Category> list = categoryDao.findAll();
        return list;
	}

}

