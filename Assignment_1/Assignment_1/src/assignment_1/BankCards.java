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
public class BankCards {
    private String accountName,password;
    private int accountId;

    public BankCards() {
    }

    public BankCards(String accountName, String password, int accountId) {
        this.accountName = accountName;
        this.password = password;
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountId() {
        return accountId;
    }
    
}
