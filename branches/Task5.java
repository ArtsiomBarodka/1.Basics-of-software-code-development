/*
 * 1.Basics of software code development
 * Task 5
 * Вычислить значение функции:
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.branches;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x;
        double result;
        System.out.println("Программа находит значение функции:" +
                "F(x) = (x^2-3x+9, если x<=3 и 1/х^3+6, если x>3)");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите x ");
            x = scanner.nextInt();
            result = findFunction(x);
            System.out.println("Значение функции = "+ result);
        }
    }

    public static double findFunction(int x){
        if(x<=3){
            return Math.pow(x,2)-3*x+9;
        } else {
            return 1/(Math.pow(x,3)+6);
        }
    }
}
