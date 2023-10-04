import java.util.Scanner;
public class shape {
    String name ;
    int sides;
     Scanner s1=new Scanner(System.in);
    public void get(){
         
        System.out.println("enter the name");
        name=s1.next();
        System.out.println("enetr the sides ");
        sides=s1.nextInt();

    }
    
}
  class traingle extends shape {
    int base;
    int height;
    int area;

    public void get(){
        System.out.println("enter the base of traingal");
        base =s1.nextInt();
        area=height*base/2;
             
        System.out.println(" enter the height of traingle");
        height=s1.nextInt();
        System.out.println("enter the area of traingle"+area);
        
    }
        
    }
class square extends shape{
    int side;
    int area0;
    public void sq()
    {

        get();
        System.out.println("enter the the side of square");
        side=s1.nextInt();
        area0=side*side;
        System.out.println("area of square"+area0);
    }
}
public class classshp{
public  static void main(String[]args){
    Scanner s1=new Scanner(System.in);
    square sc=new square();

}
}


