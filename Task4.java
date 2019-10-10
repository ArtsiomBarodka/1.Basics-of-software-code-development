/*
 * 1.Basics of software code development
 * Task 4
 * Заданы размеры А, В прямоугольного отверстия и
 * размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.branches;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a,b,x,y,z;
        System.out.println("Программа проверяет пройдет ли кирпич со сторонами x,y,z " +
                "в отверстие со сторонами A,B");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите значение A ");
            a = scanner.nextInt();
            System.out.println("Введите значение B ");
            b = scanner.nextInt();
            System.out.println("Введите значение х ");
            x = scanner.nextInt();
            System.out.println("Введите значение у ");
            y = scanner.nextInt();
            System.out.println("Введите значение z ");
            z = scanner.nextInt();
            if(isPassed(a,b,x,y,z)){
                System.out.println("Кирпич со сторонами x="+x+",y="+y+",z="+z+" " +
                        "проходит в отверстие со сторонами A="+a+",B="+b+" ");
            } else {
                System.out.println("Кирпич со сторонами x="+x+",y="+y+",z="+z+" " +
                        "не проходит в отверстие со сторонами A="+a+",B="+b+" ");
            }
        }
    }

    public static boolean isPassed(int A, int B, int x, int y, int z){
        if(A>=x){
            if(B>=y||B>=z){
                return true;
            } else {
                return false;
            }
        } else if(A>=y){
            if(B>=x||B>=z){
                return true;
            } else {
                return false;
            }
        } else if(A>=z){
            if(B>=x||B>=y){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
