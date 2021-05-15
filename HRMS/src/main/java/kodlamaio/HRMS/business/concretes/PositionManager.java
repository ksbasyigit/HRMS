package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.PositionService;
import kodlamaio.HRMS.dataAccess.abstracts.PositionDao;
import kodlamaio.HRMS.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
	@Override
	public List<Position> getall() {
		return this.positionDao.findAll();
	}
	@Override
	public Position get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Position add(Position position) {
		return positionDao.save(position);
		
	}
	@Override
	public void delete(int id) {
		positionDao.deleteById(id);
		
	}
	@Override
	public Position update(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

}
