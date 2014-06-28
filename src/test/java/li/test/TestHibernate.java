package li.test;

import java.util.Date;

import li.model.TUser;
import li.service.UserServiceI;

import org.jgroups.util.UUID;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHibernate {
	@Test
	public void test(){
		//ApplicationContext ac = new FileSystemXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		//UserServiceI usi = (UserServiceI)ac.getBean("userService");
		//TUser t = new TUser();
		//t.setId(UUID.randomUUID().toString());
		//t.setCreateDate(new Date());
		//t.setName("李立");
		//t.setPwd("lili");
		//usi.save(t);
	}
}
