package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com\\di\\listBean.xml");
		InsaList il = (InsaList)context.getBean("insa");
		System.out.println(il.listBean);//["Hi","have.....","have a ..."]
		for(String msg:il.listBean) {
			System.out.println(msg);
		}
	}

}
