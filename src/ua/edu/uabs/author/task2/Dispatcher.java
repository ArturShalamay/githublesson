package ua.edu.uabs.author.task2;

public class Dispatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������������ ������� ������������
		Student stud1 = new Student();
		
		//��������� ����� ����� SETTERS
		stud1.setFirstName("����");
		stud1.setLastName("������");
		stud1.setSecondName("��������");
		stud1.setAge(20);
		stud1.setAvggrade(95);
		stud1.ShortOutput();//������� ��������� ���������
		stud1.UpperOutput();//������� ������� ���������
		
		//������������ ������������ � ����������� �� ��������� ����� ����� ����� �����
		Student stud2 = new Student("�����", "��������", "������", 88, 18);
		stud2.ShortOutput();
		stud2.UpperOutput();
		
		//������������ ������������ � ����������� �� ��������� ����� ����� ����� �����
		Student stud3 = new Student("�������", "������", "�������", 90, 21);
		stud3.ShortOutput();//������� ��������� ���������
		stud3.UpperOutput();
		
		System.out.println();//������ ��� �������� ��� ������ ������ ������
		
		//������������ ������� ������������
		Teacher teach1 = new Teacher();
		teach1.setFirstName("�����");
		teach1.setLastName("������");
		teach1.setSecondName("���������");
		teach1.setAge(24);
		teach1.setStag(2);
		teach1.ShortOutput();//������� ��������� ���������
		teach1.UpperOutput();
		
		//������������ ������������ � ����������� �� ��������� ����� ����� ����� �����
	    Teacher teach2 = new Teacher("�����","��������","������",12, 50);
	    teach2.ShortOutput();//������� ��������� ���������
	    teach2.UpperOutput();//������� ������� ���������
	    
	    System.out.println();//������ ��� �������� ��� ������ ������ ������
	    
	    //������������ ������������ � ����������� �� ��������� ����� ����� ����� �����
	    Dean dn1 = new Dean("�����","���������", "������", 100, 210);
	    dn1.ShortOutput();//������� ��������� ���������
	    dn1.UpperOutput();//������� ������� ���������
	}

}
