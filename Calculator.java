import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements Actionlistener {

JFrame frame;
  JtextField textfield;
  JButton[] numberbuttons = new JButton[10];
  JButton[] functionButtons = new JButtons[8];
  JButton addButton,subButton,mulbutton,divButton;
  JButton decButton, equButton, delButton,,clrButton;
  Jpanel panel;

Font myFont = new Font("Ink Free",Font.BOLD,30);

  double num1=0,num2=0,result=0;
  char operater;
 
  calculator(){

    frame =new JFrame("Ca;culator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 550);
    frame.setLayout(null);


    frame.setVisible(true);

  }
  

  public static void main(string[] args) {

    calculator calc = new calculator();
    // TODO Auto-generated method stub




  @Overrride
