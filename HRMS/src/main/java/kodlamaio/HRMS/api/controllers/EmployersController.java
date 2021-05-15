package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService employerService;
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public List<Employer> getall(){
		return employerService.getall(); 
	}
	@PostMapping("/add")
	public Employer add(@RequestBody Employer employer) {
		return employerService.add(employer);
	}

	@GetMapping("/get/{id}")
	public Employer get(@PathVariable int id) {
		return employerService.get(id);
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		employerService.delete(id);
	}
}
