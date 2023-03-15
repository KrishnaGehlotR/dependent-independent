package org.di.tester;

import org.di.bean.PenBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		PenBean penBean = container.getBean(PenBean.class);
		penBean.write();
	}
}
