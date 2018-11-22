package com.robb.manager;

import java.util.HashMap;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import com.robb.common.RobbReponse;

@Component
public class TestManager {

	public RobbReponse name() {
		ApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
		for (String element : beanFactory.getBeanDefinitionNames()) {
			System.out.println("--------------------:"+element);
		}
		
		for (String element : beanFactory.getSingletonNames()) {
			System.out.println("--------------------:-"+element);
		}


		Object ooObject = beanFactory.getParentBeanFactory().getBean("robbController");
		Object robbController = context.getBean("robbController");
		Object robbManager = context.getBean("robbManager");
		return RobbReponse.addSuccessResponse("ok", new HashMap<String, Object>());
	}
}
