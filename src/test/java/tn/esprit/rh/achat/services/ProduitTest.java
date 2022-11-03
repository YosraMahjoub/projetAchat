package tn.esprit.rh.achat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.esprit.rh.achat.entities.*;
import tn.esprit.rh.achat.repositories.*;



import org.springframework.boot.test.context.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ProduitTest {
	@Mock
	ProduitRepository profRepository;
	@InjectMocks
	ProduitServiceImpl serviceImpl;
	Produit prod = new Produit(1L, "code1", "libelle1", 120L,null, null , null , null , null);

    List<Produit> listFournisseurs = new ArrayList<Produit>() {
        {
            add(new Produit(2L, "code2", "libelle2", 200L, null, null , null , null , null ));
            add(new Produit(3L, "code3", "libelle3", 300L, null, null , null , null , null ));
        }
    };
    @Test
    public void testretrieveProduit(){

        Mockito.when(profRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(prod));
        
        Assertions.assertNotNull(serviceImpl.retrieveProduit(2L));
    }

}
