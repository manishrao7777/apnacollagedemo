import java.util.Scanner;
public class il{
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        String s2=new String();
        int i,b=0;
        System.out.println("enter String");
        s2=s1.nextLine();
        for(i=0;i<s2.length();i++){
            b++;
        }
System.out.println("the length is"+b);
    }
}
   