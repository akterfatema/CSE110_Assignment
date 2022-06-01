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
public class TravelAgency {
    private String agencyName1="Novoair";
    private String agencyName2="Regent Airways";
    private int agEco1 = 3000;
    private int agPeco1 = 4000;
    private int agbusi1 = 5000;
    private int agfastCl1 = 6000;
   private int agEco2 = 3300;
    private int agPeco2 = 3900;
    private int agbusi2 = 5200;
    private int agfastCl2 = 5900;
    public TravelAgency() {
    }

    public TravelAgency(String agencyName1, String agencyName2) {
        this.agencyName1 = agencyName1;
        this.agencyName2 = agencyName2;
       
    }

    public String getAgencyName1() {
        return agencyName1;
    }
    public String getAgencyName2() {
        return agencyName2;
    }
public void CheapestTicketPrice(){
        System.out.println("Agency_1: "+agencyName1+"Economy Price: "+agEco1+" Premium Economy Price: "+agPeco1+" Business: "+agbusi1+" First Class: "+agfastCl1);
        System.out.println("Agency_2: "+agencyName2+"Economy Price: "+agEco2+" Premium Economy Price: "+agPeco2+" Business: "+agbusi2+" First Class: "+agfastCl2);
        System.out.println("Agency 1 has cheapest Economy class");
        System.out.println("Agency 2 has cheapest Premium Economy class ");
        System.out.println("Agency 1 has cheapest Business class ");
        System.out.println("Agency 2 has cheapest First class");
}
   
    
    
}
