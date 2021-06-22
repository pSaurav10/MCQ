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
public class MCQ extends JFrame implements ActionListener {
    JFrame jf;
    JLabel jlhead,lblquestion, lblscore;
    JRadioButton rbtoption1, rbtoption2, rbtoption3, rbtoption4;
    ButtonGroup bg;
    JPanel jphead, jpbody;
    ArrayList<Question> questionlist = new ArrayList<Question>();
    Examverify exm = new Examverify();
    Dbconnection db = new Dbconnection();
    PreparedStatement pstmt;
    String subject;
     
    JRadioButton jb[]=new JRadioButton[5]; //for options of the question  
    JButton b2,btnnext, btnprevious,btnsubmit;  
   
    int marks=0,current = -1; 
    long StartTime, EndTime,seconds,minutes,flag=0;; 
    
    public MCQ(){}
        
    public MCQ(String getCategory)
    {
        this.subject = getCategory;
      // Panel for Welcome text
      jphead = new JPanel();
      jlhead = new JLabel("Exam of "+ subject);
      jphead.add(jlhead);
      jlhead.setFont(jlhead.getFont ().deriveFont (30.0f));
      jphead.setBackground(new Color(126,125,123));
      add(jphead, BorderLayout.CENTER);
      jphead.setSize(800, 60);
      jphead.setVisible(true); 
      
      lblquestion = new JLabel("Question");
      lblquestion.setFont(lblquestion.getFont().deriveFont(20.0f));
      lblquestion.setBackground(new Color(210,215,211));
      lblquestion.setBounds(50,75,700,45);
      add(lblquestion);

      btnnext = new JButton("Next");
      btnnext.setFont(btnnext.getFont().deriveFont(18.0f));
      btnnext.setBackground(new Color(118, 93, 105));
      btnnext.setBounds(500, 350, 150, 35);
      add(btnnext);
      btnnext.addActionListener(this);
      
      btnsubmit = new JButton("Submit");
      btnsubmit.setFont(btnsubmit.getFont().deriveFont(18.0f));
      btnsubmit.setBackground(new Color(118, 93, 105));
      btnsubmit.setBounds(275, 350, 150, 35);
      add(btnsubmit);
      btnsubmit.addActionListener(this);
      
      btnprevious = new JButton("Previous");
      btnprevious.setFont(btnprevious.getFont().deriveFont(18.0f));
      btnprevious.setBackground(new Color(118, 93, 105));
      btnprevious.setBounds(50, 350, 150, 35);
      add(btnprevious);
      btnprevious.addActionListener(this);
      
      
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }
		
		   
            jb[0].setBounds(50,135,600,35);
            jb[1].setBounds(50,185,600,35);  
            jb[2].setBounds(50,235,600,35);  
            jb[3].setBounds(50,285,600,35);  
       
      
      
      // Panel for Main body
      jpbody = new JPanel();
      jpbody.setBackground(new Color(115, 101, 152));
      add(jpbody);
      jpbody.setSize(700, 670);
      jphead.setVisible(true);
      
      
        setTitle("MCQ");
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    
   void addans(){
            try {
           for (int i = 0; i <= 3; i++) {
               if (jb[i].isSelected()) {
                   int result = db.addanswer(current + 2, jb[i].getText(), jb[i].getText());
               }
           }

       } catch (Exception ex) {
           ex.printStackTrace();
       }
   }
    
