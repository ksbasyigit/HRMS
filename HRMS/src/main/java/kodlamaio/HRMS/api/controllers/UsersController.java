package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	public List<User> getall() {
		return userService.getall();
	}
	
	@PostMapping("/add")
	public void add(User user) {
		this.userService.add(user);
	}
}
