package spring.security.dao;

import spring.security.domain.User;

public interface UserDao {
	User selectUser(String username);
	int insertUser(User user);
}
