package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import tn.esprit.rh.achat.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

 class SecteurActiviteJTest {
	
	@Autowired
    ISecteurActiviteService sa;
	
	@Test
	@Order(1)
	public void testretrsecta() {
		SecteurActivite sec = new SecteurActivite(1L, "code1", "libelle1", null);
		SecteurActivite secteurActivite= sa.addSecteurActivite(sec);
		Assertions.assertNotNull(secteurActivite);
	    
	} 

}
