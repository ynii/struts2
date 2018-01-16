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
		System.out.println("---监听器启动-----"+se.getSession().getId());
		//获取application对象
		ServletContext application = se.getSession().getServletContext();
		//从application 范围获取计数数据
		Integer c = (Integer) application.getAttribute("count");
		if(c==null){
			application.setAttribute("count", 1);
		}else{
			application.setAttribute("count", c+1);
		}
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("--监听器销毁--"+se.getSession().getId());
		//获取application 对象
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
