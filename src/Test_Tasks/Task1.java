package Test_Tasks;

import java.util.Scanner;

public class Task1 {
    //��������� ��������: ���� ��������� ����� ������ 7, �� ������� �������
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            System.out.print("������� ����� �����: ");
            String sN = sc.nextLine();
            double N;
            try {
                N = Double.parseDouble(sN);
                check = true;
                if (N > 7) {
                        System.out.println("������");
                }
            } catch (Exception NaN) {
                System.out.println("������! ���������� ���������, ��� �� ����� �����.");
            }

        }
    }
}


