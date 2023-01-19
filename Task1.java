package Test_Tasks;

import java.util.Scanner;

public class Task1 {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите любое число: ");
            String sN = sc.nextLine();
            double N;
            try {
                N = Double.parseDouble(sN);

                if (N > 7) {
                        System.out.println("Привет");
                }
                break;
            } catch (Exception e) {
                System.out.println("Ошибка! Пожалуйста убедитесь, что вы ввели число.");
            }

        }
    }
}


