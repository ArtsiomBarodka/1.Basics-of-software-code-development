/*
 * 1.Basics of software code development
 * Task 3
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.branches;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int x1,y1,x2,y2,x3,y3;
        System.out.println("Программа проверяет, будут ли три точки: " +
                "А(х1,у1),В(х2,у2),С(х3,у3) лежать на одной прямой");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите значение х1 ");
            x1 = scanner.nextInt();
            System.out.println("Введите значение у1 ");
            y1 = scanner.nextInt();
            System.out.println("Введите значение х2 ");
            x2 = scanner.nextInt();
            System.out.println("Введите значение у2 ");
            y2 = scanner.nextInt();
            System.out.println("Введите значение х3 ");
            x3 = scanner.nextInt();
            System.out.println("Введите значение у3 ");
            y3 = scanner.nextInt();
            if(isOneStraightLine(x1,y1,x2,y2,x3,y3)){
                System.out.println("Nочки: А("+x1+","+y1+"),В("+x2+","+y2+")" +
                        "С("+x3+","+y3+") лежат на одной прямой");
            } else {
                System.out.println("Nочки: А("+x1+","+y1+"),В("+x2+","+y2+")" +
                        "С("+x3+","+y3+") не лежат на одной прямой");
            }
        }
    }

    public static boolean isOneStraightLine(int x1, int y1,int x2,
                                            int y2,int x3,int y3){
        boolean result = (x1-x3)/(x2-x3)==(y1-y3)/(y2-y3);
        return result;
    }
}
