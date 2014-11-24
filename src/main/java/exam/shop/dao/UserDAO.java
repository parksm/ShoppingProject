package exam.shop.dao;

import exam.shop.dto.User;

public interface UserDAO {
	//로그인
	User getUserByUserId(String userId,String userPwd);
	//회원가입
	void regesterUser(User user);
	
	// 스프링 시큐리티 로그인
	public String getPassword(String UserId);
}
