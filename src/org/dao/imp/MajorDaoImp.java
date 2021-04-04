package org.dao.imp;
import java.util.*;
import org.dao.*;
import org.hibernate.*;
import org.model.*;
public class MajorDaoImp extends BaseDao implements MajorDao{
	/* ʵ�֣�ѧ����Ϣ��ѯ */
	public Major getOneMajor(Integer mid){		//����רҵID����רҵ��Ϣ
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Major where mid=?");
			query.setParameter(0, mid);
			query.setMaxResults(1);
			return (Major)query.uniqueResult();	
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}		
	}
	/* ʵ�֣��޸�ĳѧ����Ϣ */
	public List getAll(){					//��������רҵ��Ϣ��Ϊ����רҵ�����б��ã�
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			List list=session.createQuery("from Major order by mid").list();
			ts.commit();
			session.close();
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}		
	}
}