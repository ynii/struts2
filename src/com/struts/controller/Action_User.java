package com.struts.controller;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Container;
import com.opensymphony.xwork2.util.ValueStack;

public class Action_User extends ActionSupport{

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
	 * 以下是继承父类方法
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
