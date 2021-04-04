package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class StudentServiceManage implements StudentService{
	//��XsDao��CjDao��������ע��
	private StudentDao studentDao;
	//////////private RecordDao recordDao;
	/* ҵ��ʵ�֣�ѧ����Ϣ��ѯ */
	public List findAll(int pageNow, int pageSize){		//��ʾ����ѧ����Ϣ
		return studentDao.findAll(pageNow, pageSize);
	}
	public int findStudentSize(){						//��ѯһ���ж�����ѧ����¼
		return studentDao.findStudentSize();
	}	
	/* ҵ��ʵ�֣��鿴ĳ��ѧ������ϸ��Ϣ */
	public Student find(String sid){					//����ѧ�Ų�ѯĳѧ����Ϣ
		return studentDao.find(sid);
	}	
	/* ҵ��ʵ�֣�ɾ��ĳѧ����Ϣ */
	public void delete(String sid){					//����ѧ��ɾ��ѧ��
		//////////recordDao.deleteOneStudentRecord(sid);
		studentDao.delete(sid);
	}	
	/* ҵ��ʵ�֣��޸�ĳѧ����Ϣ */
	public void update(Student student){					//�޸�ѧ����Ϣ
		studentDao.update(student);
	}	
	/* ҵ��ʵ�֣�ѧ����Ϣ¼�� */
	public void save(Student student){					//����ѧ��
		studentDao.save(student);
	}
	//ʡ��XsDao��CjDao��getter/setter����
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	/*public RecordDao getRecordDao() {
		return recordDao;
	}
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}*/
}