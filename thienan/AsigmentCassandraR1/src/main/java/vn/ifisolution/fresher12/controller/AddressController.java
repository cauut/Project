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

import vn.ifisolution.fresher12.entity.Addresses;
import vn.ifisolution.fresher12.service.AddressService;


@RestController
@RequestMapping("/api") 
public class AddressController {
	@Autowired
	private AddressService addressService;

	// get list

		@RequestMapping(value = "/address/", method = RequestMethod.GET)
		public ResponseEntity<List<Addresses>> listAll() {
			List<Addresses> list = addressService.findAll();
			if (list.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<Addresses>>(list, HttpStatus.OK);
		}

		// save

		@RequestMapping(value = "/address/", method = RequestMethod.POST)
		public ResponseEntity<?> createTransactionData(
				@RequestBody Addresses address, UriComponentsBuilder ucBuilder) {

			addressService.save(address);

			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/api/address/{id}")
					.buildAndExpand(address.getAddress_id()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		}

		// ------------------- Update
		// ------------------------------------------------

		@RequestMapping(value = "/address/{id}", method = RequestMethod.PUT)
		public ResponseEntity<?> updateUser(@PathVariable("id") int id,
				@RequestBody Addresses addresses) {

			Addresses address = addressService.findOne(id);

			addressService.save(address);
			return new ResponseEntity<Addresses>(address, HttpStatus.OK);
		}

		// ------------------- Delete -----------------------------------------

		@RequestMapping(value = "/address/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {

			Addresses addres = addressService.findOne(id);

			addressService.deleteById(id);
			return new ResponseEntity<Addresses>(HttpStatus.NO_CONTENT);
		}

		// ------------------- Delete All -----------------------------

		@RequestMapping(value = "/address/", method = RequestMethod.DELETE)
		public ResponseEntity<Addresses> deleteAll() {

			addressService.deleteAll();
			return new ResponseEntity<Addresses>(HttpStatus.NO_CONTENT);
		}
}
