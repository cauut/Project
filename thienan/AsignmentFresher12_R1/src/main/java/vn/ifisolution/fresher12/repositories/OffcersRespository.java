package vn.ifisolution.fresher12.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.ifisolution.fresher12.entity.Offcers;
@Repository
public interface OffcersRespository extends JpaRepository<Offcers, Integer>{
	@Query("SELECT u FROM Offcers u where u.officerBadgeNumber = ?1")
	public List<Offcers> isExit(Integer officerBadgeNumber);

}
