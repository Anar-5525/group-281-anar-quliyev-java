package Homework_4;

public class Runner {
	
	public static void main(String[] args) {
		
//		#2
		
		double [] prices = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
	
		System.out.println("Цены в магазине игрушек:");
		
		double sumOfprices = 0.0;
		
		for(double price: prices) {
			Math.round(price);
		}
		
		System.out.println("Игрушка: " + prices + "  после округления: " + sumOfprices);
	}
}
