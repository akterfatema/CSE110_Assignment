/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author Fatema
 */
public class Passenger {
    private String Name,Email,PhoneNumber;
    int age,NumderOfPassengers;

    public Passenger() {
    }

    public Passenger(String Name, String Email, String PhoneNumber, int age,int numberOfPassenger) {
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.age = age;
        this.NumderOfPassengers = numberOfPassenger;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getNumderOfPassengers() {
        return NumderOfPassengers;
    }

    
    
}
