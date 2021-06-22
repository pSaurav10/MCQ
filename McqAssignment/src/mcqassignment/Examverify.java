/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;
import java.sql.*;
/**
 *
 * @author hp
 */
public class Examverify extends JFrame implements ActionListener {

    JFrame jf;
    JLabel jlhead, lblusername,lbltoken, lblcategory;
    JTextField  token,username;
    JComboBox<String> category;
    String[] categorylist = new String[] {"english", "science", "computer", "gk"};
    JButton takeexam, back;
    JPanel jphead, jpbody;
    
    
    public Examverify(){
      // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("Examination Entrance Dashboard");
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (30.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(500, 60);
      jphead.setVisible(true);
      
      //labels for name, password and, token
      lblcategory = new JLabel("Category");
      lblcategory.setFont(lblcategory.getFont().deriveFont(20.0f));
      lblcategory.setBackground(new Color(210,215,211));
      lblcategory.setBounds(50,85,110,35);
      add(lblcategory);
      
      lblusername = new JLabel("Username");
      lblusername.setFont(lblusername.getFont().deriveFont(20.0f));
      lblusername.setBackground(new Color(210,215,211));
      lblusername.setBounds(50,150,110,35);
      add(lblusername);
      
      lbltoken = new JLabel("Token");
      lbltoken.setFont(lbltoken.getFont().deriveFont(20.0f));
      lbltoken.setBackground(new Color(210,215,211));
      lbltoken.setBounds(50,215,110,35);
      add(lbltoken);
      
      //textfields
      category = new JComboBox<>(categorylist);
      category.setFont(category.getFont().deriveFont(18.0f));
      category.setBackground(new Color(210,215,211));
      category.setBounds(190,85,200,30);
      add(category);
      
      username = new JTextField("");
      username.setFont(username.getFont().deriveFont(18.0f));
      username.setBackground(new Color(210,215,211));
      username.setBounds(190,150,200,35);
      add(username);
      
      token = new JTextField("");
      token.setFont(token.getFont().deriveFont(18.0f));
      token.setBackground(new Color(210,215,211));
      token.setBounds(190,215,200,35);
      add(token);
      
      //buttons
      takeexam = new JButton("Start Exam");
      takeexam.setFont(takeexam.getFont().deriveFont(18.0f));
      takeexam.setBackground(new Color(118, 93, 105));
      takeexam.setBounds(80, 280, 140, 35);
      add(takeexam);
      takeexam.addActionListener(this);
      
      back = new JButton("Back");
      back.setFont(back.getFont().deriveFont(18.0f));
      back.setBackground(new Color(118, 93, 105));
      back.setBounds(300, 280, 100, 35);
      add(back);
      back.addActionListener(this);
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(500, 420);
      
      jphead.setVisible(true);
      
      
        setTitle("Exam Entrance");
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    
    
   
    PreparedStatement pstmt;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cat = category.getSelectedItem().toString();
        MCQ mcq = new MCQ(cat);
        if(e.getSource().equals(takeexam))
        {
           
            
            ResultSet result = null;
            try 
            {
                Dbconnection db = new Dbconnection();         

               pstmt = db.conn.prepareStatement("select question, option1, option2, option3, option4, correctans from "+cat+" order by rand()");
               result = pstmt.executeQuery(); 

               while(result.next())
                    {

                        Question question = new Question();
                        question.setQuestion(result.getString("question"));
                        question.setOption1(result.getString("option1"));
                        question.setOption2(result.getString("option2"));
                        question.setOption3(result.getString("option3"));
                        question.setOption4(result.getString("option4"));
                        question.setCorrectans(result.getString("correctans"));
                        mcq.questionlist.add(question);  
                        
                    }
            } 
            catch (Exception ex) 
            {
                ex.printStackTrace();
            }
        }
        
        
        if(e.getSource().equals(takeexam))
        {
              ResultSet rs = null;
            try{
                Dbconnection db=new Dbconnection();
                    rs=db.verifyuser(username.getText(),token.getText());
                    if(rs.next()){
                        mcq.setVisible(true);
                        mcq.setnext();
                        this.hide();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect Username and Token");
                    }
            }
            catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }
    }
    
}
