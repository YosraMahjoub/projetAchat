package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.entities.Operateur;

@SpringBootTest(classes=OperateurJunitTest.class)
@RunWith(SpringRunner.class)

@ContextConfiguration(locations = {
"classpath*:spring/applicationContext.xml",
"classpath*:spring/applicationContext-jpa.xml",
"classpath*:spring/applicationContext-security.xml" })
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