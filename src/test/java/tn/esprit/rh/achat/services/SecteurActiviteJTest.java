package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.*;

import tn.esprit.rh.achat.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;

@SpringBootTest(classes =  SecteurActiviteJTest.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SecteurActiviteJTest {
	@Autowired
	ISecteurActiviteService activiteService;
	
	@Test
	  @Order(1)
	public void testAddsecta() {
		SecteurActivite activite = new SecteurActivite(5L, "code1", "libelle1", null);
		SecteurActivite sasaved= activiteService.addSecteurActivite(activite);
		Assertions.assertNotNull(sasaved);
	} 

}
