import java.awt.*;  
import java.awt.event.*;  

class  add extends Frame implements ActionListener{  

TextField it; 

add(){  
  
 
it=new TextField();  
it.setBounds(60,10,170,20);  
Button b=new Button("click me");  
b.setBounds(20,120,10,30);  
  
 
b.addActionListener(this);  
  
  
        add(b);add(it);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
}  

public void actionPerformed(ActionEvent e){ 

it.setText("ooo bahii oooo ");

}  
public static void main(String args[]){  
new add();  
}  
}  
