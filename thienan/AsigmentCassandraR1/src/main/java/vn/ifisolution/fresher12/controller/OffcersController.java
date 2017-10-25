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

import vn.ifisolution.fresher12.service.OffcersService;

@RestController
@RequestMapping("/api") 
public class OffcersController {
	@Autowired
	private OffcersService offcersService;
//	@Autowired
//	private AddressService addressService;
//	
//	
//	// get address by id
//	   @RequestMapping(value = "/addressoffcer/{id}", method = RequestMethod.GET)
//		public ResponseEntity<?> getAddresses(@PathVariable("id") int id) {
//			
//			Offcers  offcers = offcersService.getOffcersById(id);
//			Addresses address = addressService.getAddressById(offcers.getOfficer_address_id());
//			if (offcers == null) {
//				return new ResponseEntity(HttpStatus.NO_CONTENT);
//			}
//			return new ResponseEntity<Addresses>(address, HttpStatus.OK);
//		}
//	   

	// get list

	@RequestMapping(value = "/officers/", method = RequestMethod.GET)
	public ResponseEntity<List<Offcers>> listAll() {
		List<Offcers> list = offcersService.findAll();
		if (list.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Offcers>>(list, HttpStatus.OK);
	}

	// save

	@RequestMapping(value = "/officers/", method = RequestMethod.POST)
	public ResponseEntity<?> createTransactionData(
			@RequestBody Offcers offcers, UriComponentsBuilder ucBuilder) {

		offcersService.save(offcers);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/officers/{id}")
				.buildAndExpand(offcers.getOfficer_badge_number()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update
	// ------------------------------------------------

	@RequestMapping(value = "/officers/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") int id,
			@RequestBody Offcers offcers) {

		Offcers offi = offcersService.findOne(id);

		offcersService.save(offi);
		return new ResponseEntity<Offcers>(offi, HttpStatus.OK);
	}

	// ------------------- Delete -----------------------------------------

	@RequestMapping(value = "/officers/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {

		Offcers offi = offcersService.findOne(id);

		offcersService.deleteById(id);
		return new ResponseEntity<Offcers>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All -----------------------------

	@RequestMapping(value = "/officers/", method = RequestMethod.DELETE)
	public ResponseEntity<Offcers> deleteAll() {

		offcersService.deleteAll();
		return new ResponseEntity<Offcers>(HttpStatus.NO_CONTENT);
	}

}
