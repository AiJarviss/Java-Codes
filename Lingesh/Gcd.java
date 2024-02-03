/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Gcd 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente two Numbers:");
        int a=sc.nextInt();
        int a1=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=a&&i<=a1;i++)
        {
            if(a%i==0&&a1%i==0)
            {
                gcd=i;
            }
            System.out.println("Gcd"+gcd);
        }
    }
    
}
