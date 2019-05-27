
package net.zzqd.service;

import java.sql.SQLException;

import net.zzqd.domain.Finace;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public interface FinaceService 
{
	int  add(Finace finace)throws SQLException;
}

