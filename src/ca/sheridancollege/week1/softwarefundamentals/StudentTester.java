/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;
//Tuesday, May 21st
public class StudentTester {
    public static void main(String[] args){
        
        //char[] pillbox=new char[7];
        //array of StudentDemo objects
        StudentDemo[] StudentLst=new StudentDemo[3];
        
        StudentDemo s1=new StudentDemo("Sheetal Thakar");
        s1.setId(123);
        
        StudentLst[0]=s1;
        
        StudentLst[1]=new StudentDemo("Amrit Kaur");
        StudentLst[2]=new StudentDemo("Malav Jani");
        
        for(StudentDemo StudentLst1 : StudentLst) {
            System.out.println(StudentLst1.getName());
            System.out.println(StudentLst1.getId());
            System.out.println();
        }//ends loop
    }//ends main
        
}//ends class
   

