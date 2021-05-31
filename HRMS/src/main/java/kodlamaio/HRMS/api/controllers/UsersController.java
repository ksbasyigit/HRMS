package kodlamaio.HRMS.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.entities.User;

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
	public User add(@RequestBody User user) {
		return userService.add(user);
	}

	@GetMapping("/get/{id}")
	public User get(@PathVariable int id) {
		return userService.get(id);
	}
	//HATA: "Type definition error: [simple type, class org.hibernate.proxy.pojo.bytebuddy.
	//       ByteBuddyInterceptor]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: 
	//       No serializer found for class org.hibernate.proxy.pojo.bytebuddy.
	//       ByteBuddyInterceptor and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.
	//       FAIL_ON_EMPTY_BEANS) (through reference chain: kodlamaio.HRMS.entities.concretes.
	//       User$HibernateProxy$X62IzM7u[\"hibernateLazyInitializer\"])",
	// Hata çözümlenemedi.
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		userService.delete(id);
	}
}
