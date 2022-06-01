/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner af=new Scanner(System.in);
        System.out.print("Name: ");
        String Name=af.next();
        System.out.print("Email: ");
        String Email=af.next();
        System.out.print("Phone Number: ");
        String PhoneNumber=af.next();
        System.out.print("Age: ");
        int age=af.nextInt();
        Passenger pub=new Passenger(Name, Email, PhoneNumber, age,);
        System.out.print("From: ");
        String From=af.next();
        System.out.print("To: ");
        String To=af.next();
        System.out.print("Date: ");
        String Date=af.next();
        System.out.println("Inter the type: ");
        String type=af.next();
        Booking b=new Booking(From, To, Date,type);
        
}
}