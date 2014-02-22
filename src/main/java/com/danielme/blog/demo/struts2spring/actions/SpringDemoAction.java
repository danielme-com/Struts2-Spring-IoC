package com.danielme.blog.demo.struts2spring.actions;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.danielme.blog.demo.struts2spring.services.SpringDemoService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author danielme.com
 *
 */
@Component("springDemoAction")
@Scope(value="session")
public class SpringDemoAction extends ActionSupport
{			
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SpringDemoService springDemoService;
		
	public String execute() 
	{
        return SUCCESS;
    }
	
	public String getDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat(getText("pattern"));
		return sdf.format(springDemoService.getDateNow());				
	}
	
	public String getId()
	{
		return this.toString();
	}
	
//	public void setSpringDemoService(SpringDemoService springDemoService) {
//		this.springDemoService = springDemoService;
//	}
    

}