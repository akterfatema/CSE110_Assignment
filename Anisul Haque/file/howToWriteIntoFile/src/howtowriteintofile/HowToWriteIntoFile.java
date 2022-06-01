/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtowriteintofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class HowToWriteIntoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       File af=new File("person");
       af.mkdir(); 
    File file1=new File("E:\\Spring_2021\\CSE110\\codes_java\\Anisul Haque\\file\\howToWriteIntoFile\\person\\Student.txt");
try {
            file1.createNewFile();
            System.out.println("files are created");
        } catch (Exception e) {
            System.out.println(e);
        } 
/* //by giviing direct input
         try {
            Formatter formatter = new Formatter("E:\\Spring_2021\\CSE110\\codes_java\\Anisul Haque\\file\\howToWriteIntoFile\\person\\student.txt");
            formatter.format("%s %s\r\n", "101", "fate");
            formatter.format("%s %s\r\n", "102", "tami");
            formatter.format("%s %s\r\n", "103", "fami");
            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } */
// write into file by loop
       String id, name;
        try {
            
            Formatter formatter = new Formatter("E:\\Spring_2021\\CSE110\\codes_java\\Anisul Haque\\file\\howToWriteIntoFile\\person\\student.txt");
            Scanner tf = new Scanner(System.in);
            System.out.print("how many student do you want : ");
            int num = tf.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Enetr student id and name: ");
                id = tf.next();
                name = tf.next();
                formatter.format("%s %s \r\n",id,name);
            }
formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
    }
    }  
}
