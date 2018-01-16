package com.struts.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.inject.Container;
import com.opensymphony.xwork2.util.ValueStack;
import com.struts.model.ModelUser;

public class Action_User extends ActionSupport implements ModelDriven<ModelUser> ,ServletRequestAware,SessionAware,ServletContextAware,ServletResponseAware{

	
	/**
	 * ͨ��ʵ�ֽӿڻ�ȡ�Ĵ��� ����
	 * 
	 */
	private HttpServletResponse response;
	private ServletContext application;
	private HttpServletRequest request;
	private Map<String, Object> session;
	private String name;
	private String sex;
	private Integer age;
	private ModelUser user = new ModelUser();//ͨ����������
	
	/*
	 * ͨ��ʵ�� ModelDriver�� �ӿڣ�����ģ������ ȡֵ
	 */
	@Override
	public ModelUser getModel() {
		return user;	
	}
	
	
	/*
	 * ͨ���������� ��ֵ
	 * public ModelUser getUser() {
		return user;
	}
	public void setUser(ModelUser user) {
		this.user = user;
	}*/


	public String a(){
		System.out.println(user+"--����A����--ģ��toString--"+user.toString());
		System.out.println("--��������--name----   "+name);
		System.out.println("--��������----sex----    "+sex);
		System.out.println("--��������--age----   "+age);
		System.out.println("--------@_@---------@_@---------@_@---------");
		System.out.println("--����A����----");
		System.out.println("--��������--name----   "+user.getName());
		System.out.println("---��������---sex----    "+user.getSex());
		System.out.println("--��������--age----   "+user.getAge());
		System.out.println("--------@_@---------@_@---------@_@---------");
		System.out.println("--����A����----");
		System.out.println("--ģ������--name----   "+user.getName());
		System.out.println("---ģ������---sex----    "+user.getSex());
		System.out.println("--ģ������--age----   "+user.getAge());
		
		return "success";
	}
	
	
/*	
 * ͨ������������ֵ �Ͷ���û��ϵ
 * public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}*/

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	
	/**
	 * ͨ�� ServletActionContext ���ȡ�� request   response   application   session  pageContext;
	 * @return
	 */
	public String qqq(){
		HttpServletRequest request = ServletActionContext.getRequest();
		ServletActionContext.getRequest().getSession().setAttribute("aaa", 500);
		ServletActionContext.getRequest().setAttribute("aaaa", 555);
		ServletActionContext.getServletContext().setAttribute("aaaaa", 900);
		try {
			ServletActionContext.getResponse().sendRedirect("aaa.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ServletActionContext.getRequest().getRequestDispatcher("bbb.jsp").forward(ServletActionContext.getRequest(), ServletActionContext.getResponse());
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
	}
	
	/**
	 * ------------------------------------------------------------------------------------
	 * 
	 * 
	 *
	 * @return
	 */
	public String addUser(){
		System.out.println("--ActionUser---adduser-----");
		int i = 2;
		if(i>0){
			return "success_web_inf";
		}else{
			return "failed_web_inf";
		}
	}
	
	public String deleteUser(){
		System.out.println("--ActionUser---deleteUser-----");
		int i = -1;
		if(i>0){
			return "success";
		}else{
			return "failed";
		}
	}
	
	public String updateUser(){
		System.out.println("--ActionUser---updateUser-----");
		int i =0;
		if(i>0){
			return "success";
		}else{
			return "failed";
		}
	}
	
	
	
	
	
	/**
	 * ------------------------------------------------------------
	 * �����Ǽ̳и��෽��
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "succeess";
	}
	
	@Override
	public void addActionError(String anErrorMessage) {
		// TODO Auto-generated method stub
		super.addActionError(anErrorMessage);
	}

	@Override
	public void addActionMessage(String aMessage) {
		// TODO Auto-generated method stub
		super.addActionMessage(aMessage);
	}

	@Override
	public void addFieldError(String fieldName, String errorMessage) {
		// TODO Auto-generated method stub
		super.addFieldError(fieldName, errorMessage);
	}

	@Override
	public void clearActionErrors() {
		// TODO Auto-generated method stub
		super.clearActionErrors();
	}

	@Override
	public void clearErrors() {
		// TODO Auto-generated method stub
		super.clearErrors();
	}

	@Override
	public void clearErrorsAndMessages() {
		// TODO Auto-generated method stub
		super.clearErrorsAndMessages();
	}

	@Override
	public void clearFieldErrors() {
		// TODO Auto-generated method stub
		super.clearFieldErrors();
	}

	@Override
	public void clearMessages() {
		// TODO Auto-generated method stub
		super.clearMessages();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String doDefault() throws Exception {
		// TODO Auto-generated method stub
		return super.doDefault();
	}

	

	@Override
	public Collection<String> getActionErrors() {
		// TODO Auto-generated method stub
		return super.getActionErrors();
	}

	@Override
	public Collection<String> getActionMessages() {
		// TODO Auto-generated method stub
		return super.getActionMessages();
	}

	@Override
	public Collection<String> getErrorMessages() {
		// TODO Auto-generated method stub
		return super.getErrorMessages();
	}

	@Override
	public Map<String, List<String>> getErrors() {
		// TODO Auto-generated method stub
		return super.getErrors();
	}

	@Override
	public Map<String, List<String>> getFieldErrors() {
		// TODO Auto-generated method stub
		return super.getFieldErrors();
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return super.getLocale();
	}

	@Override
	public String getText(String aTextName, List<Object> args) {
		// TODO Auto-generated method stub
		return super.getText(aTextName, args);
	}

	@Override
	public String getText(String key, String defaultValue, List<Object> args,
			ValueStack stack) {
		// TODO Auto-generated method stub
		return super.getText(key, defaultValue, args, stack);
	}

	@Override
	public String getText(String aTextName, String defaultValue,
			List<Object> args) {
		// TODO Auto-generated method stub
		return super.getText(aTextName, defaultValue, args);
	}

	@Override
	public String getText(String aTextName, String defaultValue, String obj) {
		// TODO Auto-generated method stub
		return super.getText(aTextName, defaultValue, obj);
	}

	@Override
	public String getText(String key, String defaultValue, String[] args,
			ValueStack stack) {
		// TODO Auto-generated method stub
		return super.getText(key, defaultValue, args, stack);
	}

	@Override
	public String getText(String key, String defaultValue, String[] args) {
		// TODO Auto-generated method stub
		return super.getText(key, defaultValue, args);
	}

	@Override
	public String getText(String aTextName, String defaultValue) {
		// TODO Auto-generated method stub
		return super.getText(aTextName, defaultValue);
	}

	@Override
	public String getText(String key, String[] args) {
		// TODO Auto-generated method stub
		return super.getText(key, args);
	}

	@Override
	public String getText(String aTextName) {
		// TODO Auto-generated method stub
		return super.getText(aTextName);
	}

	@Override
	public ResourceBundle getTexts() {
		// TODO Auto-generated method stub
		return super.getTexts();
	}

	@Override
	public ResourceBundle getTexts(String aBundleName) {
		// TODO Auto-generated method stub
		return super.getTexts(aBundleName);
	}

	@Override
	public boolean hasActionErrors() {
		// TODO Auto-generated method stub
		return super.hasActionErrors();
	}

	@Override
	public boolean hasActionMessages() {
		// TODO Auto-generated method stub
		return super.hasActionMessages();
	}

	@Override
	public boolean hasErrors() {
		// TODO Auto-generated method stub
		return super.hasErrors();
	}

	@Override
	public boolean hasFieldErrors() {
		// TODO Auto-generated method stub
		return super.hasFieldErrors();
	}

	@Override
	public boolean hasKey(String key) {
		// TODO Auto-generated method stub
		return super.hasKey(key);
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return super.input();
	}

	@Override
	public void pause(String result) {
		// TODO Auto-generated method stub
		super.pause(result);
	}

	@Override
	public void setActionErrors(Collection<String> errorMessages) {
		// TODO Auto-generated method stub
		super.setActionErrors(errorMessages);
	}

	@Override
	public void setActionMessages(Collection<String> messages) {
		// TODO Auto-generated method stub
		super.setActionMessages(messages);
	}

	@Override
	public void setContainer(Container container) {
		// TODO Auto-generated method stub
		super.setContainer(container);
	}

	@Override
	public void setFieldErrors(Map<String, List<String>> errorMap) {
		// TODO Auto-generated method stub
		super.setFieldErrors(errorMap);
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}
	

	

	
	
}
