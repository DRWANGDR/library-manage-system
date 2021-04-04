package org.action;
import java.util.*;
import java.io.*;
import org.model.*;
import org.service.*;
import org.tool.*;
import com.opensymphony.xwork2.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.*;
public class StudentAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Student student;
	private StudentService studentService;
	/* Action ģ�飺�޸�ĳѧ����Ϣ */
	private MajorService majorService;				//���ڲ�������רҵ��Ϣ�Լ���רҵ�����б�
	private File photoFile;					//���ڻ�ȡ��Ƭ�ļ�
	/* Action ģ�飺ѧ����Ϣ¼�� */
	private List list;						//���רҵ����	
	/* Action ģ�飺ѧ����Ϣ��ѯ */
	public String execute() throws Exception{		//��ʾ����ѧ����Ϣ
		List list=studentService.findAll(pageNow,pageSize);
		Map request=(Map)ActionContext.getContext().get("request");
		Pager page=new Pager(getPageNow(),studentService.findStudentSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	
	public String findStudent() throws Exception{
		String sid=student.getSid();
		Student stu=studentService.find(sid);			//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�find()����
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("student", stu);
		return SUCCESS;
	}

	public String getImage() throws Exception{
		HttpServletResponse response=ServletActionContext.getResponse();
		String sid=student.getSid();
		Student stu=studentService.find(sid);	//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�find()����
		byte[] img=stu.getPhoto();
		response.setContentType("image/jpeg");
		ServletOutputStream os=response.getOutputStream();
		if(img!=null&&img.length!=0){
			for(int i=0; i<img.length; i++){
				os.write(img[i]);
			}
			os.flush();
		}
		return NONE;
	}

	public String deleteStudent() throws Exception{
		String sid=student.getSid();
		studentService.delete(sid);	      //ֱ��ʹ��XsServiceҵ���߼��ӿ��е�delete()����
		return SUCCESS;
	}

	public String updateStudentView() throws Exception{
		String sid=student.getSid();
		Student studentInfo=studentService.find(sid);		//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�find()����
		List majors=majorService.getAll();			//ֱ��ʹ��ZyServiceҵ���߼��ӿ��е�getAll()����
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("studentInfo", studentInfo);
		request.put("majors", majors);
		return SUCCESS;
	}
	//ִ���޸Ĳ���
	public String updateStudent() throws Exception{
		Student student1=studentService.find(student.getSid());		//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�find()����
		student1.setName(student.getName());
		student1.setGender(student.getGender());
		//ֱ��ʹ��ZyServiceҵ���߼��ӿ��е�getOneZy()����
		student1.setMajor(majorService.getOneMajor(student.getMajor().getMid()));
		student1.setBirthday(student.getBirthday());
		student1.setCredit(student.getCredit());
		student1.setRemarks(student.getRemarks());
		if(this.getPhotoFile()!=null){
			FileInputStream fis=new FileInputStream(this.getPhotoFile());
			byte[] buffer=new byte[fis.available()];
			fis.read(buffer);
			student1.setPhoto(buffer);
		}
		Map request=(Map)ActionContext.getContext().get("request");
		studentService.update(student1);				//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�update()����
		return SUCCESS;
	}
	
	public String addStudentView() throws Exception{
		return SUCCESS;
	}
	//ִ��¼�����
	public String addStudent() throws Exception{
		Student stu=new Student();
		String sid1=student.getSid();
		//ѧ���Ѵ��ڣ������ظ�¼��
		if(studentService.find(sid1)!=null){	//ʹ��XsServiceҵ���߼��ӿ��е�find()�����ж�
			return ERROR;
		}
		stu.setSid(student.getSid());
		stu.setName(student.getName());
		stu.setGender(student.getGender());
		stu.setBirthday(student.getBirthday());
		stu.setCredit(student.getCredit());
		stu.setRemarks(student.getRemarks());
		//ֱ��ʹ��ZyServiceҵ���߼��ӿ��е�getOneZy()����
		stu.setMajor(majorService.getOneMajor(student.getMajor().getMid()));
		if(this.getPhotoFile()!=null){
			FileInputStream fis=new FileInputStream(this.getPhotoFile());
			byte[] buffer=new byte[fis.available()];
			fis.read(buffer);
			stu.setPhoto(buffer);
		}
		studentService.save(stu);
		return SUCCESS;
	}
	
	public Student getStudent(){
		return student;
	}
	public void setStudent(Student student){
		this.student = student;
	}
	
	public StudentService getStudentService(){
		return studentService;
	}
	public void setStudentService(StudentService studentService){
		this.studentService = studentService;
	}
	
	/* Action ģ�飺�޸�ĳѧ����Ϣ */
	public MajorService getMajorService(){
		return majorService;
	}
	public void setMajorService(MajorService majorService){
		this.majorService = majorService;
	}
	
	public File getPhotoFile(){
		return photoFile;
	}
	public void setPhotoFile(File photoFile){
		this.photoFile = photoFile;
	}
	//
	/* Action ģ�飺ѧ����Ϣ¼�� */
	public List getList(){
		return majorService.getAll();			//����רҵ�ļ���
	}
	public void setList(List list){
		this.list = list;
	}
	//
	public int getPageNow(){
		return pageNow;
	}
	public void setPageNow(int pageNow){
		this.pageNow = pageNow;
	}
	
	public int getPageSize(){
		return pageSize;
	}
	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}
}
