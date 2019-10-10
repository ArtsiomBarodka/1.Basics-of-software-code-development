/*
 * 1.Basics of software code development
 * Task 2
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a,b,c,z ;
        System.out.println("Программа находит значение функции: (b+(b^2+4*a*c)корень2)/2 + a^3*c +b^-2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a ");
        a = scanner.nextDouble();
        System.out.println("Введите число b ");
        b = scanner.nextDouble();
        System.out.println("Введите число c ");
        c = scanner.nextDouble();
        z = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2 + Math.pow(a,3)*c +Math.pow(b,-2);
        System.out.println("Pначение функции: (b+(b^2+4*a*c)корень2)/2 + a^3*c +b^-2 = "+ z);
        scanner.close();
    }
}
