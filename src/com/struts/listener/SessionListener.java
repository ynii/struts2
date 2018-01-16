package com.struts.listener;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.catalina.SessionEvent;

public class SessionListener implements HttpSessionListener,HttpSessionAttributeListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("---����������-----"+se.getSession().getId());
		//��ȡapplication����
		ServletContext application = se.getSession().getServletContext();
		//��application ��Χ��ȡ��������
		Integer c = (Integer) application.getAttribute("count");
		if(c==null){
			application.setAttribute("count", 1);
		}else{
			application.setAttribute("count", c+1);
		}
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("--����������--"+se.getSession().getId());
		//��ȡapplication ����
		ServletContext application = se.getSession().getServletContext();
		Integer c = (Integer) application.getAttribute("count");
		if(c!=null){
			application.setAttribute("count", c-1);
		}
		
		
	}
	
///////////////////////////////////////////////////////////////	

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
