import javax.swing.*;
import java.awt.event.*;

class Screen extends JFrame
{

Screen()
{}

Screen(String s1)
{
super(s1);
}



JLabel l1,l2;
JButton b1;

public void setComponent()
{
l1=new JLabel(" WELOCOME TO NOTE BANK 💖");
l2=new JLabel (" helllo everybody  ! clic the button below ...............🤕");

b1=new JButton("Get In");

add(l1);
add(l2);
add(b1);

//
setLayout(null);
//

l1.setBounds(250,55,190,70);
l2.setBounds(100,100,300,77);
b1.setBounds(250,200,80,20);
b1.addActionListener(new get());

}


public static void main(String [] args)
{

Screen s1 = new Screen("Note Bank");
Screen s2 = new Screen("notes here");
s1.setVisible(true);
s2.setVisible(false);
s1.setSize(600,500);
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s1.setComponent();

}

class get implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
//JFrame2=new JFrame();
dispose();

}

}




}