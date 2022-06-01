/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtoreadintofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class HowToREadIntoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            File file = new File("E:\\Spring_2021\\CSE110\\codes_java\\Anisul Haque\\file\\howToWriteIntoFile\\person\\Student.txt");
            //File file = new File("E:\\Spring_2021\\CSE110\\lab2_prob2.txt");
            Scanner af = new Scanner(file);
            while (af.hasNext()) {
                String id = af.next();
                String name = af.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
            af.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
