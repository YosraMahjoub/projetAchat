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
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;

@SpringBootTest
@RunWith(SpringRunner.class)

//@Import(tn.esprit.rh.achat.services.OperateurServiceImpl.class)
//@ContextConfiguration(classes = {tn.esprit.rh.achat.repositories.OperateurRepository.class})

public class OperateurJunitTest {
	
	@Autowired
	private OperateurServiceImpl Operateurservice;
	
	@Test
	
	public void testAddOp() {
		Operateur op = new Operateur( 1L,"op" , "lastop" , "f465465df", null );
		Operateur sasaved= Operateurservice.addOperateur(op);
		Assertions.assertNotNull(sasaved);
	} 

}