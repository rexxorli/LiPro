/**
 * 
 */
package li.test;

import li.service.UserServiceI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class TestSpring {

	/**
	 * 测试spring
	 * @param null
	 */
	@Test
	public void test() {
		//ApplicationContext ac = new FileSystemXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		//UserServiceI usi = (UserServiceI)ac.getBean("userService");
		//usi.test();
	}

}
