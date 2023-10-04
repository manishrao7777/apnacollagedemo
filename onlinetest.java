import java.awt.*;
import java.awt.event.*;


public class onlinetest extends Frame  implements ActionListener {

        TextField tf;
        Button b1=new Button(lable:"Next");
        Label l1=new Lable();
        CheckboxGroup=new checkboxGroup();
        int index=0;

        public void set()
        {
            if (index==0)
            {
                Lable  l1= new Label("what is thr data base of int");

                Checkbox checkbox1 =new checkbox1(Lable:"int ",cbg,stste:false);
                checkbox1 .setBounds(x:40, y:110, width:50, HEIGHT:20);
                add(checkbox1);
                Checkbox checkbox2=new checkbox(Lable:"char",cbg,state:false);
                checkbox2.setBounds(x:40, y:140, WIDTH:50, HEIGHT:20);
            }
        }

    
}