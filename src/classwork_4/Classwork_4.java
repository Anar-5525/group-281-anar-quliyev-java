package classwork_4;

public class Classwork_4 {
	public static void main(String[] args){
//		#1
		
		int age = 14;
		
		if (age >= 18) {
		    System.out.println("Вы взрослый");
		} else {
		    System.out.println("Вы ещё ребёнок");
		};
		
//		#2
		
		int num = 5;
		
		if (num >= 1) {
		    System.out.println("Положительное");
		} else {
		    System.out.println("Отрицательное или ноль");
		};
		
//		#3
		
		int great = 4;
		
		if (great == 5) {
		    System.out.println("Отлично");
		} else if (great == 4) {
		    System.out.println("Хорошо");
		} else if (great == 3) {
		    System.out.println("Удовлетворительно");
		} else{
		    System.out.println("Неудовлетворительно");
		};
		
//		#4
		
		int tem = 20;
		
		if (tem >= 25) {
		    System.out.println("Жарко");
		} else if (tem >= 10 && tem <= 24) {
		    System.out.println("Тепло");
		} else{
		    System.out.println("Холодно");
		};
		
//		#7
		
		int numb = 2;
		
		if (numb == 1) {
		    System.out.println("Первое больше");
		} else if (numb == 2) {
		    System.out.println("Второе не меньше");
		};
		
//		#8
		
        int time = 14;
		
		if (time >= 6 && time <= 11) {
		    System.out.println("Утро");
		} else if (time >= 12 && time <= 17) {
		    System.out.println("День");
		} else if (time >= 18 && time <= 22) {
		    System.out.println("Вечер");
		} else{
		    System.out.println("Ночь");
		};
		
//		#10
		
        int numbr = 21;
		
		if (numbr % 2 == 0) {
		    System.out.println("Чётное число!");
		} else {
		    System.out.println("Нечётное число!");
		}
		
//		#11
		
		String pol = "М";
				
		if (pol == "М") {
		    System.out.println("Привет, парень!");
		} else if (pol == "Ж") {
		    System.out.println("Привет, девочка!");
		} else{
		    System.out.println("Не понял пол");
		};
		
//		#12
		
        int points = 85;
		
		if (points >= 90) {
		    System.out.println("5");
		} else if (points >= 75 && points <= 89) {
		    System.out.println("4");
		} else if (points >= 50 && points <= 74) {
		    System.out.println("3");
		} else{
		    System.out.println("2");
		};
		
//		#14
		
		int ag = 14;
				
		if (ag < 7) {
		    System.out.println("Детский сад");
		} else if (ag >= 7 && ag <= 17) {
		    System.out.println("Школа");
		} else{
		    System.out.println("Взрослый");
		};
		
//		#16
		
		int sm = 167;
		
		if (sm <= 150) {
		    System.out.println("Низкий");
		} else if (sm > 150 && sm < 180) {
		    System.out.println("Средний");
		} else if (sm >= 180) {
		    System.out.println("Высокий");
		};
		
//		#17
		
        int bal = 14;
		
		if (bal >= 100) {
		    System.out.println("Победитель!");
		} else {
		    System.out.println("Попробуй ещё");
		};
		
//		#20
		
		int n = 7;
		int u = 7;
		
		if (n == u) {
		    System.out.println("Угадал!");
		} else {
		    System.out.println("Не угадал");
		};
		
//		#21
		
		int m = 1;
		int b = 2;
		
		if (m == b) {
		    System.out.println("Равны");
		} else {
		    System.out.println("Разные");
		};
		
//		#22
		
		int temp = 21;
		
		if (temp <= 0) {
		    System.out.println("Лёд");
		} else if (temp >= 1 && temp <= 99) {
		    System.out.println("Тепло");
		} else if (temp >= 100){
		    System.out.println("Пар");
		};
		
//		#24
		
		int pit = 1;
		
		if (pit == 0) {
		    System.out.println("Нет питомцев");
		} else if (pit == 1) {
		    System.out.println("Один питомец");
		} else if (pit > 1) {
		    System.out.println("Много питомцев");
		};
		
//		#25
		
		
	}
}
