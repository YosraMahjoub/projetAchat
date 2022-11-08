package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.*;

import tn.esprit.rh.achat.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest(classes = ProduitTestJu.class)
@RunWith(SpringRunner.class)
public class ProduitTestJu {

	@Autowired
	IProduitService produitService;
	
	@Test
	public void testAddProduit(){
		List<Produit> produits = produitService.retrieveAllProduits();
		int expected = produits.size();
		Produit p = new Produit();
		p.setIdProduit(1L);
		p.setCodeProduit("AAA");
		p.setLibelleProduit("C");
		p.setPrix(120);
		p.setDateCreation(new Date());
		p.setDateDerniereModification(new Date());
		Produit savedProduit= produitService.addProduit(p);
		assertEquals(expected+1, produitService.retrieveAllProduits().size());
		assertNotNull(savedProduit.getIdProduit());
		produitService.deleteProduit(savedProduit.getIdProduit());
		
	}
	
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
	
	
	//Testing updateProduit
	@Test
	public void testUpdateProduit() {
		Produit p = new Produit();
		p.setCodeProduit("AAA");
		p.setLibelleProduit("C");
		p.setPrix(120);
		p.setDateCreation(new Date());
		p.setDateDerniereModification(new Date());
		Produit savedProduit= produitService.addProduit(p);
		savedProduit.setCodeProduit("EEE");
		produitService.updateProduit(savedProduit);
		assertEquals(p.getCodeProduit(),savedProduit.getCodeProduit());
		produitService.deleteProduit(savedProduit.getIdProduit());
		}
	
	//Testing deleteProduit
	@Test
	public void testDeleteProduit() {
		Produit p = new Produit();
		p.setCodeProduit("AAA");
		p.setLibelleProduit("C");
		p.setPrix(120);
		p.setDateCreation(new Date());
		p.setDateDerniereModification(new Date());
		Produit savedProduit= produitService.addProduit(p);
		produitService.deleteProduit(savedProduit.getIdProduit());
		assertNotNull(savedProduit.getIdProduit());
		
	}
	

	
	
}
