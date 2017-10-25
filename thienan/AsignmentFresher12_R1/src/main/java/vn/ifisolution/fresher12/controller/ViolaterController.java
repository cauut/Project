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

import vn.ifisolution.fresher12.entity.Violaters;
import vn.ifisolution.fresher12.service.ViolaterService;



@RestController
@RequestMapping("/api")
public class ViolaterController {
	@Autowired
	ViolaterService violaterService;
	
				//	get list 
	
	@RequestMapping(value = "/violater/", method = RequestMethod.GET)
    public ResponseEntity<List<Violaters>> listAll() {
        List<Violaters> list = violaterService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Violaters>>(list, HttpStatus.OK);
    }

					// save 
	@RequestMapping(value = "/violater/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody Violaters violater, UriComponentsBuilder ucBuilder) {
		
		violaterService.save(violater);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/violater/{id}").buildAndExpand(violater.getViolaterId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	 // ------------------- Update  ------------------------------------------------
	 
    @RequestMapping(value = "/violater/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody Violaters violater) {
        
        Violaters violate = violaterService.findOne(id);
 
        violaterService.save(violate);
        return new ResponseEntity<Violaters>(violate, HttpStatus.OK);
    }   
 
    // ------------------- Delete -----------------------------------------
 
    @RequestMapping(value = "/violater/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
       
        Violaters violate = violaterService.findOne(id);
        
        violaterService.deleteById(id);
        return new ResponseEntity<Violaters>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All -----------------------------
 
    @RequestMapping(value = "/violater/", method = RequestMethod.DELETE)
    public ResponseEntity<Violaters> deleteAll() {
 
    	violaterService.deleteAll();
        return new ResponseEntity<Violaters>(HttpStatus.NO_CONTENT);
    }
}
