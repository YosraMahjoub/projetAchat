package tn.esprit.rh.achat.services;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.entities.Operateur;

@SpringBootTest

@RunWith(SpringRunner.class)

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