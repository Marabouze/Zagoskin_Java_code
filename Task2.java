package Test_Tasks;

import java.util.Scanner;

//��������� ��������: ���� ��������� ��� ��������� � ��������, �� ������� �������, ��������, ���� ���, �� ������� "��� ������ �����"
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ���� ���: ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("��������") || name.equalsIgnoreCase("Vyacheslav") ) {
            System.out.println("������, ��������");
        } else {
            System.out.println("��� ������ �����");
        }
    }
}
