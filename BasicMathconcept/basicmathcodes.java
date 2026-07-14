package BasicMathconcept;
import java.util.*;

public class basicmathcodes {
    static void printDigits(int num){
        while(num!=0){
            int digit =num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        printDigits(num);
    }

    
}
