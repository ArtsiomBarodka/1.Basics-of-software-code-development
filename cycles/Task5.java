/*
 * 1.Basics of software code development
 * Task 5
 * Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double e;
        double sum = 0;
        int n = 1;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Программа находит сумму тех членов ряда " +
                    "модуль которых больше или равен заданному е.\n" +
                    "Общий член ряда имеет вид:" +
                    "Аn= 1/(2^n)+1/(3^n)");
            System.out.println("Введите e ");
            e = scanner.nextDouble();
            while (Math.abs(1/Math.pow(2,n) + 1/Math.pow(3,n)) >= e){
                sum = sum + 1/Math.pow(2,n) + 1/Math.pow(3,n);
                n++;
            }
            System.out.println(sum);
        }
    }
}
