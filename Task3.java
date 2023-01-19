package Test_Tasks;

//��������� ��������: �� ����� ���� �������� ������, ���������� ������� �������� ������� ������� 3
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������ ���� ������ � ���� ������?");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("��")) {
                System.out.println("������� ����� ����� ����� ������:");
                Scanner sc = new Scanner(System.in);
                String scString = sc.nextLine();
                String[] scStrings = scString.split(" ");
                int[] array1 = new int[scStrings.length];
                int counter1 = 0;
                try
                {
                    for(int i = 0; i < scStrings.length; i++) {
                        array1[i] = Integer.valueOf(scStrings[i]);
                        if (array1[i] % 3 == 0) {
                            counter1++;
                        }
                    }
                    String scN = Arrays.toString(array1);
                    System.out.println("��� ��� ������ "+scN);
                    int[] array2 = new int[counter1];
                    int counter2 = 0;

                    for (int j = 0; j < array1.length; j++) {
                        if (array1[j] % 3 == 0) {
                            array2[counter2] = array1[j];
                            counter2++;
                        }
                    }
                    String arr2 = Arrays.toString(array2);
                    System.out.println("��� ����� �������, ������� 3: " + arr2);
                }
                catch(Throwable t)
                {
                    System.out.println("������! � �������� ������� ���������� �� �������� ��������, ���������� ��� ���.");
                }

            } else if (s.equalsIgnoreCase("���")) {
                Scanner cycleSc;
                int[] array1, array2;
                int n, counter1, counter2;
                while (true) {
                    System.out.print("������� ����� �������: ");
                    try {
                        cycleSc = new Scanner(System.in);
                        n = cycleSc.nextInt();
                        array1 = new int[n];
                        break;
                    } catch (Exception e) {
                        System.out.println("�� ����� ����� ����� �����? ���������� ��� ���.");
                    }
                }

                counter1 = 0;

                for (int i = 0; i < array1.length; i++) {
                    while (true) {
                        System.out.print("������� " + (i + 1) + "-� ������� �������: ");
                        try {
                            cycleSc = new Scanner(System.in);
                            array1[i] = cycleSc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("�� ����� ����� ����� �����? ���������� ��� ���.");
                        }

                    }
                    if (array1[i] % 3 == 0) {
                        counter1++;
                    }
                }
                array2 = new int[counter1];
                counter2 = 0;

                for (int j = 0; j < array1.length; j++) {
                    if (array1[j] % 3 == 0) {
                        array2[counter2] = array1[j];
                        counter2++;
                    }
                }
                String arr2 = Arrays.toString(array2);
                System.out.println("��� �����, ������� 3: " + arr2);
                break;
            } else {System.out.println("� ��� �� �������, ������� ��������� �����");}

        }
    }
}





