package project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Attendence_of_employee extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l0;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    Attendence_of_employee(){
       
        setLayout(new GridLayout(8,8,50,50));
        l0=new JLabel("Select emp_id");
        l0.setFont(new Font("serif",Font.BOLD,20));
        c2 = new Choice();
        c2.setFont(new Font("serif",Font.BOLD,20));
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
      
      
       }catch(Exception e){ }
        add(l0);
        add(c2);
      
        l1 = new JLabel("First Half");
        l1.setFont(new Font("serif",Font.BOLD,20));
        fh = new Choice();
        fh.add("Present");
        fh.setFont(new Font("serif",Font.BOLD,20));
        fh.add("Absent");
        fh.add("Leave");
       
        add(l1);
        add(fh);
        
        l2 = new JLabel("Second Half");
        l2.setFont(new Font("serif",Font.BOLD,20));
        sh = new Choice();
        sh.setFont(new Font("serif",Font.BOLD,20));
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
       
        add(l2);
        add(sh);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setSize(600,650);
        setLocation(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String first_half = fh.getSelectedItem();
        String second_half = sh.getSelectedItem();
        String date_time = new java.util.Date().toString();
        String emp_id=c2.getSelectedItem();
        String qry = "insert into attendence values("+emp_id +",'"+date_time+"','"+first_half+"','"+second_half+"')";
        if(ae.getSource()==b1)
        try{
            Conn c1 = new Conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendence confirmed");
            this.setVisible(false);
            new Details();
        }catch(Exception ee){
            ee.printStackTrace();
        }if(ae.getSource()==b2) {
        	setVisible(false);
        	new Details();
        }
    }
    
    public static void main(String s[]){
        new Attendence_of_employee();
    }
}

