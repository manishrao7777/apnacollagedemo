import java.util.Scanner;
public class fre {
    public static void main(String[] args) {
        Scanner  Scanner =new Scanner(System.in);
        System.out.println("enter the string");
        String input=Scanner.nextLine();
         
        int[]freq =new int[300];
         
        for( int i=0;i<input.length();i++)
        {
               char ch =input.charAt(i);
               freq[ch]++;
        }
        System.out.println("Characters and their  frequency:");
        for(int j=0;j<freq.length;j++){
            if(freq[j]!=0){
                System.out.println("the characters"+(char)j +"frequency is"+freq[j]+"times");
            }
        }
    }
    
}
