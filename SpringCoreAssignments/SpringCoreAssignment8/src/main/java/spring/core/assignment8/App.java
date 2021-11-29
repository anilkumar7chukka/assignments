package spring.core.assignment8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext con= new ClassPathXmlApplicationContext("core8.xml");
		con.registerShutdownHook();
		Customer cus= (Customer) con.getBean("customer");
		System.out.println(cus);
	}

}