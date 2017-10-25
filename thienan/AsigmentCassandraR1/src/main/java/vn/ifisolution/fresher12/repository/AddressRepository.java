package vn.ifisolution.fresher12.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import vn.ifisolution.fresher12.entity.Addresses;

public interface AddressRepository extends CrudRepository<Addresses,Integer> {

	@Query("SELECT * FROM addresses WHERE address_id = ?0 ALLOW FILTERING")
    public Addresses addresses (int address_id);
}	
