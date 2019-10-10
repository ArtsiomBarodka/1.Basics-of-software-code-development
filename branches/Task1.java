/*
 * 1.Basics of software code development
 * Task 1
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.branches;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Программа проверяет существует ли " +
                "треугольник с двумя такими углами, " +
                "если да, то является ли он прямоугольным");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первый угол ");
            a = scanner.nextInt();
            System.out.println("Введите второй угол ");
            b = scanner.nextInt();
            if(isTriangle(a,b)){
                if(isRightTriangle(a,b)){
                    System.out.println("треугольник с углами "+ a+ " и " +
                            b+ " - существует и является прямоугольным" );
                } else {
                    System.out.println("треугольник с углами "+ a+ " и " +
                            b+ "- существует , но не является прямоугольным" );
                }
            } else {
                System.out.println("треугольник с углами "+
                        a+ " и " + b+ " -не существует" );
            }
        }
    }

    public static boolean isTriangle(int a, int b){
        if(a+b < 180){
            return true;
        }
        return false;
    }

    public static boolean isRightTriangle(int a, int b){
        if(a ==90 || b==90 || a+b==90){
            return true;
        }
        return false;
    }
}