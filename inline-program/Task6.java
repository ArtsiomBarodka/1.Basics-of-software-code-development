/*
 * 1.Basics of software code development
 * Task 6
 * Для данной области составить линейную программу,
 * которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Программа проверяет лежит ли точка с " +
                "координатами (x,y) в закрашенной области");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите значение x ");
            x = scanner.nextInt();
            System.out.println("Введите значение y ");
            y = scanner.nextInt();
            if(isHitTheArea(x,y)){
                System.out.println("Точка с координатами ("+x+","+y+") " +
                        "лежит в закрашенной области" );
            } else {
                System.out.println("Точка с координатами ("+x+","+y+") " +
                        "не лежит в закрашенной области" );
            }
        }
    }
    public static boolean isHitTheArea(int x,int y){
        if(y>0&&y<=4){
            if(x<=2&&x>=-2){
                return true;

            }
            return false;
        } else if(y<=0&&y>=-3){
            if(x<=4&&x>=-4){
                return true;
            }
            return false;
        }
        return false;
    }
}
