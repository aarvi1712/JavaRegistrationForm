package registrationform;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class RegistrationForm extends JFrame implements ActionListener
{
     @SuppressWarnings("unchecked")
    public static void main(String args[])
    
    
    {

      JFrame frame=new JFrame("Registration Form");
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200,100,600,700);
      Container c=frame.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.ORANGE);
      JLabel name_label=new JLabel("Name ");
       JLabel mob_label=new JLabel("Mobile ");
        JLabel dob_label=new JLabel("DOB ");
         JLabel gender_label=new JLabel("Gender ");

         JTextField name_text=new JTextField();
         JTextField mob_text=new JTextField();
         String day_arr[]=new String[31];
         for(int i=1;i<32;i++)
         {
             day_arr[i-1]=Integer.toString(i);
         }
          String month_arr[]=new String[12];
         for(int i=1;i<=12;i++)
         {
             month_arr[i-1]=Integer.toString(i);
         }
         String year_arr[]=new String[14];
         for(int i=1989;i<2003;i++)
         {
             year_arr[i-1989]=Integer.toString(i);
         }
         JComboBox day_text=new JComboBox(day_arr);
          JComboBox month_text=new JComboBox(month_arr);
           JComboBox year_text=new JComboBox(year_arr);
           JRadioButton male=new JRadioButton("male");
           JRadioButton female=new JRadioButton("female");
         ButtonGroup gender_text=new ButtonGroup();
           gender_text.add(male);
           gender_text.add(female);
      name_label.setBounds(100,100,100,40);
       mob_label.setBounds(100,150,100,40);
       
         gender_label.setBounds(100,250,100,40);
dob_label.setBounds(100,200,100,40);
         name_text.setBounds(210,110,200,20);
          mob_text.setBounds(210,160,200,20);
          day_text.setBounds(210,210,44,20);
          month_text.setBounds(280,210,40,20);
          year_text.setBounds(340,210,60,20);
           male.setBounds(210,260,70,20);
           female.setBounds(300,260,70,20);
         


         c.add(name_label);
         c.add(mob_label);
         c.add(dob_label);
         c.add(gender_label);
         c.add(name_text);
         c.add(mob_text);
        
            c.add(male);
            c.add(female);
            c.add(day_text);
            c.add(month_text);
            c.add(year_text);
            JLabel text_label=new JLabel("display");
            text_label.setBounds(100,420,100,20);
            c.add(text_label);

            JTextArea area=new JTextArea();area.setBounds(180,420,300,140);
            c.add(area);


            JButton submit=new JButton("Submit");
            submit.setBounds(250,320,80,30);


            
            
            c.add(submit);
            
            submit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = name_text.getText();
        String mob= mob_text.getText();
        if(str.contentEquals("")|| mob.contentEquals("") )
        {
        	
        	  JOptionPane.showMessageDialog(area, "please fill entries", "Warning",
        		        JOptionPane.WARNING_MESSAGE);
        	
        }
        area.setText(str);
        
    }
});


    }}

/*	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}*/
