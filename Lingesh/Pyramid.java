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
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int Row=scanner.nextInt();
            System.out.println();
        for (int i=Row; i>=1;i--) 
        {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
    
        }
    }    
}