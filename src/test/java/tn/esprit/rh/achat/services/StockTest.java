package tn.esprit.rh.achat.services;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.repositories.StockRepository;



import org.springframework.boot.test.context.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class StockTest {
	@Mock
	StockRepository stockRepository;
	@InjectMocks
	StockServiceImpl serviceImpl;
	
	Stock stock =  new Stock(1L,"libel", 22, 12,null);
	
	@Test
	 void testretrieveStock(Stock s) {
		Mockito.when(stockRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(stock));
		Assertions.assertNull(serviceImpl.retrieveStock(1L));
		
	}
 
}
