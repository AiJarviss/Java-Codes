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
public class atm {

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int p=1910;
		System.out.println("Enter the Pin Number:");
		int p1=sc.nextInt();
		if(p1>=1111 && p1<=9999)
		{
			System.out.println("Enter the Amount:");
                        int a;
			a=sc.nextInt();
			if(a%100==0)
			{
				System.out.println(a + "is Withdrawn");
			}
			else
			{
				System.out.println("The amount is Not Valid");
			}
		}

                else
		{
			System.out.println("The Pin Number is In Correct");
		}
	}
}


