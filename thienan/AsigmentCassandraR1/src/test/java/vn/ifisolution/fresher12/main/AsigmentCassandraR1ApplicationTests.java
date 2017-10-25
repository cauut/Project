package vn.ifisolution.fresher12.main;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import vn.ifisolution.fresher12.entity.Offcers;
import vn.ifisolution.fresher12.repository.OffcersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AsigmentCassandraR1ApplicationTests {
	@Autowired
	private OffcersRepository offerRes;
	@Test
	public void contextLoads() {
		Offcers off=new Offcers();
		off.setOfficer_badge_number(3);
		offerRes.save(off);
	}

}
