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
import java.util.*;

/**
 *
 * @author hp
 */
public class Dashboard extends JFrame implements ActionListener{
    JFrame jf;
    JLabel jlhead;
    JButton userlog, usersign, admin, score;
    JPanel jphead, jpbody;
    public Dashboard() {
      // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("WELCOME TO THE EXAMINATION DASHBOARD");
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (21.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(500, 60);
      jphead.setVisible(true);
      
      // button for userlog dashboard, admin dashboard and, score
      userlog = new JButton("User Login");
      userlog.setFont(userlog.getFont().deriveFont(18.0f));
      userlog.setBackground(new Color(118, 93, 105));
      userlog.setBounds(50, 150, 150, 50);
      add(userlog);
      userlog.addActionListener(this);
      
      usersign = new JButton("User SignUp");
      usersign.setFont(usersign.getFont().deriveFont(18.0f));
      usersign.setBackground(new Color(118, 93, 105));
      usersign.setBounds(280, 150, 150, 50);
      add(usersign);
      usersign.addActionListener(this);
      
      
      admin = new JButton("Admin Login");
      admin.setFont(admin.getFont().deriveFont(18.0f));
      admin.setBackground(new Color(118, 93, 105));
      admin.setBounds(160, 300, 150, 50);
      add(admin);
      admin.addActionListener(this);      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(500, 470);
      jphead.setVisible(true);
      
      
        setTitle("Dashboard");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
      
       
    }
    
     public static void main(String[] args){
        new Dashboard().setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(userlog)){
            this.hide();
            UserLogin userlogin = new UserLogin();
            userlogin.setVisible(true);
        }
        
        if(e.getSource().equals(usersign)){
            UserSignup usignup = new UserSignup();
            usignup.setVisible(true);
            this.hide();
            
        }
        
        if(e.getSource().equals(admin)){
            this.hide();
            AdminLogin adminlogin = new AdminLogin();
            adminlogin.setVisible(true);
        }        
    }
    
    
    
}
