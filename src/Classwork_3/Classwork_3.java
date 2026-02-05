package Classwork_3;

public class Classwork_3 {
	public static void main(String[] args) {
		
//		#11
		
		int temp = 20;
		
		if (temp >= 15) {
		    System.out.println("Ура! Можно играть на улице!");
		} else {
		    System.out.println("Холодно, лучше остаться дома");
		};
		
//		#12
		
		int sweets = 3;
		
		if (sweets >= 5) {
		    System.out.println("Ещё много конфет!");
		} else if (sweets <= 4 && sweets >= 1) {
		    System.out.println("Конфеты заканчиваются...");
		} else if (sweets == 0) {
		    System.out.println("Конфеты кончились");
		};
		
//		#13
		
		int lvl = 10;
		
		if (lvl >= 20) {
		    System.out.println("Ты профи!");
		} else if (lvl >= 10) {
		    System.out.println( "Отличный игрок!");
		} else if (lvl >= 5) {
		    System.out.println("Хорошее начало!");
		} else{
		    System.out.println("Новичок, продолжай играть!");
		};
		
//		#17
		
		int mon = 300;
		int toyPrice = 250;
		
		if (mon >= toyPrice) {
		    System.out.println("Ура! Покупаю игрушку!");
		} else {
		    System.out.println("Не хватает денег... Нужно подкопить");
		};
		
//		#16
		
		int time = 14;
		
		if (time >= 6 && time <= 11) {
		    System.out.println("Доброе утро!");
		} else if (time >= 12 && time <= 17) {
		    System.out.println("Добрый день!");
		} else if (time >= 18 && time <= 22) {
		    System.out.println("Добрый вечер!");
		} else{
		    System.out.println( "Доброй ночи!");
		};
		
	}
}