    void check(){
        try {
              for(int i=1;i<=10;i++)
                {
                    pstmt = db.conn.prepareStatement("select useranswer from checkans where q_no="+i+"");
                    ResultSet result = pstmt.executeQuery();
                    result.next();
                    String userans = result.getString("useranswer");
                    String correctans = questionlist.get(i-1).getCorrectans();
                    if(correctans.equals(userans)){
                        marks++;
                    }
                    
                }
                
            } 
            catch (Exception ex) 
            {
                System.out.println("Error: "+ex);
            }
    }
    
    
    void setnext(){
                        
        if(current == -1){
           lblquestion.setText("<html> Q.N."+ 1 +" "+ questionlist.get(0).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(0).getOption1());
           jb[1].setText(questionlist.get(0).getOption2());
           jb[2].setText(questionlist.get(0).getOption3());
           jb[3].setText(questionlist.get(0).getOption4());
           }
        if(current == 0){
           lblquestion.setText("<html> Q.N."+ 2 +" "+ questionlist.get(1).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(1).getOption1());
           jb[1].setText(questionlist.get(1).getOption2());
           jb[2].setText(questionlist.get(1).getOption3());
           jb[3].setText(questionlist.get(1).getOption4());
           }
       if(current == 1){
           lblquestion.setText("<html> Q.N."+ 3 +" "+ questionlist.get(2).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(2).getOption1());
           jb[1].setText(questionlist.get(2).getOption2());
           jb[2].setText(questionlist.get(2).getOption3());
           jb[3].setText(questionlist.get(2).getOption4());
           }
       if(current == 2){
           lblquestion.setText("<html> Q.N."+ 4 +" "+ questionlist.get(3).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(3).getOption1());
           jb[1].setText(questionlist.get(3).getOption2());
           jb[2].setText(questionlist.get(3).getOption3());
           jb[3].setText(questionlist.get(3).getOption4());
           }
       if(current == 3){
           lblquestion.setText("<html> Q.N."+ 5 +" "+ questionlist.get(4).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(4).getOption1());
           jb[1].setText(questionlist.get(4).getOption2());
           jb[2].setText(questionlist.get(4).getOption3());
           jb[3].setText(questionlist.get(4).getOption4());
           }
       if(current == 4){
           lblquestion.setText("<html> Q.N."+ 6 +" "+ questionlist.get(5).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(5).getOption1());
           jb[1].setText(questionlist.get(5).getOption2());
           jb[2].setText(questionlist.get(5).getOption3());
           jb[3].setText(questionlist.get(5).getOption4());
           }
       if(current == 5){
           lblquestion.setText("<html> Q.N."+ 7 +" "+ questionlist.get(6).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(6).getOption1());
           jb[1].setText(questionlist.get(6).getOption2());
           jb[2].setText(questionlist.get(6).getOption3());
           jb[3].setText(questionlist.get(6).getOption4());
           }
       if(current == 6){
           lblquestion.setText("<html> Q.N."+ 8 +" "+ questionlist.get(7).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(7).getOption1());
           jb[1].setText(questionlist.get(7).getOption2());
           jb[2].setText(questionlist.get(7).getOption3());
           jb[3].setText(questionlist.get(7).getOption4());
           }
       if(current == 7){
           lblquestion.setText("<html> Q.N."+ 9 +" "+ questionlist.get(8).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(8).getOption1());
           jb[1].setText(questionlist.get(8).getOption2());
           jb[2].setText(questionlist.get(8).getOption3());
           jb[3].setText(questionlist.get(8).getOption4());
           }
       if(current == 8){
           lblquestion.setText("<html> Q.N."+ 10 +" "+ questionlist.get(9).getQuestion()+ "</html>");
           jb[0].setText(questionlist.get(9).getOption1());
           jb[1].setText(questionlist.get(9).getOption2());
           jb[2].setText(questionlist.get(9).getOption3());
           jb[3].setText(questionlist.get(9).getOption4());
           }
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==btnnext)
        {
            if(current >= 8){
                
                JOptionPane.showMessageDialog(null, "There are no questions further. Press Submit to completed the Exam!!");
            }
            addans();
            current++;
            setnext();
            
        }  
        
        if(e.getSource()==btnprevious){
            if(current==-1){
                JOptionPane.showMessageDialog(null, "There are no questions further!!");
            }
            current--;
            
            setnext();
            
        }
        int b;
        if (e.getSource() == btnsubmit) {
            b = JOptionPane.showConfirmDialog(this, "Would you like to exit and view your score?");
            if(b==JOptionPane.YES_OPTION){
                check();
                JOptionPane.showMessageDialog(null, "Your marks in "+subject+" is: "+ marks);
                try{
                    pstmt.executeUpdate("delete from checkans");
                }
                catch(Exception ex){
                    System.out.println("btnsumbit/// "+ ex);
                }   
                exm.setVisible(true);
                this.hide();
            }
            
        }
        
       
    }
        
        
    }
    

