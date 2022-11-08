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

@SpringBootTest(classes=ReglementTest.class)
@ExtendWith(MockitoExtension.class)
public class ReglementTest {
	@Mock
	ReglementRepository reglementRepository;
	@InjectMocks
	ReglementServiceImpl serviceImpl;
	
	Reglement reglement =  new Reglement( 1L,(float) 1, (float) 1,true, null, null);
	
    List<Reglement> reglements = new ArrayList<Reglement>() {
        {
            add(new Reglement( 2L,(float) 1, (float) 1,true, null, null));
            add(new Reglement( 1L,(float) 1, (float) 1,true, null, null));
        }
    };
	
	@Test
	public void testretrieveStock(Reglement s) {
		Mockito.when(reglementRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(reglement));
		Assertions.assertNotNull(serviceImpl.retrieveReglement(2L));
	}

    @Test
    public void testaddReglement(){

        Mockito.when(reglementRepository.save(reglement)).thenReturn(reglement);

        Assertions.assertNotNull(serviceImpl.addReglement(reglement));
    }

   
    
}