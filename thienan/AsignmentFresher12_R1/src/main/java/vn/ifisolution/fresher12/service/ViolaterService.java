package vn.ifisolution.fresher12.service;

import java.util.List;

import vn.ifisolution.fresher12.entity.Violaters;



public interface ViolaterService {
List<Violaters> findAll();
	
Violaters save(Violaters violater);
	
Violaters findOne(Integer id);
	
	void deleteById(Integer id);
	
	void deleteAll();

}
