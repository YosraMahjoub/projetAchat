package tn.esprit.rh.achat.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.times;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;


@SpringBootTest(classes=OperateurTest.class)
@ExtendWith(MockitoExtension.class)
public class OperateurTest {

	
	@Mock
	
	OperateurRepository operateurRepository;
	
	@InjectMocks
	OperateurServiceImpl OperateurService;

	
	Operateur op = new Operateur( 3L,"op" , "lastop" , "f465465df", null );
	
	List<Operateur> operateurs = new ArrayList<Operateur>() {
	      {
	          add(new Operateur( 4L,"op2" , "lastop2" , "f465465df", null ));
	          add(new Operateur( 5L,"op3" , "lastop3" , "hgjh", null ));
	      }
	  };

	@Test
	public void testRetrieveOp() {
	Mockito.when(operateurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(op));
	Operateur op1 = OperateurService.retrieveOperateur(op.getIdOperateur());
	Assertions.assertNotNull(op1);
	}
	
 
  
	@Test
	public void testaddSA(){

      Mockito.when(operateurRepository.save(op)).thenReturn(op);
      Assertions.assertNotNull(OperateurService.addOperateur(op));
	}

	@Test
	public void testdeleteSA(){

	  OperateurService.deleteOperateur(3L);

      Mockito.verify(operateurRepository, times(1)).deleteById(3L);

      assertEquals(null, OperateurService.retrieveOperateur(3L));
	}
  
  
  
  

}

	

