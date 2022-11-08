package tn.esprit.rh.achat.services;


import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import tn.esprit.rh.achat.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SecteurActiviteJTest {
	@Autowired
	ISecteurActiviteService activiteService;
	
	@Test
	public void testAddsecta() {
		SecteurActivite activite = new SecteurActivite(5L, "code1", "libelle1", null);
		SecteurActivite sasaved= activiteService.addSecteurActivite(activite);
		Assertions.assertNotNull(sasaved);
	} 

}
