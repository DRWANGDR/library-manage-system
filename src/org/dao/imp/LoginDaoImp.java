package org.dao.imp;
import java.util.*;
import org.dao.*;
import org.model.*;
import org.hibernate.*;
public class LoginDaoImp extends BaseDao implements LoginDao{
	//ʵ�֣�����ѧ�źͿ������
	public Login find(String sid, String password){
		//��ѯ DLB ���еļ�¼
		String hql="from Login u where u.sid=? and u.password=?";
		Session session=getSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, sid);
		query.setParameter(1, password);
		List users=query.list();
		Iterator it=users.iterator();
		while(it.hasNext()){
			if(users.size()!=0){
				Login user=(Login)it.next();	//�����־û��� JavaBean ���� user
				return user;
			}
		}
		session.close();
		return null;
	}
	
	public Login findbyusr(String sid){
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Login where sid=?");
			query.setParameter(0, sid);
			query.setMaxResults(1);
			return (Login)query.uniqueResult();	
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}	
	}
	public void save(Login login){						//����ѧ��
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.save(login);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void update(Login login){						//�޸�ѧ����Ϣ
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.update(login);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
