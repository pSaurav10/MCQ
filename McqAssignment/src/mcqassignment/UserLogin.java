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

/**
 *
 * @author hp
 */
public class UserLogin extends JFrame implements ActionListener {
    JFrame jf;
    JLabel jlhead, lblname,lblpass;
    JTextField name;
    JPasswordField password;
    JButton login, signup, back;
    JPanel jphead, jpbody;
    
    
    public UserLogin(){
      // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("LOGIN OR GO TO SIGNUP");
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (30.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(500, 60);
      jphead.setVisible(true);
      
      //labels for name, password and, token
      lblname = new JLabel("User Name");
      lblname.setFont(lblname.getFont().deriveFont(20.0f));
      lblname.setBackground(new Color(210,215,211));
      lblname.setBounds(50,100,110,35);
      add(lblname);
      
      lblpass = new JLabel("Password");
      lblpass.setFont(lblpass.getFont().deriveFont(20.0f));
      lblpass.setBackground(new Color(210,215,211));
      lblpass.setBounds(50,175,110,35);
      add(lblpass);
      
     
      
      //textfields and passwordfield
      name = new JTextField("");
      name.setFont(name.getFont().deriveFont(18.0f));
      name.setBackground(new Color(210,215,211));
      name.setBounds(200,100,200,35);
      add(name);
      
      password = new JPasswordField("");
      password.setFont(password.getFont().deriveFont(18.0f));
      password.setBackground(new Color(210,215,211));
      password.setBounds(200,170,200,35);
      add(password);
      
      
      
      //buttons
      login = new JButton("Login");
      login.setFont(login.getFont().deriveFont(18.0f));
      login.setBackground(new Color(118, 93, 105));
      login.setBounds(50, 250, 100, 35);
      add(login);
      login.addActionListener(this);
      
      signup = new JButton("Sign Up");
      signup.setFont(signup.getFont().deriveFont(18.0f));
      signup.setBackground(new Color(118, 93, 105));
      signup.setBounds(170, 250, 110, 35);
      add(signup);
      signup.addActionListener(this);
      
      back = new JButton("Back");
      back.setFont(back.getFont().deriveFont(18.0f));
      back.setBackground(new Color(118, 93, 105));
      back.setBounds(300, 250, 100, 35);
      add(back);
      back.addActionListener(this);
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(500,320);
      jphead.setVisible(true);
      
      
        setTitle("User Login");
        setSize(500,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==login)
        {
            try {
                Dbconnection db = new Dbconnection();
                ResultSet result = db.userlogin(name.getText(), password.getText());
                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    Examverify ev = new Examverify();
                    ev.setVisible(true);
                    this.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "Login Unsuccessfull");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }
        }
        
        if(e.getSource().equals(signup)){
            UserSignup us = new UserSignup();
            us.setVisible(true);
            this.hide();
            
        }
        
        if(e.getSource().equals(back)){
            this.hide();
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        }
    }
    
}
