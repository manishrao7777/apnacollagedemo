import java.util.Scanner;

public class op{
     
    public static void main(String[] args) {
        int i ,c=0;
        Scanner s1=new Scanner(System.in);
        String s2=new String();
        System.out.println("enter String");
        s2=s1.nextLine();
        for(i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
            c++;
        }
        System.out.println("vowel is"+c);
        }
     }