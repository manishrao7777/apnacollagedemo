import java.util.Scanner;
public class bubble {
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        String s2=new String();
        String s3=new String();
        
        int [] a=new int [20];
        int i,j,k,flag=0,c=0,in,di=0,inc=0;

        System.out.println("how many value you want to write:");
         in=s1.nextInt();
         in=in-1;
         k=in;
         flag=in;
         for(i=0;i<=in;i++){
            System.out.println("enter the value ");
            a[i]=s1.nextInt();
         }
         for(i=in;i>=0;i--){
            for(c=0;c<=1;c++){
                if(inc<a[c]){
                    inc=a[c];
                }
            }
            for(j=0;j<1;j++){
                if(inc==a[j]){
                    di=a[i];
                    a[i]=a[j];
                    a[j]=di;
                }
            }
            inc=0;
         }
         for(i=0;i<k;i++){
            System.out.println(a[i]);
         }

    }
    
}
