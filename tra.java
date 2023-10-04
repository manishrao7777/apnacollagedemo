import java.util.Scanner;
interface tra{
     
   public  void getdata();
    public void setdata();
}
class showroom implements tra{
       Scanner s1=new Scanner (System.in);
      public void getdata(){
        System.out.println("enter the name of showroom");
        int name=s1.nextInt();
        System.out.println("enter the adders of showroom");
        int add=s1.nextInt();
        System.out.println("enter the no of car");
        int car=s1.nextInt();
       }
      public void setdata(){
        System.out.println("enter the name of showroom");
        System.out.println("enter the addres of showroom");
        System.out.println("enter the no of car");
       }
       class employe implements showroom {
        Scanner s2=new Scanner(System.in);
         public void getdata(){
            System.out.println("enter the name of emp");
            int emp=s2.nextInt();
            System.out.println("enter the empid");
            int empid=s2.nextInt();
            System.out.println("enter the empno");
            int empno=s2.nextInt();

         }  
         public void setdata() {
             System.out.println("enter the name of emp");
             System.out.println("enter the empid");
             System.out.println("enter the empno");  
         } 
    }
}