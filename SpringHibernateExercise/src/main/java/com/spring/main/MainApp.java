package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.SangPendekar;
import com.spring.service.SangPendekarService;
import com.spring.service.SangPendekarServiceImpl;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		SangPendekarService sp = (SangPendekarService) ap.getBean("sangPendekar");
		
		
		SangPendekar sangPendekar = new SangPendekar();
		sangPendekar.setNamaPendekar("Bruce Lee");
		sangPendekar.setPerguruan("Mambo");
		sp.save(sangPendekar);
	
	}
}
