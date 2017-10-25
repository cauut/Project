package vn.ifisolution.fresher12.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Violations;
import vn.ifisolution.fresher12.repositories.ViolationsRespository;
@Service("violationsService")
@Transactional
public class ViolationsServicelmpl implements ViolationsService {
	@Autowired
	ViolationsRespository violationsRespository;

	@Autowired
	public void setViolationsRespository(ViolationsRespository violationsRespository) {
		this.violationsRespository = violationsRespository;
	}

	@Override
	public List<Violations> findAll() {
		// TODO Auto-generated method stub
		return violationsRespository.findAll();
	}

	@Override
	public Violations save(Violations violations) {
		// TODO Auto-generated method stub
		return violationsRespository.save(violations);
	}

	@Override
	public Violations findOne(Integer id) {
		// TODO Auto-generated method stub
		return violationsRespository.findOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		violationsRespository.delete(id);
		;

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		violationsRespository.deleteAll();
	}
}
