import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Color;

public class View extends JFrame {
    JLabel ltext, lnb1, lnb2, lop, lresult;
    JPanel P1, P2;
    JTextField tnb1, tnb2, tresult;
    JComboBox<String> cop;
    JButton bcancel,bcalculate;

    public  View(){
//        System.out.println("im a student");
        this.setBackground(Color.yellow);
        this.setLocation(400,200);
        this.setSize(500,300);
        this.setTitle("My first Calculator in java");
        this.setLayout(null);
        ltext = new JLabel("My first Calculator");
        ltext.setBounds(125, 25, 300, 15);
        this.getContentPane().add(ltext);

        P1 = new JPanel(null);
        P1.setBounds(new Rectangle(15,45,225,200));
        this.getContentPane().add(P1);

        lnb1 = new JLabel("Number1");
        lnb1.setBounds(15,10,60,15);
        P1.add(lnb1);
        tnb1 = new JTextField();
        tnb1.setBounds(80,8,80,20);
        P1.add(tnb1);
        this.setBackground(Color.gray);


        lnb2 = new JLabel("Number2");
        lnb2.setBounds(15,55,60,15);
        P1.add(lnb2);
        tnb2 = new JTextField();
        tnb2.setBounds(80,52,80,20);
        P1.add(tnb2);

        lop = new  JLabel("Operator");
        lop.setBounds(15, 100, 80, 15);
        P1.add(lop);
        cop = new JComboBox<>(new String[]{" ","+","-","*","/","%"});
        cop.setBounds(80,98,80,20);
        P1.add(cop);

        bcancel = new JButton("CANCEL");
        bcancel.setBounds(10,140,85,25);
        bcancel.addActionListener(new UserClickController(this));
        P1.add(bcancel);
        bcalculate = new JButton("CALCULATE");
        bcalculate.setBounds(100,140,120,25);
        bcalculate.addActionListener(new UserClickController(this));
        P1.add(bcalculate);

        P2 = new JPanel(null);
        P2.setBounds(245,45,225,200);

        this.getContentPane().add(P2);
        lresult = new  JLabel("RESULT");
        lresult.setBounds(75, 25, 100, 25);
        P2.add(lresult);
        tresult = new JTextField();
        tresult.setBounds(45,55,150,30);
        P2.add(tresult);
        tresult.setEditable(false);
        tresult.setFont(new Font("serif", Font.BOLD, 25));
        tresult.setForeground(Color.gray);
        tresult.addActionListener(new UserClickController(this));





    }
}
