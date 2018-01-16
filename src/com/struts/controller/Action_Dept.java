package com.struts.controller;

import com.opensymphony.xwork2.Action;

public class Action_Dept implements Action{
	
	//实现接口方法
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String addDept(){
		System.out.println("--ActionDept---addDept-----");
		int i = 2;
		if(i>0){
			return "success";
		}else{
			return "failed";
		}
	}
	
	public String deleteDept(){
		System.out.println("--ActionDept---deleteDept-----");
		int i = -1;
		if(i>0){
			return "success_web_inf";
		}else{
			return "failed_web_inf";
		}
	}
	
	public String updateDept(){
		System.out.println("--ActionDept---updateDept-----");
		int i =0;
		if(i>0){
			return "success";
		}else{
			return "failed";
		}
	}
	
}
