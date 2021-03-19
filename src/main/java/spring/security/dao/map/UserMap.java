package spring.security.dao.map;

import spring.security.domain.User;

public interface UserMap {
	User selectUser(String username);
	int insertUser(User user);
}
