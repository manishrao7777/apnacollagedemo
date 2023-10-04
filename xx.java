import java.util.Scanner;
public class xx {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i,c=0;
        Scanner s1= new Scanner(System.in);
        String s2=new String();
        char ch=' ';
        System.out.println("enter String");
        s2=s1.nextLine();
        for(i=0;i<s2.length();i++);
        {
            if(s2.charAt(i)>='a' && s2.charAt(i)<='z'){
                ch=(char) (s2.charAt(i)-32);
            }
            System.out.println(ch);
        }
    }   } 