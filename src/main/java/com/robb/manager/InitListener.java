package com.robb.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitListener implements ApplicationContextAware,
		ApplicationListener<ContextRefreshedEvent>, InitializingBean, DisposableBean {
	private static Logger logger = LoggerFactory.getLogger(InitListener.class);

	private ApplicationContext context ;
	public void destroy() throws Exception {
		logger.error("class:{} destroy", getClass());
	}

	public void afterPropertiesSet() throws Exception {
		logger.error("class:{} inited", getClass());
		
	}

	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() == null) {
			logger.error("ContextRefreshed, ApplicationContext:{}", event.getApplicationContext());
		}
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
		logger.error("setApplicationContext, ApplicationContext:{}", applicationContext);

		for (String bdn : context.getBeanDefinitionNames()) {
			logger.error("setApplicationContext, ApplicationContext.bdn:{}", bdn);
		}
	}

}
