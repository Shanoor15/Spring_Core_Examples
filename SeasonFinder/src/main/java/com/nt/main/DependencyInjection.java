package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjection {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target Spring bean class object ref
		SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
		
		//invoke the B.method
		String result = finder.season("Shanoor");
		System.out.println(result);
		
		
	}

}
