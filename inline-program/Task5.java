/*
 * 1.Basics of software code development
 * Task 5
 *  Дано натуральное число Т, которое представляет
 *  длительность прошедшего времени в секундах.
 *  Вывести данное значение длительности в часах,
 *  минутах и секундах в следующей форме: ННч ММмин SSc
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.inline_program;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int t,sec,min,hour ;
        System.out.println("Программа выводит заданное значение в секундах " +
                "в формате : ННч ММмин SSс ");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите значение  ");
            t = scanner.nextInt();
            if(t/60 < 1){
                sec = t;
                System.out.println("Ответ: " + sec + "с ");
            } else if ((t/3600 < 1)){
                min = t/60;
                sec = t-min*60;
                System.out.println("Ответ: " + min + "мин "+ sec + "с ");
            } else {
                hour = t/3600;
                min = (t-hour*3600)/60;
                sec = t-(hour*3600+min*60);
                System.out.println("Ответ: " + hour + "ч " + min + "мин "+ sec + "с ");
            }
        }
    }
}
