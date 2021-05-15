package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.Employer;
import kodlamaio.HRMS.entities.concretes.Position;

public interface EmployerService {
	List<Employer> getall();
	Employer get(int id);
	Employer add(Employer employer);
	void delete(int id);
	Employer update(Employer employer);
}
