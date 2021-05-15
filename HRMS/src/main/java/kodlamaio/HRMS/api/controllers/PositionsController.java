package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.PositionService;
import kodlamaio.HRMS.entities.concretes.Position;

@RestController
@RequestMapping ("/api/positions")
public class PositionsController {
	
	
	private PositionService positionService;
	
	@Autowired
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public List<Position> getall(){
		return positionService.getall();
	}

	@PostMapping("/add")
	public Position add(@RequestBody Position position) {
		return positionService.add(position);
	}

	@GetMapping("/get/{id}")
	public Position get(@PathVariable int id) {
		return positionService.get(id);
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		positionService.delete(id);
	}
}
