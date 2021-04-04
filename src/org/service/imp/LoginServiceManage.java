package org.service.imp;
import org.dao.*;
import org.service.*;
import org.model.*;
public class LoginServiceManage implements LoginService{
	private LoginDao loginDao;			
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	public Login find(String sid, String password){
		return loginDao.find(sid, password);
	}
	public Login findbyusr(String sid){
		return loginDao.findbyusr(sid);
	}
	public void save(Login login){
		loginDao.save(login);
	}
	
	
	
	
	
	public void update(Login login){					//�޸�ѧ����Ϣ
		loginDao.update(login);
	}	

}
