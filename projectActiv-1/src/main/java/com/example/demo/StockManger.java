package com.example.demo;

public class StockManger {

	
	private int stock_id;
	private String product_name;
	private Double product_price;
	
	public StockManger( int stock_id, String product_name, Double product_price) {
		this.stock_id = stock_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	
	
	public void createStock(String product_name, Double product_price) {
		
	}
	public String[] getStockById(int id) {
		
		String [] r = null;
		
		if(this.stock_id  == id) {
			
		}
		
		return r;
	}

}
