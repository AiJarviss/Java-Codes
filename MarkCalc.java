/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;

/**
 *
 * @author sound
 */
public class MarkCalc extends Student1
{
    public int Grade(int result){
    switch(result)
    {
        case 1:
            if(result>90){
                System.out.println("Excellent A+");
                break;
            }
        case 2:
            if(result>=80||result<90){
                System.out.println("A");
                break;
            }
        case 3:
            if(result<=70||result<80){
                System.out.println("B");
                break;
            }
        case 4:
            if(result>=60||result<70){
                System.out.println("C");
                break;
            } 
        case 5:
            if(result>=50||result<60){
                System.out.println("D");
                break;
            }
        case 6:
            if(result>=35||result<50){
                System.out.println("E");
                break;
            } 
        case 7:
            if(result<35){
                System.out.println("No grade");
                break;
            }    
    }
        return 0;
}
}