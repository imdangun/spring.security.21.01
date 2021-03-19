package spring.security.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import spring.security.dao.UserDao;
import spring.security.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;
	@Autowired private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.selectUser(username);
		if(user == null) throw new UsernameNotFoundException("해당 사용자가 없습니다.");
		
		return new org.springframework.security.core.userdetails.User(
				user.getUsername(), user.getPassword(),
				Arrays.asList(new SimpleGrantedAuthority("user")));
	}
	
	@Override
	public int addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userDao.insertUser(user);
	}
}
