package exam.shop.dto;

public class User {
	private String userId;
	private String userPwd;
	private String userName;

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
