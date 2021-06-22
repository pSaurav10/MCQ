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
public class UserSignup extends JFrame implements ActionListener {
    
    JFrame jf;
    JLabel jlhead, lblusername, lblpass,lbladdress;
    JTextField username,address, token;
    JPasswordField password;
    JButton btnlogin, btnclear,btntoken, btnback;
    JPanel jphead, jpbody;
    
    public UserSignup(){
      // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("SIGNUP TO CREATE ACCOUNT");
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (30.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(650, 60);
      jphead.setVisible(true);
      
      
      //labels for fullname, username,password,email, dob, gender, address and, token
            
      lblusername = new JLabel("User Name");
      lblusername.setFont(lblusername.getFont().deriveFont(16.0f));
      lblusername.setBackground(new Color(210,215,211));
      lblusername.setBounds(50,120,110,35);
      add(lblusername);
      
      lblpass = new JLabel("Password");
      lblpass.setFont(lblpass.getFont().deriveFont(16.0f));
      lblpass.setBackground(new Color(210,215,211));
      lblpass.setBounds(50,185,110,35);
      add(lblpass);
            
      lbladdress = new JLabel("Address");
      lbladdress.setFont(lbladdress.getFont().deriveFont(16.0f));
      lbladdress.setBackground(new Color(210,215,211));
      lbladdress.setBounds(50,245,110,35);
      add(lbladdress);
      
      //textfields and passwordfield: fullname, username, email, address,token
      
      
      username = new JTextField("");
      username.setFont(username.getFont().deriveFont(16.0f));
      username.setBackground(new Color(210,215,211));
      username.setBounds(225,120,300,30);
      add(username);
      
      password = new JPasswordField("");
      password.setFont(password.getFont().deriveFont(16.0f));
      password.setBackground(new Color(210,215,211));
      password.setBounds(225,185,300,30);
      add(password);
      
      address = new JTextField("");
      address.setFont(address.getFont().deriveFont(16.0f));
      address.setBackground(new Color(210,215,211));
      address.setBounds(225,245,300,30);
      add(address);
      
      token = new JTextField("");
      token.setFont(token.getFont().deriveFont(16.0f));
      token.setBackground(new Color(210,215,211));
      token.setBounds(225,305,300,30);
      add(token);
      
      //buttons
      btntoken = new JButton("Generate Token");
      btntoken.setFont(btntoken.getFont().deriveFont(16.0f));
      btntoken.setBackground(new Color(118, 93, 105));
      btntoken.setBounds(50, 305, 160, 35);
      add(btntoken);
      btntoken.addActionListener(this);
      
      btnlogin = new JButton("Login");
      btnlogin.setFont(btnlogin.getFont().deriveFont(16.0f));
      btnlogin.setBackground(new Color(118, 93, 105));
      btnlogin.setBounds(100, 390, 100, 35);
      add(btnlogin);
      btnlogin.addActionListener(this);
      
      btnclear = new JButton("Clear");
      btnclear.setFont(btnclear.getFont().deriveFont(16.0f));
      btnclear.setBackground(new Color(118, 93, 105));
      btnclear.setBounds(250, 390, 110, 35);
      add(btnclear);
      btnclear.addActionListener(this);
      
      btnback = new JButton("Back");
      btnback.setFont(btnback.getFont().deriveFont(16.0f));
      btnback.setBackground(new Color(118, 93, 105));
      btnback.setBounds(400, 390, 100, 35);
      add(btnback);
      btnback.addActionListener(this);
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(650, 465);
      jphead.setVisible(true);
      
      
      
        setTitle("User SignUp");
        setSize(650,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnlogin)
        {
            try {
                Dbconnection db=new Dbconnection();
                int result=db.userinsert(username.getText(),password.getText(), address.getText(),token.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Saved");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to save");
                }
            } catch (Exception ex) {
                System.out.println("Error: "+ex);
            }
        }
        
        if(e.getSource()==btnclear){
            username.setText(null);
            password.setText(null);
            address.setText(null);
            token.setText(null);
        }
        
         if(e.getSource()==btnback){
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            this.hide();
        }
         
         if(e.getSource()==btntoken){
            Random r = new Random();
            String character = username.getText();
            String random = String.valueOf(1000+r.nextInt(8999));
            token.setText(random+character);
        }
        
    }
    
}
