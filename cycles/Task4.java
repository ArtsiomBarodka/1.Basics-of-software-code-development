/*
 * 1.Basics of software code development
 * Task 4
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <=200 ; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i)
                                .multiply(BigInteger.valueOf(i)));
        }
        System.out.println("Произведение квадратов первых " +
                "двухсот чисел = " + bigInteger);
    }
}
