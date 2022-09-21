package com.sky;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestSpring {
	public static void main(String[] args) {
		System.out.println("before call");
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		
		//Spring AOP
		ApplicationService service = (ApplicationService)beanFactory.getBean(ApplicationService.class);
		service.processApplication();
	}

}
