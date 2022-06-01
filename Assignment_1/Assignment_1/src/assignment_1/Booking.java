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
public class Booking {
    private  String From,To,Date,type,ChooseWay,ChooseAirlines;

    public Booking() {
    }

    public Booking(String From, String To, String Date, String type, String ChooseWay, String ChooseAirlines) {
        this.From = From;
        this.To = To;
        this.Date = Date;
        this.type = type;
        this.ChooseWay = ChooseWay;
        this.ChooseAirlines = ChooseAirlines;
    }

    public String getChooseWay() {
        return ChooseWay;
    }

    public String getChooseAirlines() {
        return ChooseAirlines;
    }
    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getDate() {
        return Date;
    }

    public String getType() {
        return type;
    }
   
   
            
}