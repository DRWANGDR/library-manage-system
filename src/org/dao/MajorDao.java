package org.dao;
import org.model.*;
import java.util.*;
public interface MajorDao {
	/* 方法：学生信息查询 */
	public Major getOneMajor(Integer mid);	//根据专业ID查找专业信息
	
	/* 方法：修改某学生信息 */
	public List getAll();					//查找所有专业信息（为加载专业下拉列表用）
}
