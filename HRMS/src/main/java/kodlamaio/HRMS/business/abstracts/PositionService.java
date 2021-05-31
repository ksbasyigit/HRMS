package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.Position;

public interface PositionService {

	List<Position> getall();
	Position get(int id);
	Position add(Position position);
	void delete(int id);
	Position update(Position position);
}
