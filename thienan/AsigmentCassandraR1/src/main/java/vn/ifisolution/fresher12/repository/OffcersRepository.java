package vn.ifisolution.fresher12.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import vn.ifisolution.fresher12.entity.Offcers;

public interface OffcersRepository extends CrudRepository<Offcers,Integer>{

	@Query("SELECT * FROM offcer WHERE officer_badge_number = ?0 ALLOW FILTERING")
    public Offcers findById (int officer_badge_number);
    @Query("SELECT * FROM addresses WHERE address_id = ?0 ALLOW FILTERING")
    public List<Offcers> getListAdresses(int address_id);
}
