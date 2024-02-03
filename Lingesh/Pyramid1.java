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
public class Pyramid1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int row=sc.nextInt();
        int st=0;
       for(int i=1;i<=row;i++,st=0)
        {
            for(int sp=1;sp<=row-i;sp++)
            {
                System.out.print(" ");
                    
            }
            while(st!=2*i-1)
            {
                System.out.print("*");
                st++;
            }
            System.out.println();
        }
        
    }
}
