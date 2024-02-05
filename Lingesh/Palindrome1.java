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
public class Palindrome1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a para:");
        String a=sc.next();
        StringBuffer sb=new StringBuffer(a);
        String a1[]=a.split(a);
        for(String x:a1)
        {
            System.out.println(x);
        }
        
                
    }
}
