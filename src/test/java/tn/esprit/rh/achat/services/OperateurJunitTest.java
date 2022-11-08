package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.entities.Operateur;

@SpringBootTest(classes=OperateurJunitTest.class)
@RunWith(SpringRunner.class)
@Qualifier("operateurService")


public class OperateurJunitTest {
	
	@Autowired
	OperateurServiceImpl Operateurservice;
	
	@Test
	
	public void testAddOp() {
		Operateur op = new Operateur( 1L,"op" , "lastop" , "f465465df", null );
		Operateur sasaved= Operateurservice.addOperateur(op);
		Assertions.assertNotNull(sasaved);
	} 

}