
package net.zzqd.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import net.zzqd.dao.FinaceDao;
import net.zzqd.domain.Finace;
import net.zzqd.utils.DruidUtils;

/**
* @author zzq
* @version 创建时间：2019年5月26日 下午10:33:30
* 
*/

public class FinaceDaoImpl implements FinaceDao{
	QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());

	@Override
	public int add(Finace finace) throws SQLException {
		String sql = "insert into t_finance(money,cid,addTime,details,type) values(?,?,?,?,?)";
        Object[] params = {finace.getMoney(),finace.getCid(),finace.getAddTime(),finace.getDetails(),finace.getType()};
        int flag = qr.update(sql,params);
        return flag;
	}

}

