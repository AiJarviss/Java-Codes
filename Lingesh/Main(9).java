/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int row = sc.nextInt();
        int st = 0;
        for (int i=1;i<=row;i++,st=0) {
            for (int sp=1;sp<=row-i;sp++) {
                System.out.println(" ");
            }
            while (st!=2*i-1) {
                System.out.println("*");
                st++;
            }
        }
    }    
}