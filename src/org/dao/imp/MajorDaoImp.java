package org.dao.imp;
import java.util.*;
import org.dao.*;
import org.hibernate.*;
import org.model.*;
public class MajorDaoImp extends BaseDao implements MajorDao{
	/* 实现：学生信息查询 */
	public Major getOneMajor(Integer mid){		//根据专业ID查找专业信息
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
	/* 实现：修改某学生信息 */
	public List getAll(){					//查找所有专业信息（为加载专业下拉列表用）
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