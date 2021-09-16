package project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Attendence_detail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1,b2;
    String h[]={"Emp id","Date Time","First Half","Second Half"};
    String d[][]=new String[50][4];  
    int i=0,j=0;
    
    Attendence_detail(){
        super("View Employees Attendence");
        b2=new JButton("Cancel");
        b2.addActionListener(this);
        add(b2,"South");
        
        setSize(800,500);
        setLocation(450,150);

        try{
            String q="select * from attendence";
            Conn c1=new Conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("emp_id");
                d[i][j++]=rs.getString("date_time");
                d[i][j++]=rs.getString("first_half");
                d[i][j++]=rs.getString("second_half");
                i++;
                j=0;
            }
             
            j1=new JTable(d,h);
            
            

        }catch(Exception e){}
        
        b1=new JButton("Print");
        
        b1.addActionListener(this);
        add(b1,"North");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
           j1.print();
            
        }catch(Exception e){}
        if(ae.getSource()==b2)
        {
        	setVisible(false);
        	new Details();
        }
    }
    
    public static void main(String[] args){
        new Attendence_detail();
    }
}

