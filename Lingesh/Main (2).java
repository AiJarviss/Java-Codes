/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int t1=1,t2=1,nt=0;
        for (int i=1;i<=10;i++) {
            System.out.println(t1+ " ");
            nt = t1 + t2;
            t1 = t2;
            t2 = nt;
        }
    }
}