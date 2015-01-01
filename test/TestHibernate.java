import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.innovatis.dao.AttrDao;
import com.innovatis.dao.UserDao;
import com.innovatis.dao.impl.UserDaoImpl;
import com.innovatis.model.Attribute;
import com.innovatis.model.Hr;
import com.innovatis.model.Tier1;
import com.innovatis.model.User;
import com.innovatis.service.HrService;
import com.innovatis.service.Tier1Service;
import com.innovatis.service.UserService;
import com.innovatis.service.impl.UserServiceImpl;


public class TestHibernate {

	@Test
	public void testSave() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService us = (UserService)ctx.getBean("userService");
		User u = new User();
		//u.setId(1);
		u.setName("b");
		u.setTrueName("b");
		u.setPassword("b");
		us.add(u);
	}
	
	@Test
	public void testSaveHR() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		HrService htd = (HrService)ctx.getBean("hrService");
		Hr hr = new Hr();
		hr.setT1Id("1");
		hr.setT1Name("aaaa");
		htd.addHr(hr);
	}
	
	
	@Test
	public void testGet(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService us = (UserService)ctx.getBean("userService");
		User u = new User();
		u = us.getUserById(2);
		System.out.println(u.getName());
	}
	
	@Test
	public void testDel(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService us = (UserService)ctx.getBean("userService");
		User u = new User();
		u.setId(3);
		us.delete(u);
	}
	
	@Test
	public void testUpd(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Tier1Service ts = (Tier1Service)ctx.getBean("tier1Service");
		Tier1 t1 = new Tier1();
		t1.setId(6);
		t1.setTier1Id("04");
		t1.setTier1Name("bbb");
		t1.setTier1SalaryId("1");
		t1.setTier1SaleId("2");
		ts.updateT1(t1);*/
		
		UserService us = (UserService) ctx.getBean("userService");
		User u = us.getUserById(2);
		u.setName("c");
		u.setPassword("c");
		u.setTrueName("c");
		us.update(u);
	}
	
	@Test
	public void testPage(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService)ctx.getBean("userService");
		String hql = "from User";
		int pageSize = 3;
		int pageNow = 1;
		List<User> results = us.getUserByPage(pageSize, pageNow,hql);
		for(User user:results){
			System.out.println(user.getName()+"----"+user.getPassword());
		}
	}
	
	@Test
	public void testHasUser(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService)ctx.getBean("userService");
		User user = new User();
		user.setName("a");
		user.setPassword("a");
		if(us.exists(user)) {
			System.out.println("OK");
		};
	}
	
	@Test
	public void testFindByProperty(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AttrDao ad = (AttrDao) ctx.getBean("attrDao");
		List<Attribute> res = ad.findByProperty("attrKind" , "民族");
		for (Attribute attr:res){
			System.out.println(attr.getAttrKind()+"----"+attr.getAttrName());
		}
	}
	
	@Test
	public void testCreateHrId(){
		int randomNum = 1000 + (int)(Math.random()*8999);
		String hrId = "QW"+randomNum;
		System.out.println(hrId);
	}
}
