
// ---------------------------MINI ___ PROJECT----------------------------



//login screen






import javax.swing.*;
import java.awt.event.*;
class Logins extends JFrame  // Logins lai child banune
{
// hami le k k banuen tesko label haru text field esma banuna par xa
//sabai class ko aghadhi (J) lekhna parxa bcz its of child of awt ie.(swing)

Logins()
{}
Logins(String s1)      //constructors
{
super(s1);

}

  // refernce variable outside banune and obj vitra so that it                     //     can be accessible

JLabel l1,l2,l3,l4;
JTextField t1; // username
JPasswordField t2; // for password
JButton b1,b2,b3;  // button like login, clear ,add

void setComponents()
{

l1 = new JLabel("Welcome to MY project");
l2 = new JLabel("USER_NAME");

l3 = new JLabel("PASS_WORD");

l4 = new JLabel();
t1=new JTextField();
t2=new JPasswordField();
b1=new JButton("LOGIN");
b2=new JButton("CLEAR");
b3=new JButton("ADD");
 setLayout(null);

add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);

l1.setBounds(100,100,400,30);
l2.setBounds(100,200,200,30);
l3.setBounds(100,300,200,30);
l4.setBounds(100,400,400,30);

t1.setBounds(300,200,200,30);
t2.setBounds(300,300,200,30);

b1.setBounds(100,450,200,30);
b2.setBounds(300,500,200,30);
b3.setBounds(100,500,200,30);

b1.addActionListener(new Log());
b2.addActionListener(new clear());
b3.addActionListener(new add());






}

public static void main(String [] args)
{
 Logins s1=new Logins("BInod demo");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


//inner classes for clear, add and login;

class Log implements ActionListener
{
public void actionPerformed(ActionEvent e1) // overriding garne as it is in   //   actionlistener interface as a abstract function.
{
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("admin") && s2.equals("1234"))
{

l4.setText("LOGIN SUCESSFULL");
}
else
{
l4.setText("LOGIN UNSUCESSFULL");
}
}

}

//
class clear implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
}
}
//

class add implements ActionListener
{
public  void actionPerformed (ActionEvent e1)
{
try{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int sum = a+b;

l4.setText("the addition is : "+ sum);
}

catch (Exception e2)
{
l4.setText("plese enter number value to ADD  ! ");
}
}
}

}

