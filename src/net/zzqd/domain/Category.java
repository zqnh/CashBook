package net.zzqd.domain;

import java.util.Date;
/**
 * 
 * @author zzq
 * 2019年5月26日 下午10:28:18
 * discription:分类JavaBean
 * indetail:
 */
public class Category {
	private int cid;
	private String name;
	private Date createTime;
	private Date updateTime;
	private int canRemove;
	private String color;
	private String type;
	private String logo;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getCanRemove() {
		return canRemove;
	}
	public void setCanRemove(int canRemove) {
		this.canRemove = canRemove;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", canRemove=" + canRemove + ", color=" + color + ", type=" + type + ", logo=" + logo + "]";
	}
	
}
