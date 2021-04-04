package org.dao;
import java.util.*;
import org.model.*;
public interface StudentDao {
	/* ������ѧ����Ϣ��ѯ */
	public List findAll(int pageNow, int pageSize);			//��ʾ����ѧ����Ϣ
	public int findStudentSize();							//��ѯһ���ж�����ѧ����¼
	
	/* �������鿴ĳ��ѧ������ϸ��Ϣ */
	public Student find(String sid);						//����ѧ�Ų�ѯĳѧ����Ϣ
	
	/* ������ɾ��ĳѧ����Ϣ */
	public void delete(String sid);						//����ѧ��ɾ��ѧ��
	
	/* �������޸�ĳѧ����Ϣ */
	public void update(Student student);						//�޸�ѧ����Ϣ
	
	/* ������ѧ����Ϣ¼�� */
	public void save(Student student);						//����ѧ��
}
