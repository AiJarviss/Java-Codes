/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Amstrong {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=sc.nextInt();
        int num, remainder, result = 0, n = 0;

        num = a;

        for (;num != 0; num /= 10, ++n);

        num = a;

        for (;num != 0; num /= 10)
        {
            remainder = num % 10;
            result += Math.pow(remainder, n);
        }

        if(result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
    }
}
