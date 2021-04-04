package org.model;
import java.util.*;
/**
 * Xsb entity. @author MyEclipse Persistence Tools
 */
public class Login implements java.io.Serializable{
	//Fields
	private String sid;
	private String password;
	
	
	
	
	public Login() {
	}
	/** minimal constructor */
	public Login(String sid, String password) {
		this.sid = sid;
		this.password=password;
	}
	
	
	
	
	
	
	
	
	
	

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
