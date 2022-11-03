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

public class SecteurActiviteTest {
	@Mock
	SecteurActiviteRepository activiteRepository;
	@InjectMocks
	SecteurActiviteServiceImpl activiteServiceImpl;
	SecteurActivite activite = new SecteurActivite(1L, "code1", "libelle1", null);

    List<SecteurActivite> activites = new ArrayList<SecteurActivite>() {
        {
            add(new SecteurActivite(2L, "code2", "libelle2",  null ));
            add(new SecteurActivite(3L, "code3", "libelle3", null ));
        }
    };
    @Test
    public void testretrieveProduit(){

        Mockito.when(activiteRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(activite));
        
        Assertions.assertNotNull(activiteServiceImpl.retrieveSecteurActivite(2L));
    }

}
