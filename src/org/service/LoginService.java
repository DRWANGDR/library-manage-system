package org.service;
import org.model.*;
public interface LoginService {
	//���񣺸���ѧ�źͿ������
	public Login find(String sid, String password);
	public Login findbyusr(String sid);
	public void save(Login login);
	
	
	
	public void update(Login login);	
	
	
	
}
