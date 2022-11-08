package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Operateur;

@SpringBootTest(classes=OperateurJunitTest.class)


public class OperateurJunitTest {
	
	@Autowired
	IOperateurService Operateurservice;
	
	@Test
	
	public void testAddOp() {
		Operateur op = new Operateur( 1L,"op" , "lastop" , "f465465df", null );
		Operateur sasaved= Operateurservice.addOperateur(op);
		Assertions.assertNotNull(sasaved);
	} 

}