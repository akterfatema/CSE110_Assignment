package exceptionhandlingdemo;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.E;
import java.util.Formatter;
import java.util.Scanner;
import sun.applet.AppletViewer;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        //example1
        try {
       int x=10;
        int y=0;
        int res=x/y;
        System.out.println("result: "+res);
            int []a=new int[4];
            a[4]=10;
            
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e); 
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception: "+e2);
        }
        finally{
        System.out.println("last line of the code");
    } 
        /*
      //example2
   int count=1;
       do {            
            
        try {
        Scanner af=new Scanner(System.in);
        System.out.print("Please enter num1 : ");
        int num1=af.nextInt();
        System.out.print("Please enter num2 : ");
        int num2=af.nextInt();
        int result=num1/num2;
        System.out.println("Result: "+num1 + "/"+num2+" = "+result);
           count =2;
        } catch (Exception e) {
            System.out.println("Exception: "+e);
            System.out.println("You must enter an integer.Please try again.");
        }
       
       }while (count ==1)  ;   
        //folder
        File dir =new File("C:/Users/Fatema/Desktop/person");//etate package er moddhe file hoi
            dir.mkdir();//directory wil be created
          String dirLocation=dir.getAbsolutePath();//for location
          System.out.println(dirLocation);//we get in output thge folder location
          System.out.println(dir.getName());//in output we get the folder name
         if (dir.delete()) {//for delete
             System.out.println("folder has been deleted");
        }
         */

        //file
        /*
        File dir=new File("person");
        dir.mkdir();
        String path=dir.getAbsolutePath();
       File file1=new File(path+"/student.txt");
       File file2=new File(path+"/teacher.txt");
        try {
          file1.createNewFile();
          file2.createNewFile();
            System.out.println("files are created");
        } catch (Exception e) {
            System.out.println(e);
        }
        /*
        //file2 delete
        file2.delete();
        //file exist kore ki na
        if (file2.exists()) {//for file existing
            System.out.println("file exist");
        }
        else{
            System.out.println("file does not exist");
        }*/
        
       
       
    }

}
