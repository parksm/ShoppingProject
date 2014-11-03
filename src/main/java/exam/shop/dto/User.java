package exam.shop.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty
	private String userId;
	private String userPwd;
	@Size(min=4,max=10)
	private String userName;
	
	public User()
	{
		
	}

	public User(String userId, String userPwd,String userName) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
