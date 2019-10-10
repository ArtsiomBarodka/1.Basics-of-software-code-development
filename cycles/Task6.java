/*
 * 1.Basics of software code development
 * Task 6
 * Вывести на экран соответствий между символами и
 * их численными обозначениями в памяти компьютера.
 * Artsiom Barodka
 *
 */
package basics_of_software_code_development.cycles;

public class Task6 {
    public static void main(String[] args) {
        String firstIndex = "";
        String secondIndex = "";
        String thirdIndex = "";
        String fourthIndex = "";
        String result = "";
        for (int m = 0; m <=15 ; m++) {
            firstIndex = ""+toCheck(m);
            for (int k = 0; k <=15 ; k++) {
                secondIndex = firstIndex+toCheck(k);
                for (int i = 0; i <=15 ; i++) {
                    fourthIndex = secondIndex+toCheck(i);
                    for (int j = 0; j <= 15; j++) {
                        thirdIndex = fourthIndex+toCheck(j);
                        result = String.valueOf(Character
                                .toChars(Integer.parseInt(thirdIndex, 16)));
                        System.out.printf("\\u%s =  %s \n",thirdIndex,result);
                    }
                }
            }
        }
    }
    public static String toCheck(int x){
        if (x==10){
                return "A";
        } else if(x == 11){
                return "B";
        } else if (x == 12 ){
                return "C";
        } else if (x == 13){
                return "D";
        } else if (x == 14 ){
                return "E";
        } else if (x == 15){
                return "F";
        } else {
                return ""+x;
        }
    }
}
