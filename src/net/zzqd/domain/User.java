package net.zzqd.domain;

public class User {
	private int uid;
	private String email;
	private String password ;
	private String nikeName;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNikeName() {
		return nikeName;
	}
	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", email=" + email + ", password=" + password + ", nikeName=" + nikeName + "]";
	}
	
}
