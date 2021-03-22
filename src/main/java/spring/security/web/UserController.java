package spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.security.domain.User;
import spring.security.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired private UserService userService;	
	
	@GetMapping("/loginIn")
	public void loginIn() {}
	
	@GetMapping("/join")
	public String joinIn() {
		return "user/joinIn";
	}
	
	@PostMapping("/join")
	public String join(User user) {
		userService.addUser(user);
		
		return "redirect:../";
	}
}
