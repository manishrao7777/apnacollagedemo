import java.util.Scanner; 
public class in {
    int  name;
    int salary;
    public void getdata(){
        Scanner s1=new Scanner(System.in);
        name =s1.nextInt();
        salary=s1.nextInt();
    }
    
};
class manager extends in{
    public void setdata(){
        System.out.println("name");
        System.out.println("salary");
    }
};
public static void main(String[] args) {
    
   manager m1=new manager();
    m1.getdata();
};

