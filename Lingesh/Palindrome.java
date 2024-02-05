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
public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word:");
        String a=sc.next();
        StringBuffer sb=new StringBuffer(a);
        String a1=sb.reverse().toString();
        if(a.equals(a1))
        {
            System.out.print("this is palindorme");
        }
        else{System.out.print("this is not palindorme:");}
    }
}
