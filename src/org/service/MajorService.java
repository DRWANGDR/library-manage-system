package org.service;
import java.util.*;
import org.model.*;
public interface MajorService {
	/* ����ѧ����Ϣ��ѯ */
	public Major getOneMajor(Integer mid);	//����רҵID����רҵ��Ϣ
	
	/* �����޸�ĳѧ����Ϣ */
	public List getAll();						//��������רҵ��Ϣ��Ϊ����רҵ�����б��ã�
}
