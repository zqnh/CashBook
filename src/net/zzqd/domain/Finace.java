package net.zzqd.domain;

import java.util.Date;
/**
 * 
 * @author zzq
 * 2019年5月26日 下午10:28:50
 * discription:业务Bean
 * indetail:
 */
public class Finace {
	private int fid;
	private double money;
	private int cid;
	private Date addTime;
	private String details;
	private int type;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Finace [fid=" + fid + ", money=" + money + ", cid=" + cid + ", addTime=" + addTime + ", details="
				+ details + ", type=" + type + "]";
	}
	

}
