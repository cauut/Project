package vn.ifisolution.fresher12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Addresses;
import vn.ifisolution.fresher12.entity.Offcers;
import vn.ifisolution.fresher12.repository.OffcersRepository;
@Service("OffcersService")
public class OffcersServicelmpl implements OffcersService {

	  @Autowired  
	    private OffcersRepository offcersRepository;

	   
	    public OffcersServicelmpl() {
	        super();    
	    }


		@Override
		public List<Offcers> findAll() {
			// TODO Auto-generated method stub
			return (List<Offcers>) offcersRepository.findAll() ;
		}


		@Override
		public Offcers save(Offcers offcers) {
			// TODO Auto-generated method stub
			return offcersRepository.save(offcers);
		}


		@Override
		public Offcers findOne(Integer id) {
			// TODO Auto-generated method stub
			return offcersRepository.findOne(id);
		}


		@Override
		public void deleteById(Integer id) {
			// TODO Auto-generated method stub
			offcersRepository.delete(id);
		}


		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			offcersRepository.deleteAll();
		}


		@Override
		public Offcers getOffcersById(int id) {
			// TODO Auto-generated method stub
			return offcersRepository.findById(id);
		}


	   

}
