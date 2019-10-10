/*
 * 1.Basics of software code development
 * Task 2
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a,b,h,y;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Программа находит значение функции " +
                    "на отрезке [a,b] с шагом h : " +
                    "y = (x, если x>2 и -x, если x<=2)");
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите h ");
            h = scanner.nextInt();
            for (int i = a; i <= b; i=i+h ) {
                y = toFindFunction(i);
                System.out.println("Значение функции = "+y);
            }
        }
    }

    public static int toFindFunction(int x){
        if(x>2){
            return x;
        } else {
            return -x;
        }
    }
}
