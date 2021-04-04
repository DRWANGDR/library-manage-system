package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class MajorServiceManage implements MajorService{
	private MajorDao majorDao;						//��ZyDao��������ע��
	
	/* ҵ��ʵ�֣�ѧ����Ϣ��ѯ */
	public Major getOneMajor(Integer mid){		//����רҵID����רҵ��Ϣ
		return majorDao.getOneMajor(mid);
	}	
	/* ҵ��ʵ�֣��޸�ĳѧ����Ϣ */
	public List getAll(){						//��������רҵ��Ϣ��Ϊ����רҵ�����б��ã�
		return majorDao.getAll();
	}
	public MajorDao getMajorDao() {
		return majorDao;
	}
	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}
}
