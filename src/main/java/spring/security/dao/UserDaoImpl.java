package spring.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.security.dao.map.UserMap;
import spring.security.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired private UserMap userMap;
	
	public User selectUser(String username) {
		return userMap.selectUser(username);
	}
	
	public int insertUser(User user) {
		return userMap.insertUser(user);
	}
}
