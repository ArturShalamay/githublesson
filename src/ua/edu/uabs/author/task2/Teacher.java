package ua.edu.uabs.author.task2;

public class Teacher {
	private String FirstName, SecondName, LastName;
	private int stag, age;
	
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



	public int getStag() {
		return stag;
	}
	public void setStag(int stag) {
		this.stag = stag;
	}

	public int getAge() {
		return age;
	}
	//��� � if ����� ��, �� �� �� ���� �� 23 �� 70, � ����� �������� �������� �����������
	public void setAge(int age) {
		if(age>=23 && age<=70){
		this.age = age;
		}
		else{
		System.out.println("������� �� �����������.");
		System.exit(0);//��������� ��������
		}
	}

	//������ ����������, ������ ��� ��������� ��������� ������ ���������� �����, � ��� �������� ����� Setters 
	public Teacher(){};
	
	//����������� � ����������� ��������������� ��� ��������� ����� �� ����������� ��������� ���� ��������
	public Teacher(String firstName, String secondName, String lastName, int stag, int age) {
		this.FirstName = firstName;
		this.SecondName = secondName;
		this.LastName = lastName;
		this.stag = stag;
		this.setAge(age);
	};
	
	//���� ����� � �������(�� ����� ������� ������ �������) ����
	public void ShortOutput(){
		System.out.println("��������: "+LastName+" "+FirstName+" "+SecondName+", ��: "+age+", ����: "+stag+" ����.");
	}
	
	//���� ����� � �����(�� ����� ����������� � ������, � �������� ������ �������� �������� ��� ������� .toUpperCase()) ����
	public void UpperOutput(){
		System.out.println("��������: "+LastName.toUpperCase()+" "+FirstName.toUpperCase()+" "+SecondName.toUpperCase()+", ²�: "+age+", ����: "+stag+" ����.");
	}
	
}
