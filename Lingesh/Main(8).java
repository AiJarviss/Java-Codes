/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd=0;
        for (int i=1;i<=num1&&i<=num2;i++) {
            if (num1%i==0&&num2%i==0) {
                gcd=i;
            }
        }
        System.out.println("GCD = "+gcd);
    }
}