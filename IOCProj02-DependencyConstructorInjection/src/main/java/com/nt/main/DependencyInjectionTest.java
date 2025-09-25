package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()::--->Start");
		//Create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Target Spring bean class object ref
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
				
		
		//invoke B.method
		String result = generator.showWishMessage("Shanoor");
		System.out.println(result);
		
		System.out.println("DependencyInjectionTest.main()::--->end");
	}

}
