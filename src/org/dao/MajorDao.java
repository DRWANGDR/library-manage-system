package org.dao;
import org.model.*;
import java.util.*;
public interface MajorDao {
	/* ������ѧ����Ϣ��ѯ */
	public Major getOneMajor(Integer mid);	//����רҵID����רҵ��Ϣ
	
	/* �������޸�ĳѧ����Ϣ */
	public List getAll();					//��������רҵ��Ϣ��Ϊ����רҵ�����б��ã�
}
