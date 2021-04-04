package org.service;
import java.util.*;
import org.model.*;
public interface StudentService {
	/* 服务：学生信息查询 */
	public List findAll(int pageNow, int pageSize);		//显示所有学生信息
	public int findStudentSize();						//查询一共有多少条学生记录
	
	/* 服务：查看某个学生的详细信息 */
	public Student find(String sid);					//根据学号查询某学生信息
	
	/* 服务：删除某学生信息 */
	public void delete(String sid);					//根据学号删除学生
	
	/* 服务：修改某学生信息 */
	public void update(Student student);					//修改学生信息
	
	/* 服务：学生信息录入 */
	public void save(Student student);					//插入学生
}
