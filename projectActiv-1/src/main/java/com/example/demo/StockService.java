package com.example.demo;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.demo.StockManger;


@Service
public class StockService {

	
	
	public StockService() {

	}
	
	
	public StockManger getStockById(int id) {
		

        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
		return null;
        
        
	}

}
