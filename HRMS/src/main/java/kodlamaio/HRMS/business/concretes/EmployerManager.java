package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getall() {
		return this.employerDao.findAll();
	}

	@Override
	public Employer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employer add(Employer employer) {
		return employerDao.save(employer);
	}

	@Override
	public void delete(int id) {
		employerDao.deleteById(id);
		
	}

	@Override
	public Employer update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
