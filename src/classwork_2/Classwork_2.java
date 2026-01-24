package classwork_2;

public class Classwork_2 {
	public static void main(String[] args) {
		
//		#1
		
		int age = 14;
				
		if (age >= 10) {
		    System.out.println("Привет, друг");
		};
		
//		#2
		
		int weth = -32;
		
		if (weth <= 0) {
		    System.out.println("На улице мороз! Одевайся теплее!");
		};
		
//		#3
		
		int money = 50;
		
		if (money >= 60) {
		    System.out.println("Ура! Можно купить мороженое!");
		} else {
		    System.out.println("Мало денег, подожду...");
		}
		
//		#4
		
		int num = 12;
		
		if (num % 2 == 0) {
		    System.out.println("Чётное число!");
		} else {
		    System.out.println("Нечётное число!");
		}
		
//		#5
		
		int points = 85;
		
		if (points >= 90) {
		    System.out.println("Супер! Ты чемпион!");
		} else if (points >= 70) {
		    System.out.println("Отлично сыграл!");
		} else if (points >= 50) {
		    System.out.println("Неплохо, но можно лучше");
		} else{
		    System.out.println("Попробуй ещё раз!");
		};
}
}