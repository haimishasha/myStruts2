package controller;

import service.UserInfoService;

public class Login {
	
	private String userName;
	
	private String password;
	
	public String getUserName() {
		
		return userName;
	}
	public void setUserName(String userName) {
		
		this.userName = userName;
	}
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String execute(){
		
		UserInfoService userRef = new UserInfoService();
		
		if(userRef.login(userName, password)){
			
			return "toSuccessJSP";
			
		}else{
			
			return "toErrorJSP";
		}
	}
}
