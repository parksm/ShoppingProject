package exam.shop.dao;

import exam.shop.dto.User;

public interface UserDAO {
	//�α���
	User getUserByUserId(String userId,String userPwd);
	//ȸ������
	void regesterUser(User user);
	
	// ������ ��ť��Ƽ �α���
	public String getPassword(String UserId);
}
