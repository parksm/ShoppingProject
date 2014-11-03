package exam.shop.service;

import exam.shop.dao.UserDAO;
import exam.shop.dao.UserDAOImpl;
import exam.shop.dto.User;

public class UserCatalogImpl implements UserCatalog {

	private UserDAOImpl userDAOImpl;
	
	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}
	@Override
	public User getUserByUserId(String UserId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerUser(User user) {
		userDAOImpl.regesterUser(user);
	}

}
