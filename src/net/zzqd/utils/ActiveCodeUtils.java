package net.zzqd.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 激活码工具
 * @author zzq
 *
 * 2019年5月3日
 */
public class ActiveCodeUtils{
	public static String createActiveCode() {
		//定义日期
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//将日期转换为字符串
		String s1 = sdf.format(date);
		//随机产生100-999的16进制数
		String s2 = Integer.toHexString(new Random().nextInt(900)+100);
		return s1+s2;
	}
}
