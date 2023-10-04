
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


class Quizhello extends JFrame implements ActionListener {
    JPanel panel;
    JRadioButton choice1;
    JRadioButton choice2;
    JRadioButton choice3;
    JRadioButton choice4;
    ButtonGroup bg;
    JLabel lblmess;
    JButton btnext;
    String[][] xy;
    String[][] xyz;
    int qaid;
     HashMap<Integer, String> map;

    Quizhello() {
        hii();
        setTitle("Quiz Program");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(430, 350);
        setLocation(300, 100);
        setResizable(false);
        Container cont = getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.GRAY);
        bg = new ButtonGroup();
        choice1 = new JRadioButton("Choice1", true);
        choice2 = new JRadioButton("Choice2", false);
        choice3 = new JRadioButton("Choice3", false);
        choice4 = new JRadioButton("Choice4", false);

        bg.add(choice1);
        bg.add(choice2);
        bg.add(choice3);
        bg.add(choice4);
        lblmess = new JLabel("Choose a correct answer");
        lblmess.setForeground(Color.BLUE);

        lblmess.setFont(new Font("Arial", Font.BOLD, 11));
        btnext = new JButton("Next");
        btnext.setForeground(Color.BLUE);
        btnext.addActionListener(this);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLocation(10, 10);
        panel.setSize(400, 300);
        panel.setLayout(new GridLayout(6, 2));
        panel.add(lblmess);
        panel.add(choice1);
        panel.add(choice2);
        panel.add(choice3);
        panel.add(choice4);
        panel.add(btnext);
        cont.add(panel);

        setVisible(true);
        qaid = 0;
        call(qaid);
    }

    public void actionPerformed(ActionEvent e) {
        if (btnext.getText().equals("Next"))
         {
            if (qaid < 9)
             {
                map.put(qaid, getSelection());
                qaid++;
                call(qaid);
            }
            else {
                map.put(qaid, getSelection());
                btnext.setText("Show answers");
            }
        }
        else if
         (btnext.getText().equals("Show answers"))
          {
            new Report();
        }
    }

    public void hii() {
        
        xyz = new String[10][5];

        xyz[0][0] = "what is the full form of awt";
        xyz[0][1] = "javac JavaProgram";
        xyz[0][2] = "Abstract Window Toolkit.";
        xyz[0][3] = "both a,b";
        xyz[0][4] = "None of the above";

        xyz[1][0] = "What is the full form of atm";
        xyz[1][1] = "It is used to print text on the screen.";
        xyz[1][2] = "Automated Teller Machine";
        xyz[1][3] = "both a,b";
        xyz[1][4] = "none of the above";

     
        xyz = new String[4][2];

        xyz[0][0] = "what is the full form of awt";
        xyz[0][1] = "Abstract Window Toolkit";

        xyz[1][0] = "What is the full form of atm";
        xyz[1][1] = "Automated Teller Machine";

       


       
        map = new HashMap<>();
    }

    public String getSelection()
     {
        String selectedChoice = null;
        Enumeration<AbstractButton> buttons = bg.getElements();
        while (buttons.hasMoreElements())
         {
            JRadioButton temp = (JRadioButton) buttons.nextElement();

            if (temp.isSelected()) 
            {
                selectedChoice = temp.getText();
            }
        }
        return (selectedChoice);
    }

    public void call(int qid) {
        lblmess.setText("  " + xyz[qid][0]);
        choice1.setText(xyz[qid][1]);
        choice2.setText(xyz[qid][2]);
        choice3.setText(xyz[qid][3]);
        choice4.setText(xyz[qid][4]);
        choice1.setSelected(true);
    }

    public void reset()
     {
        qaid = 0;
        map.clear();
        call(qaid);
        btnext.setText("Next");
    }

    public int calCorrectAnswer()
     {
        int qnum = 2   ;
        int count = 0;
        for (int qid = 0; qid < qnum; qid++) 
        {
            if (xyz[qid][1].equals(map.get(qid))) 
            {
                count++;
            }
        }
        return count;
    }

    public class Report extends JFrame
     {
        Report()
         {
            setTitle("Answers");
            setSize(850, 550);
            setBackground(Color.WHITE);
            addWindowListener(new WindowAdapter()
             {
                public void windowClosing(WindowEvent e)
                 {
                    dispose();
                    reset();
                }
            });

            Draw d = new Draw();
            add(d);
            setVisible(true);
        }

	    class Draw extends Canvas {
	        public void paint(Graphics g)
             {
	            int qnum = 10;
	            int x = 10;
	            int y = 20;
	            for (int i = 0; i < qnum; i++) {
	            
	                g.setColor(Color.BLUE);
	                g.setFont(new Font("Arial", Font.BOLD, 12));
	                g.drawString(i + 1 + ". " + xyz[i][0], x, y);
	                y += 30;
	                g.setFont(new Font("Arial", Font.PLAIN, 12));
	                g.drawString("      Correct answer:" + xyz[i][1], x, y);
	                y += 30;
	                g.drawString("      Your answer:" + map.get(i), x, y);
	                y += 30;
	                
	                if (y > 400) {
	                    y = 20;
	                    x = 450;
	                }
	            }
                
                int numc = calCorrectAnswer();
                g.setColor(Color.BLUE);
                g.setFont(new Font("Arial", Font.BOLD, 14));
                g.drawString("Number of correct answers:" + numc, 300, 500);
	        }
        }
    }
}


public class Quizhello {
    public static void main(String args[]) {
		Quizhello  q1=new Quizhello();
	}
}