/*
 * 1.Basics of software code development
 * Task 4
 *  Дано действительное число R вида nnn.ddd
 *  (три цифровых разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        DecimalFormat myFormatter = new DecimalFormat("###.###");
        double x,z ;
        System.out.println("Программа меняет местами дробную и целую части числа ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число вида nnn.ddd ");
        x = scanner.nextDouble();
        z = x % 1*1000 + Math.floor(x)/1000;
        String output = myFormatter.format(z);
        System.out.println("Ответ: "+ output);
        scanner.close();
    }
}
