//package tn.esprit.rh.achat.services;
//
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import tn.esprit.rh.achat.entities.Operateur;
//import tn.esprit.rh.achat.repositories.OperateurRepository;
//
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//
//public class OperateurTest {
//
//	
//	@Mock
//	
//	OperateurRepository operateurRepository;
//	
//	@InjectMocks
//	OperateurServiceImpl OperateurService;
//
//	
//	Operateur op = new Operateur( 1L,"op" , "lastop" , "f465465df", null );
//	
//
//
//	
//	
//	 @Test
//	    public void testRetrieveOp(){
//
//	        Mockito.when(operateurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(op));
//	        Assertions.assertNotNull(OperateurService.retrieveOperateur(1L));
//	    }
//
//	
//
//}