package Homework_5;

public class Runner {

	public static void main(String[] args) {
		
//		№1
		
//		int sumOfgreats = 0;
//		int numberOfFive = 0;
//		
//		OcenkiUrok c = new OcenkiUrok();
//		
//		for(int i = 1; i < 20; i++) {
//			long greats = c.RandomAssessment();
//			
//			System.out.println("Урок " + i + " оценка " + greats);
//			
//			sumOfgreats += greats;
//		}
//		
//		if(greats == 5) {
//			numberOfFive++;
//		};
//		
//		 System.out.println(Math.round(numberOfFive / 20));
//		 System.out.println("Количество пятёрок: " + numberOfFive);
		 
//		 №2
		 
			double [] temperatures = {18.4, 19.7, 17.2, 20.9, 16.8, 21.3, 18.1};
			
			System.out.println("Температура за неделю:");
			
			int theHotest = 100;
			int theHoldest = -100;
			
			for(double temperature: temperatures) {
				Math.round(temperature);
				System.out.println("День: " + temperatures + " → " + temperature);
			}
	}
}
