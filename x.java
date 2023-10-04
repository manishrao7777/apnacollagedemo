import java .util.*;
import java .lang.Exception;
import java.lang.Runnable;
public class x  extends Thread implements Runnable{
 public void run(){
    try
    {
    for (int i=1; i<=5; i++)
    {
        System.out.println("hello");
        Thread.sleep(2000);
    }}
    catch(Exception e)
    {
    System.out.println("error");

    }
    
 }   

public static void main(String[] args) {
    x h1=new x();
    h1.start();
        
       try{ 
        for(int j=0; j<=5; j++)
        {
            System.out.println("how");
              Thread.sleep(2000);   
        }}
        catch( Exception e)
        {
            System.out.println("error");
        }
     }
    }

