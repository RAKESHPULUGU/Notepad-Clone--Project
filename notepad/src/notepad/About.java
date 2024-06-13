package notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    About(){
        setBounds(480,185,600,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel (i3);
        headerIcon.setBounds(100,40,400,80);
        add(headerIcon);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Icon = new JLabel (i6);
        Icon.setBounds(50,180,70,70);
        add(Icon);
                
        JLabel text = new JLabel ("<html>PULUGU.RAKESH<br>Version 1.0.0 (OS Built Java).<br>Rakesh.All rights reserved. </html>");
        text.setBounds(150,75,500,300);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);
        
        
        JButton b1 = new JButton("OK");
        b1.setBounds(150, 350, 120, 25);
        b1.addActionListener(this);
        add(b1);
        
        
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main (String[] args){
        new About();
    }
    
}
