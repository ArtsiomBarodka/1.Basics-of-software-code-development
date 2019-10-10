/*
 * 1.Basics of software code development
 * Task 2
 * Найти max{min(a, b), min(c, d)}.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.branches;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a,b,c,d,result;
        System.out.println("Программа находит max(min(a,b),min(c,d))");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите значение a ");
            a = scanner.nextInt();
            System.out.println("Введите значение b ");
            b = scanner.nextInt();
            System.out.println("Введите значение c ");
            c = scanner.nextInt();
            System.out.println("Введите значение d ");
            d = scanner.nextInt();
            result = findMax(findMin(a,b), findMin(c,d));
            System.out.println("max(min("+a+","+b+"),min("+c+","+d+")) = " + result);
        }
    }

    public static int findMin(int x , int y){
        if(x<y){
            return x;
        } else {
            return y;
        }
    }

    public static int findMax(int x , int y){
        if(x>y){
            return x;
        } else {
            return y;
        }
    }
}
