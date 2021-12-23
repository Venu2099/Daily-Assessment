package samplenewproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee e = new Employee(); approach is not good at all
		ClassPathXmlApplicationContext applicationContext=
					new ClassPathXmlApplicationContext("NewFile.xml");
		order e=(order)applicationContext.getBean("order1");
		System.out.println(e);

	}

}