package org.dao;
import org.model.*;
public interface LoginDao {
	//����������ѧ�źͿ������
	public Login find(String xh, String kl);
	public Login findbyusr(String sid);
	public void save(Login login);
	public void update(Login login);	
}
