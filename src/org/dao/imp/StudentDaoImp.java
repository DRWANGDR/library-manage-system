package org.dao.imp;
import java.util.*;
import org.dao.*;
import org.model.*;
import org.hibernate.*;
public class StudentDaoImp extends BaseDao implements StudentDao{
	/* ʵ�֣�ѧ����Ϣ��ѯ */
	public List findAll(int pageNow, int pageSize){			//��ʾ����ѧ����Ϣ
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Student order by sid");
			int firstResult=(pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list=query.list();
			ts.commit();
			session.close();
			session=null;
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public int findStudentSize(){							//��ѯһ���ж�����ѧ����¼
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			return session.createQuery("from Student").list().size();			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	/* ʵ�֣��鿴ĳ��ѧ������ϸ��Ϣ */
	public Student find(String sid){						//����ѧ�Ų�ѯĳѧ����Ϣ
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Student where sid=?");
			query.setParameter(0, sid);
			query.setMaxResults(1);
			Student student=(Student)query.uniqueResult();
			ts.commit();
			session.clear();
			return student;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}		
	}
	/* ʵ�֣�ɾ��ĳѧ����Ϣ */
	public void delete(String sid){						//����ѧ��ɾ��ѧ��
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Student student=find(sid);
			session.delete(student);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/* ʵ�֣��޸�ĳѧ����Ϣ */
	public void update(Student student){						//�޸�ѧ����Ϣ
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.update(student);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/* ʵ�֣�ѧ����Ϣ¼�� */
	public void save(Student student){						//����ѧ��
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.save(student);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
