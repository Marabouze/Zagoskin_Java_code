package Test_Tasks;

import java.util.Scanner;

public class Task1 {
    //��������� ��������: ���� ��������� ����� ������ 7, �� ������� �������
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����� �����: ");
            String sN = sc.nextLine();
            double N;
            try {
                N = Double.parseDouble(sN);

                if (N > 7) {
                        System.out.println("������");
                }
                break;
            } catch (Exception e) {
                System.out.println("������! ���������� ���������, ��� �� ����� �����.");
            }

        }
    }
}


