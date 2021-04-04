package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class MajorServiceManage implements MajorService{
	private MajorDao majorDao;						//对ZyDao进行依赖注入
	
	/* 业务实现：学生信息查询 */
	public Major getOneMajor(Integer mid){		//根据专业ID查找专业信息
		return majorDao.getOneMajor(mid);
	}	
	/* 业务实现：修改某学生信息 */
	public List getAll(){						//查找所有专业信息（为加载专业下拉列表用）
		return majorDao.getAll();
	}
	public MajorDao getMajorDao() {
		return majorDao;
	}
	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}
}
