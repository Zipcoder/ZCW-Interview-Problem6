package io.zipcoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int result;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            result = x/y;
            System.out.println(result);
        }
        catch(InputMismatchException e) {
            System.out.println(e);
        }
    }
//    public static void main(String[] args){
//        String word = "Wes is Red";
////        System.out.println("Hello donny");
//        System.out.println(reverse(word));
//    }
//    public static String reverse(String word){
//        if(word.length()==1){
//            return word;
//        }
//        return word.charAt(word.length()-1)+reverse(word.substring(0,word.length()-1));
//    }
}
