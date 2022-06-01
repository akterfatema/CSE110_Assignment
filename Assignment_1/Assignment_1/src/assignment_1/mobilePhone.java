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
public class mobilePhone {
    private String mobileNumber,pin;

    public mobilePhone() {
    }

    public mobilePhone(String mobileNumber, String pin) {
        this.mobileNumber = mobileNumber;
        this.pin = pin;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPin() {
        return pin;
    }
    
}
