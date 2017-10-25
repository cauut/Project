package vn.ifisolution.fresher12.controller;

import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.spi.LoggerFactory;
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
import vn.ifisolution.fresher12.util.CustomErrorType;
@RestController
@RequestMapping("/api")
public class OffcersController {
	@Autowired
	OffcersService offcersService;
	
				//	get list 
	
	@RequestMapping(value = "/offcers/", method = RequestMethod.GET)
    public ResponseEntity<List<Offcers>> listAll() {
        List<Offcers> list = offcersService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Offcers>>(list, HttpStatus.OK);
    }

					// save 
	@RequestMapping(value = "/offcers/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody Offcers offcers, UriComponentsBuilder ucBuilder) {
		
		offcersService.save(offcers);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/offcers/{id}").buildAndExpand(offcers.getOfficerBadgeNumber()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	 // ------------------- Update  ------------------------------------------------
	 
    @RequestMapping(value = "/offcers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody Offcers offcers) {
        
        Offcers off = offcersService.findOne(id);
 
        offcersService.save(off);
        return new ResponseEntity<Offcers>(off, HttpStatus.OK);
    }   
 
    // ------------------- Delete -----------------------------------------
 
    @RequestMapping(value = "/offcers/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
       
        Offcers off = offcersService.findOne(id);
        
        offcersService.deleteById(id);
        return new ResponseEntity<Offcers>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All -----------------------------
 
    @RequestMapping(value = "/offcers/", method = RequestMethod.DELETE)
    public ResponseEntity<Offcers> deleteAll() {
 
    	offcersService.deleteAll();
        return new ResponseEntity<Offcers>(HttpStatus.NO_CONTENT);
    }

	
}
