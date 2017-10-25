package vn.ifisolution.fresher12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ifisolution.fresher12.entity.Tickets;
import vn.ifisolution.fresher12.repository.TicketsRepository;

@Service
public class TicketServiceImpl implements TicketsService{
	 @Autowired  
	    private TicketsRepository ticketsRepository;
	 public TicketServiceImpl() {
		 super();
	 }
	@Override
	public List<Tickets> findAll() {
		// TODO Auto-generated method stub
		return (List<Tickets>) ticketsRepository.findAll();
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
