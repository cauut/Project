package vn.ifisolution.fresher12.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Violaters;
import vn.ifisolution.fresher12.repositories.ViolatersRepository;

@Service("violaterService")
@Transactional
public class ViolatersServicelmpl implements ViolaterService{
	@Autowired
	ViolatersRepository violatersRepository;

	@Autowired
	public void setticketsRepository(ViolatersRepository violatersRepository) {
		this.violatersRepository = violatersRepository;
	}
	@Override
	public List<Violaters> findAll() {
		// TODO Auto-generated method stub
		return violatersRepository.findAll();
	}

	@Override
	public Violaters save(Violaters violater) {
		// TODO Auto-generated method stub
		return violatersRepository.save(violater);
	}

	@Override
	public Violaters findOne(Integer id) {
		// TODO Auto-generated method stub
		return violatersRepository.findOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		violatersRepository.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		violatersRepository.deleteAll();
	}

}
