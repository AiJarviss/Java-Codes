/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;

/**
 *
 * @author ASUS
 */
class While {
    public static void main(String[] args){
        int a=1;
        while(a<=20){
            if(a%2==1){
                a++;
                continue;
            }
            else{
                 System.out.println(a);
            }
            a+=2 ;
            
         }
    }
}
