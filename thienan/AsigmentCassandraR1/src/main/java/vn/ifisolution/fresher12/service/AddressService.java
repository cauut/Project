package vn.ifisolution.fresher12.service;

import java.util.List;

import vn.ifisolution.fresher12.entity.Addresses;

public interface AddressService {
	List<Addresses> findAll();

	Addresses getAddressById(int id);
	
	Addresses save(Addresses address);

	Addresses findOne(Integer id);

	void deleteById(Integer id);

	void deleteAll();
}
