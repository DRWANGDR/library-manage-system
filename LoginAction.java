package org.action;
import java.io.FileInputStream;
import java.util.*;
import org.model.*;
import org.service.*;
import com.opensymphony.xwork2.*;
public class LoginAction extends ActionSupport{
	private Login login;
	
	protected LoginService loginService;
	//�����û������ execute ����
	public String execute() throws Exception{
		boolean validated=false;						 //��֤�ɹ���ʶ
		Map session=ActionContext.getContext().getSession();	 //��ûỰ�����������浱ǰ��¼�û�����Ϣ
		Login login1=null;
		login1=(Login)session.get("login");
		if(login1==null){
			login1=loginService.find(login.getSid(), login.getPassword());
			if(login1!=null){
				session.put("login", login1);			//�� dl1 ����洢�ڻỰ��
				validated=true;				//��ʶΪ true ��ʾ��֤�ɹ�ͨ��
    		}
		}
        else{
        	validated=true;		//���û���֮ǰ�ѵ�¼�����ɹ���֤���ʱ�ʶΪ true ��ʾ��������֤��
        }
        if(validated){
        	//��֤�ɹ������ַ��� "success"
        	return SUCCESS;
        }
        else{
            //��֤ʧ�ܷ����ַ��� "error"
        	return ERROR;
        }
	}
	
	public String register() throws Exception{
		Login login1=new Login();
		if(loginService.findbyusr(login.getSid())!=null){	//ʹ��XsServiceҵ���߼��ӿ��е�find()�����ж�
			return ERROR;
		}
		login1.setSid(login.getSid());
		login1.setPassword(login.getPassword());
		loginService.save(login1);
		return SUCCESS;
	}
	
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
	
	
	public String updateLogin() throws Exception{
		Login login1=loginService.findbyusr(login.getSid());		//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�find()����
		login1.setPassword(login.getPassword());
		
		
		Map request=(Map)ActionContext.getContext().get("request");
		loginService.update(login1);				//ֱ��ʹ��XsServiceҵ���߼��ӿ��е�update()����
		return SUCCESS;
	}
}
