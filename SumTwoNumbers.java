#hackerrank starter code to add tow numbers fed from stdin and send sum to stdout

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SumTwoNumbers {

    static int solveMeFirst(int a, int b) {
         // Hint: Type return a+b; below 
        return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
