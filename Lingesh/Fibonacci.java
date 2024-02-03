/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;

/**
 *
 * @author ASUS
 */
public class Fibonacci 
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Series");
        int a=1,t1=1,t2=1,nt=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(t1+"");
            nt=t1+t2;
            t1=t2;
            t2=nt;
        }
    }
}
