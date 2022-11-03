package tn.esprit.rh.achat.services;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.entities.SecteurActivite;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SecteurActiviteJTest {
	@Autowired
	ISecteurActiviteService activiteService;
	
	@Test
	public void testAddsecta() {
		SecteurActivite activite = new SecteurActivite(1L, "code1", "libelle1", null);
		SecteurActivite sasaved= activiteService.addSecteurActivite(activite);
		Assertions.assertNotNull(sasaved);
	} 

}
