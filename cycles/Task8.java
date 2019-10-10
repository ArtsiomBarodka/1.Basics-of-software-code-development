/*
 * 1.Basics of software code development
 * Task 8
 * Даны два числа. Определить цифры,
 * входящие в запись как первого так и второго числа.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        long longA;
        long longB;
        String strA;
        String strB;
        String result;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число А");
            while (!scanner.hasNextLong()){
                System.out.println("Введите число А");
                scanner.next();
            }
            longA = scanner.nextLong();
            System.out.println("Введите число B");
            while (!scanner.hasNextLong()){
                System.out.println("Введите число B");
                scanner.next();
            }
            longB = scanner.nextLong();
        }
        strA = String.valueOf(longA);
        strB = String.valueOf(longB);
        if(longA >= longB){
            result = comp(strA, strB);
        } else {
            result = comp(strB, strA);
        }
        System.out.println(result);
    }

    public static String comp(String a, String b){
        String result="";
        Character x,y;
        Character [] array = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i <= a.length()-1; i++) {
            x= a.charAt(i);
            for (int j = 0; j <=b.length()-1 ; j++) {
                y = b.charAt(j);
                if (x.equals(y)){
                    for (int k = 0; k <= array.length-1; k++) {
                        if(x.equals(array[k])){
                            result = result.concat(x.toString());
                            array[k]= null;
                        }
                    }
                }
            }
        }
        return result;
    }
}
