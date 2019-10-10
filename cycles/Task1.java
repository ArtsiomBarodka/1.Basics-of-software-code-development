/*
 * 1.Basics of software code development
 * Task 1
 * Напишите программу, где пользователь вводит
 * любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count,result;
        System.out.println("Программа суммирует все числа от 1 до введенного");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите целое положительное число ");
            count = scanner.nextInt();
            while (count<=0){
                System.out.println("вы ввели не верное число!\n" +
                        "Введите целое положительное число");
                count = scanner.nextInt();
            }
            result = toCount(count);
            System.out.println("Результат = "+ result);
        }
    }

    public static int toCount(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
}
