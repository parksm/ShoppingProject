package exam.shop.service;

import exam.shop.dto.User;

public interface UserCatalog {
	
	User getUserByUserId(String UserId,String userPwd);
	void registerUser(User user); 

}
