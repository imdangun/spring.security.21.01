package spring.security.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
	private String username;
	private String password;
	
	@Builder
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
