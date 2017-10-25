package vn.ifisolution.fresher12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.ifisolution.fresher12.entity.Offcers;
import vn.ifisolution.fresher12.repositories.OffcersRespository;

@Transactional
@Service("offcersService")
public class OffcersSevicelmpl implements OffcersService {

	@Autowired
	OffcersRespository offcersRepository;

	@Autowired
	public void setOffcersrepository(OffcersRespository offcersrepository) {
		this.offcersRepository = offcersrepository;
	}

	@Override
	public List<Offcers> findAll() {
		// TODO Auto-generated method stub
		return offcersRepository.findAll();
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
		;

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		offcersRepository.deleteAll();
	}

}
