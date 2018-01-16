package com.struts.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterSet implements Filter{
	
	@Override
	public void destroy() {
		System.out.println("---�ַ�������---");	
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("---�ַ������ÿ�ʼ---");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println("---�ַ������ý���---");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("--�ַ�����ʼ��--");
	}


}
