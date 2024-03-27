/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingesh;

/**
 *
 * @author sound
 */
public class Student1 
{
     String Stuname;
     String Rollno;
     String dep;
     String currentyear;
     int mark1;
     int mark2;
     int mark3;
     int Totalmarks;
     int Average;
     float result;

    public void setStuname(String Stuname) {
        this.Stuname = Stuname;
    }

    public void setRollno(String Rollno) {
        this.Rollno = Rollno;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setCurrentyear(String currentyear) {
        this.currentyear = currentyear;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }
     public void setMark2(int mark) {
        this.mark2 = mark;
    }
      public void setMark3(int mark) {
        this.mark3 = mark;
    }
      
        
    public String getStuname() {
        return Stuname;
    }

    public String getRollno() {
        return Rollno;
    }

    public String getDep() {
        return dep;
    }

    public String getCurrentyear() {
        return currentyear;
    }

    public int getMark1() {
        return mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public int getMark3() {
        return mark3;
    }
    public int Totalmarks(){
        return mark1+mark2+mark3;
    }
    public int Average(){
        return Totalmarks()/3;
    }
    public float Result(){
        return Average();
    }
    
}
