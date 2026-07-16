package Recursionconcept;
import java.util.*;
// Print sum of first n number using recursion 
/*public class Recursionfunctioncodes {
    static void f(int i,int sum){
        if(i<1){
            System.out.print(sum);
            return ;
        }
        f(i - 1, sum + i);

    }
    public static void main(String[]args){
        int n=6;
        f(n,0);
    }
    
}*/

//Print sum of first n number using  functional recursion 
/*public class Recursionfunctioncodes{
    static int f( int n){
        if(n==0){
            return 0;
        }
        return n+f(n-1);
    }

public static void main(String[]args){
    int n=6;
    System.out.print(f(n));
}}*/

//Print factorial of a number using recursion
/*ublic class Recursionfunctioncodes {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}*/
