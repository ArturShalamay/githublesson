package ua.edu.uabs.author.task2;

public class Dispatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Використання пустого конструктора
		Student stud1 = new Student();
		
		//Занесення даних через SETTERS
		stud1.setFirstName("Іван");
		stud1.setLastName("Іванов");
		stud1.setSecondName("Іванович");
		stud1.setAge(20);
		stud1.setAvggrade(95);
		stud1.ShortOutput();//Команда короткого виведення
		stud1.UpperOutput();//Команда повного виведення
		
		//Використання конструктора з параметрами та занесення даних зразу через нього
		Student stud2 = new Student("Петро", "Петрович", "Петров", 88, 18);
		stud2.ShortOutput();
		stud2.UpperOutput();
		
		//Використання конструктора з параметрами та занесення даних зразу через нього
		Student stud3 = new Student("Іванівна", "Іванка", "Іванова", 90, 21);
		stud3.ShortOutput();//Команда короткого виведення
		stud3.UpperOutput();
		
		System.out.println();//Просто для відділення усіх виводів пустим рядком
		
		//Використання пустого конструктора
		Teacher teach1 = new Teacher();
		teach1.setFirstName("Тарас");
		teach1.setLastName("Стисло");
		teach1.setSecondName("Романович");
		teach1.setAge(24);
		teach1.setStag(2);
		teach1.ShortOutput();//Команда короткого виведення
		teach1.UpperOutput();
		
		//Використання конструктора з параметрами та занесення даних зразу через нього
	    Teacher teach2 = new Teacher("Андрій","Петрович","Олійник",12, 50);
	    teach2.ShortOutput();//Команда короткого виведення
	    teach2.UpperOutput();//Команда повного виведення
	    
	    System.out.println();//Просто для відділення усіх виводів пустим рядком
	    
	    //Використання конструктора з параметрами та занесення даних зразу через нього
	    Dean dn1 = new Dean("Петро","Вачилевич", "Іванов", 100, 210);
	    dn1.ShortOutput();//Команда короткого виведення
	    dn1.UpperOutput();//Команда повного виведення
	}

}
