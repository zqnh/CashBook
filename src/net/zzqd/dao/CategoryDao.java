
package net.zzqd.dao;

import java.sql.SQLException;
import java.util.List;
import net.zzqd.domain.Category;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public interface CategoryDao 
{
	List<Category> findAll() throws SQLException;
	
}

