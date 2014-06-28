package li.action;

import java.util.Date;
import java.util.UUID;

import li.model.TUser;
import li.service.UserServiceI;
import li.service.impl.UserServiceImpl;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ParentPackage("basePackage")
@Namespace("/")
@Action("userAction")
public class UserAction {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserAction.class);
	
	private UserServiceI usi;





	public UserServiceI getUsi() {
		return usi;
	}




	@Autowired
	public void setUsi(UserServiceI usi) {
		this.usi = usi;
	}





	public void test(){
		logger.info("进入action!");
		//ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		//UserServiceI usi = (UserServiceI)ac.getBean("userService");
		
		TUser t = new TUser();
		t.setId(UUID.randomUUID().toString());
		t.setCreateDate(new Date());
		t.setName("乱码测试");
		t.setPwd("lili");
		usi.save(t);
	}




}
