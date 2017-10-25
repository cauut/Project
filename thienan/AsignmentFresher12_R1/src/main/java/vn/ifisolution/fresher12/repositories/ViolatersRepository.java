package vn.ifisolution.fresher12.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.ifisolution.fresher12.entity.Violaters;



@Repository
public interface ViolatersRepository extends JpaRepository<Violaters, Integer>  {
	
}
