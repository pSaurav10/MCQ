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
public class AdminLogin extends JFrame implements ActionListener{
    JFrame jf;
    JLabel jlhead, lblname,lblpass;
    JTextField name;
    JPasswordField password;
    JButton login, back;
    JPanel jphead, jpbody;
    
    public AdminLogin(){
        // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("ADMIN LOGIN");
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
      lblpass.setBounds(50,200,110,35);
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
      password.setBounds(200,200,200,35);
      add(password);
      
      //buttons
      login = new JButton("Login");
      login.setFont(login.getFont().deriveFont(18.0f));
      login.setBackground(new Color(118, 93, 105));
      login.setBounds(100, 300, 100, 35);
      add(login);
      login.addActionListener(this);
            
      back = new JButton("Back");
      back.setFont(back.getFont().deriveFont(18.0f));
      back.setBackground(new Color(118, 93, 105));
      back.setBounds(275, 300, 100, 35);
      add(back);
      back.addActionListener(this);
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(500, 470);
      setLocationRelativeTo(null);
      jphead.setVisible(true);
      
      
        setTitle("Admin Login");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = name.getText();
        String pass = password.getText();
        
       
        if(e.getSource().equals(login)){
            if(username.equals("saurav") && pass.equals("1234"))
            {
                JOptionPane.showMessageDialog(this,"You will be directed to Admin Panel",
                "Login Successfull",JOptionPane.PLAIN_MESSAGE);
                AdminQuestion aq = new AdminQuestion();
                aq.setVisible(true);
                this.hide();
            }    

            else if(username != ("saurav") && pass != ("1234"))
            {
                JOptionPane.showMessageDialog(this,"Incorrect login or password, please try again",
                "Error",JOptionPane.ERROR_MESSAGE);
                name.setText(null);
                password.setText(null);
            }
        }
         if(e.getSource().equals(back))
        {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            this.hide();
        }
    }
    
}
