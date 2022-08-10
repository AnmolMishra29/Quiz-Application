package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    JButton again;
    Score(String name,int score){
       setBounds(400,150,750,550); //if no object is given then it refers the JFrame
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
       Image i2 =i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image =new JLabel(i3);
       image.setBounds(0,200,300,250);
       add(image);
       
       JLabel heading =new JLabel("Thank You " +name + " for playing Simple Minds");
       heading.setBounds(45,30,700,30);
       heading.setFont(new Font("Viner Hand ITC",Font.PLAIN,26));
       add(heading);
       
       JLabel lblscore =new JLabel("Your Score is " +score );
       lblscore.setBounds(350,200,300,30);
       lblscore.setFont(new Font("Viner Hand ITC",Font.PLAIN,26));
       add(lblscore);
       
        again =new JButton("Play Again");
        again.setBounds(380,270,100,40);
        again.setBackground(Color.BLUE);
        again.setForeground(Color.WHITE);
        again.addActionListener(this);
        add(again);
        
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("User",0);
    }
}
