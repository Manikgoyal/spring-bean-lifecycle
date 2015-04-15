package com.learning.service.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoBeanPostProcessor2 implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Calling Bean after Post Processor 2");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Calling Bean before Post Processor 2");
		return arg0;
	}

	@Override
	public int getOrder() {
		
		return 0;
	}

}
