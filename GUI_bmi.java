import javax.swing.*;
import java.awt.event.*;

public class GUI_bmi extends JFrame implements ActionListener {

    JTextField t1,t2,t3;
    JButton b1,b2;
    JLabel a1,a2,a3,a4;
    public GUI_bmi()
    {

        setBounds(50,50,450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        a3=new JLabel("BMI CALCULATOR");
        a3.setBounds(150,20,150,50);
        add(a3);

        a1=new JLabel("weight :");
        a1.setBounds(50,100,100,30);
        add(a1);

        t1=new JTextField();
        t1.setBounds(150,100,200,30);
        add(t1);

        a2=new JLabel("height :");
        a2.setBounds(50,150,200,30);
        add(a2);

        t2=new JTextField();
        t2.setBounds(150,150,200,30);
        add(t2); 

        a4=new JLabel("BMI :");
        a4.setBounds(50,200,100,30);
        add(a4);

        t3=new JTextField();
        t3.setBounds(150,200,200,30);
        add(t3);

        b1=new JButton("CALCULATE");
        b1.setBounds(150,250,200,40);
        add(b1);

        b1.addActionListener(this);
        

        setVisible(true);

}
    public static void main(String[] args)
    {
        GUI_bmi obj=new GUI_bmi();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try{

            
            double weight=Double.parseDouble(t1.getText());
            t1.setText("");
            double height=Double.parseDouble(t2.getText());
            t2.setText("");
            double bmi=weight/(height*height);
            t3.setText(String.format("%.2f",bmi));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this,"Please enter valid number !!!");
            }


        }
    
    }
}

