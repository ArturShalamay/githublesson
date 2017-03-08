package ua.edu.uabs.author.task2;

public class Dean {
	private String FirstName, SecondName, LastName;
	private int age, stud;
	
	//Getter �� Setter ������� ��� ������ �� ��������(������ �����) � ����� �����,
	//Getter ��� ��������� �����
	//SEtter ��� ������������ �����
	//������� ����������� ������� � ��� ������� public, � � �������� private.
	//public ������ � � ����� �����
	//private - ������ � ����� �������� �����
	
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
	
	public int getAge() {
		return age;
	}
	//��� � if ����� ��, �� �� �� ���� �� 25 �� 70, � ����� �������� �������� �����������
	public void setAge(int age) {
		if(age>=25 && age<=70){
		this.age = age;
		}
		else{
			System.out.println("������� �� �����������.");
			System.exit(0);//��������� ��������
		}
	}
	
	public int getStud() {
		return stud;
	}
	public void setStud(int stud) {
		this.stud = stud;
	}
	
	//���� ����� � �������(�� ����� ������� ������ �������) ����
	public void ShortOutput(){
		System.out.println("�����: "+LastName+" "+FirstName+" "+SecondName+", ��: "+age+", �-��� ����: "+stud+".");
	}
	//���� ����� � �����(�� ����� ����������� � ������, � �������� ������ �������� �������� ��� ������� .toUpperCase()) ����
	public void UpperOutput(){
		System.out.println("�����: "+LastName.toUpperCase()+" "+FirstName.toUpperCase()+" "+SecondName.toUpperCase()+", ²�: "+age+", �-��� ����: "+stud+".");
	}
	
	//������ ����������, ������ ��� ��������� ��������� ������ ���������� �����, � ��� �������� ����� Setters 
	public Dean(){};
	
	//����������� � ����������� ��������������� ��� ��������� ����� �� ����������� ��������� ���� ��������
	public Dean(String firstName, String secondName, String lastName, int age, int stud) {
		this.FirstName = firstName;
		this.SecondName = secondName;
		this.LastName = lastName;
		this.setAge(age);
		this.stud = stud;
	}
	
	
}
