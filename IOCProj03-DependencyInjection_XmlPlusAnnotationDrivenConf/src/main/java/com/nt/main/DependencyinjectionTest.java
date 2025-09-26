package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyinjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()::--->Start");
		//Create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Target Spring bean class object ref
		SeasonFinder generator=ctx.getBean("sf",SeasonFinder.class);
				
		
		//invoke B.method
		String result = generator.showSeason("Shanoor");
		System.out.println(result);
		
		System.out.println("DependencyInjectionTest.main()::--->end");
	}

}
