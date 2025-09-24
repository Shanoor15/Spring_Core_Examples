package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//Create IOC container
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Target Spring bean class object ref
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoke the B.method
		String result = generator.showWishMessage("Shanoor");
		System.out.println("Result: "+result);
		
		//close IOC Container
		//ctx.close();

	}

}
