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
        for (int i=row;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int sp=2*(row-i);
            for (int j=1;j<=sp;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=row;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int sp=2*(row-i);
            for (int j=1;j<=sp;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}