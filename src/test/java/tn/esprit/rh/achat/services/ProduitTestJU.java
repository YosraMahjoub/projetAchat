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
public class ProduitTestJU {

	@Autowired
     IProduitService produitService;
	
	@Test
	@Order(1)
	public void testAddProduit(){
		
		Produit p = new Produit(2L, "code2", "libelle2", 200L, null, null , null , null , null );
		Produit savedProduit= produitService.addProduit(p);
		Assertions.assertNotNull(savedProduit);	
	}
	/*
	
	//Testing retrieveProduit
	@Test
	public void testRetrieveProduits() {
		Produit p = new Produit();
		p.setCodeProduit("AAA");
		p.setLibelleProduit("C");
		p.setPrix(120);
		p.setDateCreation(new Date());
		p.setDateDerniereModification(new Date());
		Produit savedProduit= produitService.addProduit(p);
		Produit getProduit= produitService.retrieveProduit(savedProduit.getIdProduit());
		assertNotNull(savedProduit.getCodeProduit());
		assertNotNull(savedProduit.getLibelleProduit());
		assertEquals(savedProduit.getIdProduit(),getProduit.getIdProduit());
		
		produitService.deleteProduit(savedProduit.getIdProduit());
		}
	
	*/
	

	
	
}