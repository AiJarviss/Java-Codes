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
public class Pronic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a=sc.nextInt();
        int i=1,pro;
        while(i<=a){
            pro=i*(i+1);
            if(pro==a){
                System.out.println(a+ "Is pronic Number");
                break;
            }
            else if(pro<a){
                    i++;continue;
                           }
            else{
                System.out.println(a+ "Is not a pronic number");
                break;
            }
        }
     }
}
