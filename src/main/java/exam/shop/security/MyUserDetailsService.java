package exam.shop.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import exam.shop.dao.UserDAOImpl;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDAOImpl userDAOImpl;

	public MyUserDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String UserId)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		String userPwd = userDAOImpl.getPassword(UserId);
		
		List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		UserDetails user = new MyUserDetails(UserId, userPwd);
		return user;
	}

}
