
package net.zzqd.service.impl;

import java.sql.SQLException;

import net.zzqd.dao.FinaceDao;
import net.zzqd.dao.UserDao;
import net.zzqd.dao.impl.FinaceDaoImpl;
import net.zzqd.dao.impl.UserDaoImpl;
import net.zzqd.domain.Finace;
import net.zzqd.service.FinaceService;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:34:58
* 
*/

public class FinaceServiceImpl implements FinaceService
{
	private FinaceDao finaceDao = new FinaceDaoImpl();

	@Override
	public int add(Finace finace) throws SQLException {
		int flag = finaceDao.add(finace);
	    return flag;
	}
	
}

