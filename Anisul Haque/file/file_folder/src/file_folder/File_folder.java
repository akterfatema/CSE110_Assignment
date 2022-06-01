package file_folder;

import java.io.File;

public class File_folder {

    public static void main(String[] args) {
        //folder make
       // File af=new File("C:/Users/Fatema/Desktop/person");//by giving location file created
        File af=new File("person");
       af.mkdir();
        /*if (af.delete()) { //for delete
System.out.println("file has been deleted");
        }*/
        String path=af.getAbsolutePath();//by path we can easily create file without giving location in this program
        //File file1=new File("E:/Spring_2021/CSE110/codes_java/Anisul Haque/file/file_folder/person/Student.txt");
       // File file2=new File("E:/Spring_2021/CSE110/codes_java/Anisul Haque/file/file_folder/person/Teacher.txt");
       File file1=new File(path+"/student.txt");
       File file2=new File(path+"/teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created");
        } catch (Exception e) {
            System.out.println(e);
        } 
        //another file make
        File f=new File("Fatema");
       f.mkdir();
        
        
        
        } 
    }


