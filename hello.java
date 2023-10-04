import java.awt.*;    
 import java.awt.event.*; 

public class hello extends Frame implements AcationListener {    
  
    TextField tf;
     hello() {  
        Frame f=new Frame();

      Label i=new Label("empoly id");

      Button b = new Button("submit");

      TextField t=new  TextField();

      b.setBounds(30,100,80,30); 

      i.setBounds( 20,30,70,60);
    
      t.setBounds(100,200,80,30);

     f.add(b); 
     f.add(i);
     f.add(t); 
  
          

            f.setSize(400,300);
            f.setTitle("employ id");
            f.setLayout(null);
            f.setVisible(true);

}    
  
 
public static void main(String args[]) {   
  
  
hello f = new hello();    
  
}  
  
}    
