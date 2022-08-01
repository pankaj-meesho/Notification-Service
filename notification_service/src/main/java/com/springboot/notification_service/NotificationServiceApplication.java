package com.springboot.notification_service;

import  com.springboot.notification_service.model.SMS;
import  com.springboot.notification_service.repository.SMSRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@Autowired
	private SMSRepository smsRepository;

	@Override
	public void run(String... args) throws Exception {
//		SMS sms = new SMS();
//		sms.setPhoneNumber("+919892765124");
//		sms.setMessage("Hi");
////		sms.setEmailId("ramesh@gmail.com");
//		smsRepository.save(sms);
//
//		SMS sms1 = new SMS();
//		sms1.setPhoneNumber("+917867564312");
//		sms1.setMessage("Good one");
////		sms1.setEmailId("cena@gmail.com");
//		smsRepository.save(sms1);
	}
}
