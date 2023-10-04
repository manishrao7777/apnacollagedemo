import java.util.Scanner;
public class contact {
    String email;
    long mobileno;
    Scanner s1=new Scanner(System.in);
    public void get(){
        System.out.println("enter the email");
        email=s1.next ();
        System.out.println("enter the mobileno");
        mobileno=s1.nextLong();
    }
    void display()  {

    } 
 }


public class company extends contact{
    System.out.println("")
}