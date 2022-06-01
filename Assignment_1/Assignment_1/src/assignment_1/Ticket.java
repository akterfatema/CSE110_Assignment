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
public class Ticket {
    private String sitNumber,airportName,destination;
    private int ticketNumber;

    public Ticket() {
    }

    public Ticket(String sitNumber, String airportName, String destination, int ticketNumber) {
        this.sitNumber = sitNumber;
        this.airportName = airportName;
        this.destination = destination;
        this.ticketNumber = ticketNumber;
    }

    public String getSitNumber() {
        return sitNumber;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getDestination() {
        return destination;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
    
    public boolean confirmTicket(String confirm){
        if (confirm.equalsIgnoreCase("yes")) {
            return true;
        }
        else return false;
    }
}
