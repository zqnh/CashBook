
package net.zzqd.dao;

import java.sql.SQLException;

import net.zzqd.domain.Finace;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public interface FinaceDao
{
	int  add(Finace finace)throws SQLException;
}

