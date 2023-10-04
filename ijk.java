
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class ijk {
    public static void main(String[] args) throws IOException
    {
        
    
    File i= new  File("nnn.txt");
    FileWriter fw=new FileWriter(i);
try{
   fw.write("java is aobject orienteds program");
   fw.close();
}
catch(IOException e){
    System.out.println("error");
    //e.printStackTrace();
}}}
    //try {

    

//     if(i.Exist(){
//  System.out.println("i.getname()");
//          System.out.println("i.Absolutpath()");
//          System.out.println("i.length");  
//     }
//     else{
//         System.out.println("file already exist");
//     }
// }
// catch(IOException e){
//     System.out.println("error");
//     e.printStackTrace();
// }