
package net.zzqd.service;

import java.sql.SQLException;
import java.util.List;

import net.zzqd.domain.Category;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public interface CategoryService 
{
	List<Category> findAll() throws SQLException;
}

