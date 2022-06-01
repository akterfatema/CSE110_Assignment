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
public class Teacher {
   String name,gender;
    int phone;
    Teacher(){
        System.out.println(" no value");
    }
   Teacher(String n,String m,int ph){
       name=n;
       gender=m;
       phone=ph;
   }
    void displyinformation(){
    System.out.println("Name : "+name );
        System.out.println("Gender : "+ gender );
        System.out.println("Name : "+ phone );
        System.out.println("");
}
}
