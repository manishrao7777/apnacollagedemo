import java.util.Scanner;
public class mm{
     public static int square(){
        Scanner s1=new Scanner(System.in);
        int sq;
        System.out.println("enter the sq of square:");
        sq=s1.nextInt();
        sq=sq*sq;
        return sq;
        
    }
    public static double circle1( int r){
        Scanner s2=new Scanner(System.in);
        
        //System.out.println("enter the r of circle:");
        //r=s2.nextInt();
        return 3.14*r;
    }
    
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        int cho,sq,base,length;
int r1;

int j=square();
System.out.println(j);
System.out.println("area of circle:"+ circle1(j));

    //     System.out.println("1.area of square");
    //     System.out.println("2.area of circle");
    //     System.out.println("3.area of rectangle");
    //     System.out.println("4.area of tringle") ;
    //     System.out.println("enter your choise:");
    //        cho=s1.nextInt();
           
    //        switch(cho){
    //         case 1:float j=square();
            
    //         break;
             
    //         case 2:
    //         break
    //         case 3:
    //         break;

    //         default:
    //         break;
    //        }
    //        System.out.println("the area is "+sq);
    // }
}}