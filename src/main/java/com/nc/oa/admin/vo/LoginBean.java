package com.nc.oa.admin.vo;

/**
 * 登录接口封装对象
 * @author robin
 * @date May 29, 2020
 */
public class LoginBean {

	private String account;
	private String password;
	private String captcha;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	
}
