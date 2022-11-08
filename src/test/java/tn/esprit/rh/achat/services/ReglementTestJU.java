
package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.AchatApplication;
import tn.esprit.rh.achat.entities.Reglement;

@SpringBootTest(classes=ReglementTestJU.class)
@RunWith(SpringRunner.class)

@Import(tn.esprit.rh.achat.services.ReglementServiceImpl.class)
public class ReglementTestJU {
	@Autowired
	private ReglementServiceImpl Reglementservice;
	
	@Test
	
	public void testAddOp() {
		Reglement reg = new Reglement( 1L,(float) 1, (float) 1,true, null, null);
		Reglement sasaved= Reglementservice.addReglement(reg);
		Assertions.assertNotNull(sasaved);
	} 
}
