/*
 * 1.Basics of software code development
 * Task 1
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a,b,c,z ;
        System.out.println("Программа находит значение функции: ((a - 3)*b/2)+c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a ");
        a = scanner.nextDouble();
        System.out.println("Введите число b ");
        b = scanner.nextDouble();
        System.out.println("Введите число c ");
        c = scanner.nextDouble();
        z =  ((a - 3)*b/2)+c;
        System.out.println("Pначение функции: ((a - 3)*b/2)+c = "+z);
        scanner.close();
    }
}


