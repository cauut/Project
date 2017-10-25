package vn.ifisolution.fresher12.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Tickets;
import vn.ifisolution.fresher12.repositories.TicketsRepository;

@Service("ticketService")
@Transactional
public class TicketsServicelmpl implements TicketsService{

	@Autowired
	TicketsRepository ticketsRepository;

	@Autowired
	public void setticketsRepository(TicketsRepository ticketsRepository) {
		this.ticketsRepository = ticketsRepository;
	}
	@Override
	public List<Tickets> findAll() {
		// TODO Auto-generated method stub
		return ticketsRepository.findAll();
	}

	@Override
	public Tickets save(Tickets tickets) {
		// TODO Auto-generated method stub
		return ticketsRepository.save(tickets);
	}

	@Override
	public Tickets findOne(Integer id) {
		// TODO Auto-generated method stub
		return ticketsRepository.findOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		ticketsRepository.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		ticketsRepository.deleteAll();
	}

}
