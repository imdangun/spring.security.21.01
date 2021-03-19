package spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import spring.security.web.LoginSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/res/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
			//.antMatchers("/**").permitAll()
			.antMatchers("/", "/user/loginIn", "/user/login", "/user/join").permitAll() // 인증 없이 접근할 수 있다.
			.anyRequest().authenticated() // 위 url별 설정 후, 마지막에 기술해야 한다.
			.and()
		.formLogin()
			.loginPage("/user/loginIn")
			.loginProcessingUrl("/user/login") // 해당 url의 handler는 spring security 가 준비한다.
			.usernameParameter("username")
			.passwordParameter("password")
			// defaultSuccessUrl 과 successHandler 가 없으면 successUrl 은 / 이다.
			//.defaultSuccessUrl("/") // successHandler 가 없을 때 작동한다.
			.successHandler(new LoginSuccessHandler())
			.failureUrl("/user/loginIn?msg=Login information is incorrect.")
			.and()
		.logout()
			.logoutUrl("/user/logout") // 해당 url의 handler는 spring security가 준비한다.
			.logoutSuccessUrl("/")
			.invalidateHttpSession(true);
	}
}
