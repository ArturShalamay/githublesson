package ua.edu.uabs.author.task2;

public class Student {
	private String FirstName, SecondName, LastName;
	private int avggrade, age;
	//Getter �� Setter ������� ��� ������ �� ��������(������ �����) � ����� �����,
	//Getter ��� ��������� �����
	//SEtter ��� ������������ �����
	//������� ����������� ������� � ��� ������� public, � � �������� private.
	//public ������ � � ����� �����
	//private - ������ � ����� �������� �����
	
	public int getAge() {
		return age;
	}
	//��� � if ����� ��, �� �� �� ���� �� 18 �� 70, � ����� �������� �������� �����������
	public void setAge(int age) {
		if(age>=18 && age<=70){
		this.age = age;
		}
		else{
			System.out.println("������� �� �����������."); 
			 System.exit(0);//��������� ��������
			 }
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public int getAvggrade() {
		return avggrade;
	}
	public void setAvggrade(int avggrade) {
		this.avggrade = avggrade;
	}
	
	//������ ����������, ������ ��� ��������� ��������� ������ ���������� �����, � ��� �������� ����� Setters 
	public Student(){};
	
	//����������� � ����������� ��������������� ��� ��������� ����� �� ����������� ��������� ���� ��������
	public Student(String firstName, String secondName, String lastName, int avggrade, int age) {
		this.FirstName = firstName;
		this.SecondName = secondName;
		this.LastName = lastName;
		this.avggrade = avggrade;
		this.setAge(age);
	}
	
	//���� ����� � �������(�� ����� ������� ������ �������) ����
	public void ShortOutput(){
		System.out.println("�������: "+LastName+" "+FirstName+" "+SecondName+", ��: "+age+", ����� ��������: "+avggrade+".");
	}
	//���� ����� � �����(�� ����� ����������� � ������, � �������� ������ �������� �������� ��� ������� .toUpperCase()) ����
	public void UpperOutput(){
		System.out.println("�������: "+LastName.toUpperCase()+" "+FirstName.toUpperCase()+" "+SecondName.toUpperCase()+", ²�: "+age+", в���� ��ϲ����Ҳ: "+avggrade+".");
	}
	
	
}
