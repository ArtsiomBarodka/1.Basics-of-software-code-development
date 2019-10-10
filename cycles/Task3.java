/*
 * 1.Basics of software code development
 * Task 3
 * Найти сумму квадратов первых ста чисел.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <=100 ; i++) {
            result = result+(int)Math.pow(i,2);
        }
        System.out.println("Сумма квадратов первых ста чисел = " + result);
    }
}
