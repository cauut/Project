package vn.ifisolution.fresher12.service;

import java.util.List;

import vn.ifisolution.fresher12.entity.Addresses;
import vn.ifisolution.fresher12.entity.Offcers;

public interface OffcersService {
 
	List<Offcers> findAll();
	
	Offcers getOffcersById(int id);
	
	Offcers save(Offcers offcers);
	
	
	Offcers findOne(Integer id);
	
	void deleteById(Integer id);
	
	void deleteAll();
}
