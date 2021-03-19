package spring.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import spring.security.domain.User;

public interface UserService extends UserDetailsService {
	int addUser(User user);
}
