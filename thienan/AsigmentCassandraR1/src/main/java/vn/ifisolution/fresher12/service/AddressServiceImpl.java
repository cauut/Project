package vn.ifisolution.fresher12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Addresses;
import vn.ifisolution.fresher12.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService{
	@Autowired 
	private AddressRepository addressRepository;
	@Override
	public List<Addresses> findAll() {
		// TODO Auto-generated method stub
		return (List<Addresses>) addressRepository.findAll();
	}

	@Override
	public Addresses save(Addresses address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	@Override
	public Addresses findOne(Integer id) {
		// TODO Auto-generated method stub
		return addressRepository.findOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		addressRepository.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		addressRepository.deleteAll();
	}

	@Override
	public Addresses getAddressById(int id) {
		// TODO Auto-generated method stub
		return addressRepository.findOne(id);
	}

}
