package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.User;

public interface UserService {

	List<User> getall();
	User get(int id);
	User add(User user);
	void delete(int id);
	User update(User user);
}
