package com.csi.springscopeconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	     
		Customer custmer1 = (Customer)context.getBean("cc");
		
		custmer1.setCustId(1001);
		custmer1.setCustName("Prakash");
		
		System.out.println("\n Cust ID: "+custmer1.getCustId() +"\n Cust Name: " +custmer1.getCustName());
	   
		
		
		Customer custmer2 = (Customer)context.getBean("cc");
		System.out.println("\n Cust ID: "+custmer2.getCustId() +"\n Cust Name: " +custmer2.getCustName());
	
	}

}
