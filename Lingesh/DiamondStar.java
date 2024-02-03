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
public class DiamondStar
{	
	public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
		sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter Hollow Diamond inside a Square Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Hollow Diamond Star Pattern inside a Square");
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = i ; j <= rows; j++ ) 
			{
				System.out.print("*");
			}
			for (j = 1 ; j <= 2 * i - 2; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = i ; k <= rows; k++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= i; j++ ) 
			{
				System.out.print("*");

			}
			for (k = 2 * i - 2 ; k < 2 * rows - 2; k++ ) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i; k++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
