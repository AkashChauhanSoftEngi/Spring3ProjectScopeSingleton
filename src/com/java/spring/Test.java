package com.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/*
 * Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
 * We need a driver class to run Spring container class
 * */
public class Test {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		/*Only one object is created as by default it is singleton*/
		Student student1=(Student)factory.getBean("studentbean"); /*Reading From XML File*/
		Student student2=(Student)factory.getBean("studentbean"); /*Reading From XML File*/
		Student student3=(Student)factory.getBean("studentbean"); /*Reading From XML File*/
		
		System.out.println(student1 == student2);
		System.out.println(student2 == student3);
		
		student1.displayInfo();
	}
}
