package guiApp;
import java.awt.*;
import javax.swing.*;
public class PanelExample {

    PanelExample(){

    }
     
    void initComponents()
    {
         JFrame f=new JFrame("APTECH FORM");
         JPanel panel= new JPanel();
         panel.setBounds(0,0,500,500);
         panel.setBackground(Color.gray);
         JButton b1= new JButton("Button 1");
         b1.setBounds(5, 10, 80, 30);
         JButton b2= new JButton("Cancel");
         b2.setBounds(5, 20, 80, 30);
         panel.add(b1);
         panel.add(b2);
         f.add(panel);
         f.setSize(400,400);
       
         

    }

}
