package com.example.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author zhou
 * date 2017年3月9日 下午1:01:30
 * version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMailTest {

	@Autowired
	private JavaMailSender mailSender;
	@Test
	public void testSendMail(){
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom("252356262@qq.com");  //设置发件人
		mail.setTo("zhouke0515@gmail.com");    //设置收件人
		mail.setSubject("spring-boot mail test"); //设置标题 
		mail.setText("此邮件为测试spring-boo发送邮件");   //设置内容
		
		mailSender.send(mail);
	}
}
