package vn.ifisolution.fresher12.service;

import java.util.List;

import vn.ifisolution.fresher12.entity.Violations;

public interface ViolationsService {
List<Violations> findAll();
	
Violations save(Violations violations);
	
Violations findOne(Integer id);
	
	void deleteById(Integer id);
	
	void deleteAll();
}
