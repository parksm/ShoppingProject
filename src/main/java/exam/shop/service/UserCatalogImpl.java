package exam.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.shop.dao.UserDAO;
import exam.shop.dao.UserDAOImpl;
import exam.shop.dto.User;
@Component
public class UserCatalogImpl implements UserCatalog {
	@Autowired
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
