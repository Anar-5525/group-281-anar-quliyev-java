package homework_2;

public class Homework_2 {

	public class Student {

	    String name;
	    int age;
	    double averageGrade;

	    public Student(String name, int age, double averageGrade) {
	        this.name = name;
	        this.age = age;
	        this. averageGrade = averageGrade;
	    }

	    public void printInfo() {
	        System.out.println(name + ", Возраст: " + age + ", балл: " + averageGrade);
	    }
	}

}
