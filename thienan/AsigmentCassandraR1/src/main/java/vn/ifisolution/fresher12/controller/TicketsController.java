package vn.ifisolution.fresher12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import vn.ifisolution.fresher12.entity.Offcers;
import vn.ifisolution.fresher12.entity.Tickets;
import vn.ifisolution.fresher12.service.TicketsService;

@RestController
@RequestMapping("/api") 
public class TicketsController {
	
	@Autowired
	private TicketsService ticketsService;
	// get list

		@RequestMapping(value = "/tickets/", method = RequestMethod.GET)
		public ResponseEntity<List<Tickets>> listAll() {
			List<Tickets> list = ticketsService.findAll();
			if (list.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<Tickets>>(list, HttpStatus.OK);
		}

		// save

		@RequestMapping(value = "/tickets/", method = RequestMethod.POST)
		public ResponseEntity<?> createTransactionData(
				@RequestBody Tickets tickets, UriComponentsBuilder ucBuilder) {

			ticketsService.save(tickets);

			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/api/officers/{id}")
					.buildAndExpand(tickets.getTicket_number()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		}

		// ------------------- Update
		// ------------------------------------------------

		@RequestMapping(value = "/tickets/{id}", method = RequestMethod.PUT)
		public ResponseEntity<?> updateUser(@PathVariable("id") int id,
				@RequestBody Tickets tickets) {

			Tickets tickes = ticketsService.findOne(id);

			ticketsService.save(tickes);
			return new ResponseEntity<Tickets>(tickes, HttpStatus.OK);
		}

		// ------------------- Delete -----------------------------------------

		@RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {

			Tickets ticket = ticketsService.findOne(id);

			ticketsService.deleteById(id);
			return new ResponseEntity<Offcers>(HttpStatus.NO_CONTENT);
		}

		// ------------------- Delete All -----------------------------

		@RequestMapping(value = "/tickets/", method = RequestMethod.DELETE)
		public ResponseEntity<Tickets> deleteAll() {

			ticketsService.deleteAll();
			return new ResponseEntity<Tickets>(HttpStatus.NO_CONTENT);
		}
}
