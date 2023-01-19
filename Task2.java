package Test_Tasks;

import java.util.Scanner;

//—оставить алгоритм: если введенное им€ совпадает с ¬€чеслав, то вывести Уѕривет, ¬€чеславФ, если нет, то вывести "Ќет такого имени"
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите ваше им€: ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("¬€чеслав") || name.equalsIgnoreCase("Vyacheslav") ) {
            System.out.println("ѕривет, ¬€чеслав");
        } else {
            System.out.println("Ќет такого имени");
        }
    }
}
