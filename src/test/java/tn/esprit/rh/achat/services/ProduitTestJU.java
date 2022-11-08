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

import tn.esprit.rh.achat.AchatApplication;
import tn.esprit.rh.achat.entities.*;

@SpringBootTest(classes = ProduitTestJU.class)
@RunWith(SpringRunner.class)
public class ProduitTestJU {

	@Autowired
	IProduitService produitService;
	
	@Test
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
