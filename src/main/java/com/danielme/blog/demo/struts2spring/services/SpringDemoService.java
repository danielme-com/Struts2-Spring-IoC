package com.danielme.blog.demo.struts2spring.services;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class SpringDemoService 
{
	public Date getDateNow() 
	{
		return new Date();
	}
}
