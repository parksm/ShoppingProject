package exam.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import exam.shop.dto.User;

public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User getUserByUserId(String userId, String userPwd) {
		
		String sql = "select * form users where user_id=? and user_pwd=?";
		
		User user = jdbcTemplate.queryForObject(sql, new Object[] {userId,userPwd}, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User(rs.getString("user_id"),
						rs.getString("user_pwd"),
						rs.getString("user_name"));
				
				return user;
			}
			
			
		});
		return user;
	}

	@Override
	public void regesterUser(User user) {
		String sql = "insert into users values(?,?,?)";
		
		int resuelt = jdbcTemplate.update(sql, user.getUserId(),user.getUserPwd(),user.getUserName());

	}

}
