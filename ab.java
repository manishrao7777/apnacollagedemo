
abstract class ab {
    abstract void print();
}
  
class Employee extends ab {
    void print() {
        String name = "Raman ";
        int age = 21;
        float salary = 25000;
        int emp_no=12;
        String email="mrao03377@gmail.com";
        
  
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(emp_no);
        System.out.println(email);
        
  
    }
  
}
  class Base {
    public static void main(String args[]) {
        ab s = new Employee();
        s.print();
    }
}