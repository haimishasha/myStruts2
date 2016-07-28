package service;

public class UserInfoService {
	
	public boolean login(String userName,String password){
		
		if(userName.equals("root") && password.equals("root")){
			
			return true;
			
		}else{
			
			return false;
		}
	}
}
