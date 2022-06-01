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
public class creditCards {
    private String accountName,AccountNumber,password;

    public creditCards() {
    }

    public creditCards(String accountName, String AccountNumber, String password) {
        this.accountName = accountName;
        this.AccountNumber = AccountNumber;
        this.password = password;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getPassword() {
        return password;
    }
     
}
