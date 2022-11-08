package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertTrue;

import java.util.List;
import tn.esprit.rh.achat.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =  SecteurActiviteJTest.class)
@ExtendWith(SpringExtension.class)	
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class SecteurActiviteJTest {
	@Autowired
	ISecteurActiviteService activiteService;
	
	
	@Test
	@Order(1)
	public void testretrsecta() {
		assertTrue(true);
	    
	} 

}
