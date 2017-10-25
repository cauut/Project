package vn.ifisolution.fresher12.service;

import java.util.List;

import vn.ifisolution.fresher12.entity.Tickets;

public interface TicketsService {
	List<Tickets> findAll();

	Tickets save(Tickets offcers);

	Tickets findOne(Integer id);

	void deleteById(Integer id);

	void deleteAll();

}
