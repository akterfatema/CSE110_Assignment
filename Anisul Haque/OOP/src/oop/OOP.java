/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Fatema
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Teacher teacher1=new Teacher("Fatema","Female",1757751284);
  
   teacher1.displyinformation();
       
    Teacher teacher2=new Teacher("Tamim", "Male", 1312735424);//create
   teacher2.displyinformation();
     Teacher teacher3=new Teacher();
 teacher3.displyinformation();
    }
    
}
