/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;
import java.util.Scanner;
public class Student
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student1 stu1=new Student1();
        MarkCalc Stu2=new MarkCalc();
        System.out.print("Student name:");
        String Stuname=sc.nextLine();
        stu1.setStuname(Stuname);
        System.out.print("Student Rollno:");
        String Rollno=sc.nextLine();
        stu1.setRollno(Rollno);
        System.out.print("Department:");
        String Dep=sc.nextLine();
        stu1.setDep(Dep);
        System.out.print("Current Year:");
        String CurrentYear=sc.nextLine();
        stu1.setCurrentyear(CurrentYear);
        System.out.print("M1:");
        int Mark1=sc.nextInt();
        stu1.setMark1(Mark1);
        System.out.print("M2:");
        int Mark2=sc.nextInt();
        stu1.setMark2(Mark2);
        System.out.print("M3:");
        int Mark3=sc.nextInt();
        stu1.setMark3(Mark3);
        System.out.println("\t\t\tStudent Name:"+stu1.getStuname());
        System.out.println("\t\t\tStudent Rollno:"+stu1.getRollno());
        System.out.println("\t\t\tDepartment:"+stu1.getDep());
        System.out.println("\t\t\tCurrent Year:"+stu1.getCurrentyear());
        System.out.println("\t\t\tM1:"+stu1.getMark1());
        System.out.println("\t\t\tM2:"+stu1.getMark2());
        System.out.println("\t\t\tM3:"+stu1.getMark3());
        System.out.println("\t\t\tTotalMarks:"+stu1.Totalmarks());
        System.out.println("\t\t\tAverage:"+stu1.Average());
        System.out.println("\t\t\tResult:"+stu1.Result()+"%");
        if(stu1.Average()>35)
        {
            System.out.println("\t\t\tStudent Passed ");
            System.out.print("\t\t\twith the grade of:"+Stu2.Grade((int) stu1.result));
            
        }
        else{
            System.out.println("\t\t\tStudent Failed");
        }
        
        
    }
    
}
