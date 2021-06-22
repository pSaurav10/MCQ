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
import java.sql.*;
import java.util.*;

/**
 *
 * @author hp
 */
public class AdminQuestion extends JFrame implements ActionListener{
    
    JFrame jf;
    JLabel jlhead, lblid, lblquestion, lbloption1,lbloption2,lbloption3, lbloption4, lblcorrectans,lblcategory;
    JTextField id, question,option1,option2, option3, option4, correctans;
    JComboBox<String> category;
    String[] categorylist = new String[] {"english", "science", "computer", "gk"};
    JButton btnadd, btnupdate, btndelete, btnback;
    JPanel jphead, jpbody;
    
    public AdminQuestion(){
         // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("ADD, UPDATE AND DELETE QUESTIONS");
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (30.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(620, 60);
      jphead.setVisible(true);
      
      
      //labels for id, question,option1, option2 and, option3
            
      lblcategory = new JLabel("Category");
      lblcategory.setFont(lblcategory.getFont().deriveFont(16.0f));
      lblcategory.setBackground(new Color(210,215,211));
      lblcategory.setBounds(50,65,110,35);
      add(lblcategory);
      
      lblid = new JLabel("Id");
      lblid.setFont(lblid.getFont().deriveFont(16.0f));
      lblid.setBackground(new Color(210,215,211));
      lblid.setBounds(50,125,110,35);
      add(lblid);
      
      lblquestion = new JLabel("Question");
      lblquestion.setFont(lblquestion.getFont().deriveFont(16.0f));
      lblquestion.setBackground(new Color(210,215,211));
      lblquestion.setBounds(50,185,110,35);
      add(lblquestion);
      
      lbloption1 = new JLabel("Option 1");
      lbloption1.setFont(lbloption1.getFont().deriveFont(16.0f));
      lbloption1.setBackground(new Color(210,215,211));
      lbloption1.setBounds(50,245,110,35);
      add(lbloption1);
            
      lbloption2 = new JLabel("Option 2");
      lbloption2.setFont(lbloption2.getFont().deriveFont(16.0f));
      lbloption2.setBackground(new Color(210,215,211));
      lbloption2.setBounds(50,305,110,35);
      add(lbloption2);
      
      lbloption3 = new JLabel("Option 3");
      lbloption3.setFont(lbloption3.getFont().deriveFont(16.0f));
      lbloption3.setBackground(new Color(118, 93, 105));
      lbloption3.setBounds(50, 365, 110, 35);
      add(lbloption3);
      
      lbloption4 = new JLabel("Option 4");
      lbloption4.setFont(lbloption4.getFont().deriveFont(16.0f));
      lbloption4.setBackground(new Color(118, 93, 105));
      lbloption4.setBounds(50, 425, 110, 35);
      add(lbloption4);
      
      lblcorrectans = new JLabel("Correct Answer");
      lblcorrectans.setFont(lblcorrectans.getFont().deriveFont(16.0f));
      lblcorrectans.setBackground(new Color(118, 93, 105));
      lblcorrectans.setBounds(50, 485, 120, 35);
      add(lblcorrectans);
      
      //textfields and passwordfield: fullname, question, email, option2,option3
      category = new JComboBox<>(categorylist);
      category.setFont(category.getFont().deriveFont(16.0f));
      category.setBackground(new Color(210,215,211));
      category.setBounds(190,65,400,30);
      add(category);
      
      id = new JTextField("");
      id.setFont(id.getFont().deriveFont(16.0f));
      id.setBackground(new Color(210,215,211));
      id.setBounds(190,125,400,30);
      add(id);
      
      question = new JTextField("");
      question.setFont(question.getFont().deriveFont(16.0f));
      question.setBackground(new Color(210,215,211));
      question.setBounds(190,185,400,30);
      add(question);
      
      option1 = new JTextField("");
      option1.setFont(option1.getFont().deriveFont(16.0f));
      option1.setBackground(new Color(210,215,211));
      option1.setBounds(190,245,400,30);
      add(option1);
      
      option2 = new JTextField("");
      option2.setFont(option2.getFont().deriveFont(16.0f));
      option2.setBackground(new Color(210,215,211));
      option2.setBounds(190,305,400,30);
      add(option2);
      
      option3 = new JTextField("");
      option3.setFont(option3.getFont().deriveFont(16.0f));
      option3.setBackground(new Color(210,215,211));
      option3.setBounds(190,365,400,30);
      add(option3);
      
      option4 = new JTextField("");
      option4.setFont(option4.getFont().deriveFont(16.0f));
      option4.setBackground(new Color(210,215,211));
      option4.setBounds(190,425,400,30);
      add(option4);
      
      correctans = new JTextField("");
      correctans.setFont(correctans.getFont().deriveFont(16.0f));
      correctans.setBackground(new Color(210,215,211));
      correctans.setBounds(190,485,400,30);
      add(correctans);
      
      //buttons
      btnadd = new JButton("Add");
      btnadd.setFont(btnadd.getFont().deriveFont(16.0f));
      btnadd.setBackground(new Color(118, 93, 105));
      btnadd.setBounds(70,535, 100, 35);
      add(btnadd);
      btnadd.addActionListener(this);
      
      btnupdate = new JButton("Update");
      btnupdate.setFont(btnupdate.getFont().deriveFont(16.0f));
      btnupdate.setBackground(new Color(118, 93, 105));
      btnupdate.setBounds(200, 535, 100, 35);
      add(btnupdate);
      btnupdate.addActionListener(this);
      
      btndelete = new JButton("Delete");
      btndelete.setFont(btndelete.getFont().deriveFont(16.0f));
      btndelete.setBackground(new Color(118, 93, 105));
      btndelete.setBounds(330,535, 100, 35);
      add(btndelete);
      btndelete.addActionListener(this);
      
      btnback = new JButton("Back");
      btnback.setFont(btnback.getFont().deriveFont(16.0f));
      btnback.setBackground(new Color(118, 93, 105));
      btnback.setBounds(460, 535, 100, 35);
      add(btnback);
      btnback.addActionListener(this);
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(620, 585);
      setLocationRelativeTo(null);
      jphead.setVisible(true);
      
        setTitle("Admin Questions Panel");
        setSize(620,620);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(btnadd))
        {
        try
        {
            Dbconnection conn = new Dbconnection();
            int result = conn.questioninsert(category.getSelectedItem().toString(),question.getText(),option1.getText(),option2.getText(),option3.getText(),option4.getText(),correctans.getText());
            if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Saved");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to save");
                }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        }
        
        if(e.getSource().equals(btnupdate))
        {
        try
        {
            Dbconnection conn = new Dbconnection();
            int result = conn.questioninsert(category.getSelectedItem().toString(),question.getText(),option1.getText(),option2.getText(),option3.getText(),option4.getText(),correctans.getText());
            if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Updated");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to update");
                }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        }
        
        if(e.getSource().equals(btndelete))
        {
        try
        {
            Dbconnection conn = new Dbconnection();
            int result = conn.questiondelete(category.getSelectedItem().toString(),Integer.parseInt(id.getText()));
            if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Deleted");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to delete");
                }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        }
         if(e.getSource().equals(btnback))
        {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            this.hide();
        }
        
    }
    
}
