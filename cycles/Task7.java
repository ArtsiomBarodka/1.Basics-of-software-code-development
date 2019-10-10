/*
 * 1.Basics of software code development
 * Task 7
 * Для каждого натурального числа в промежутке от m до n
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int m, n;
        String result = "";
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число m");
            while (!scanner.hasNextInt()){
                System.out.println("Введите число m");
                scanner.next();
            }
            m = scanner.nextInt();
            System.out.println("Введите число n");
            while (!scanner.hasNextInt()){
                System.out.println("Введите число n");
                scanner.next();
            }
            n = scanner.nextInt();
        }
        for (int i = m; i <= n; i++) {
            result = result+ "Число - "+i + ": ";
            for (int j = 2; j < i ; j++) {
                if(i%j == 0){
                    result = result+j+ ", ";
                }
            }
            result = result + "\n";
        }
        System.out.println(result);
    }
}
