import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee e = new Employee(); approach is not good at all
		ClassPathXmlApplicationContext applicationContext=
					new ClassPathXmlApplicationContext("myspring.xml");
		Employee e=(Employee)applicationContext.getBean("emp123");
		System.out.println(e);

	}

}
