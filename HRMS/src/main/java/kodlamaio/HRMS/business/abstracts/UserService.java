package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.User;

public interface UserService {

	List<User> getall();
	void add(User user);
}
