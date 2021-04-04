package org.dao.imp;
import java.util.*;
import org.dao.*;
import org.model.*;
import org.hibernate.*;
public class StudentDaoImp extends BaseDao implements StudentDao{
	/* 实现：学生信息查询 */
	public List findAll(int pageNow, int pageSize){			//显示所有学生信息
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
	public int findStudentSize(){							//查询一共有多少条学生记录
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			return session.createQuery("from Student").list().size();			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	/* 实现：查看某个学生的详细信息 */
	public Student find(String sid){						//根据学号查询某学生信息
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
	/* 实现：删除某学生信息 */
	public void delete(String sid){						//根据学号删除学生
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
	/* 实现：修改某学生信息 */
	public void update(Student student){						//修改学生信息
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
	/* 实现：学生信息录入 */
	public void save(Student student){						//插入学生
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
