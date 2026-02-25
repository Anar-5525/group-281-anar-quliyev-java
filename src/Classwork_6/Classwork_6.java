package Classwork_6;

public class Classwork_6 {
	public static void main(String[] args){
		
//		#1
		
        int numbr = 21;
		
		if (numbr % 2 == 0) {
		    System.out.println("Чётное число!");
		} else if (numbr == 0) {
		    System.out.println("0");
		}  else {
		    System.out.println("Нечётное число!");
		}
		
//		#2
		
        int points = 85;
		
		if (points >= 90) {
		    System.out.println("отлично");
		} else if (points >= 70) {
		    System.out.println("хорошо");
		} else if (points >= 50) {
		    System.out.println("удовлетворительно");
		} else if (points <= 0 && points >= 100) {
		    System.out.println("Некорректный балл");
		} else {
		    System.out.println("неудовлетворительно");
		} 
		
//		#4
		
		int price = 3752;

		if (price >= 5000) {
		    price = price / 100 * 15;
		} else if (price >= 2000) {
		    price = price / 100 * 10;
		} else if (price >= 1000) {
		    price = price / 100 * 5;
		}

		System.out.println(price);
		
//		#6
		
		for(int i=1; i<=10; i++) {
		    System.out.println("6*"+i+"="+i*6);
		}
		
//		#2.1
		
        int day = 3;
		
		if (day <= 5 && day >= 1) {
		    System.out.println("Будний день");
		} else if (day <= 7 && day >= 6) {
		    System.out.println("Выходной");
		}  else {
		    System.out.println("Некорректный день");
		}
		
//		# 2.2
		
        int age = 19;
		
		if (age <= 2 && age >= 0) {
		    System.out.println("младенец");
		} else if (age <= 6 && age >= 3) {
		    System.out.println("дошкольник");
		} else if (age <= 10 && age >= 7) {
		    System.out.println("младший школьник");
		} else if (age <= 14 && age >= 11) {
		    System.out.println("подросток младший");
		} else if (age <= 17 && age >= 15){
		    System.out.println("подросток старший");
		} else if (age <= 64 && age >= 18){
		    System.out.println("взрослый");
		} else if (age >= 65){
		    System.out.println("пожилой человек");
		} else if (age == 0){
		    System.out.println("Возраст не может быть отрицательным");
		} 
		
	}
}

