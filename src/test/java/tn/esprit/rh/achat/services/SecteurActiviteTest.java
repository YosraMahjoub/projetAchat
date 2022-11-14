package tn.esprit.rh.achat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
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

@SpringBootTest(classes =  SecteurActiviteTest.class)
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
            add(new SecteurActivite(4L, "code4", "libelle4",  null ));
            add(new SecteurActivite(5L, "code5", "libelle5", null ));
        }
    };
    @Test
    public void testretrieveSA(){

        Mockito.when(activiteRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(activite));
        Assertions.assertNotNull(activiteServiceImpl.retrieveSecteurActivite(2L));
    }
    
    @Test
    public void testaddSA(){

        Mockito.when(activiteRepository.save(activite)).thenReturn(activite);
        Assertions.assertNotNull(activiteServiceImpl.addSecteurActivite(activite));
    }

    @Test
    public void testdeleteSA(){

    	activiteServiceImpl.deleteSecteurActivite(3L);

        Mockito.verify(activiteRepository, times(1)).deleteById(3L);

        assertEquals(null, activiteServiceImpl.retrieveSecteurActivite(3L));
    }
    
    
    
    

}
