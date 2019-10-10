/*
 * 1.Basics of software code development
 * Task 3
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double x,y,z ;
        System.out.println("Программа находит значение функции: ((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(xy)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x ");
        x = scanner.nextDouble();
        System.out.println("Введите число y ");
        y = scanner.nextDouble();
        z = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("Pначение функции: (sin(x)+cos(y))/(cos(x)-sin(y))*tg(xy) = "+ z);
        scanner.close();
    }
}
