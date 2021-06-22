/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqassignment;

/**
 *
 * @author hp
 */
import java.sql.*;
import java.util.*;

public class Dbconnection {

    public Connection conn;
    PreparedStatement pstmt;

    public Dbconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/algorithm_mcq", "root", "");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public int userinsert(String username, String password, String address, String token) {
        int result = 0;
        try {
            pstmt = conn.prepareStatement("insert into tbl_user values(null,?,?,?,?)");

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, address);
            pstmt.setString(4, token);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public int addanswer(int q_no, String useranswer, String updateans) {
        int result = 0;
        try {
            pstmt = conn.prepareStatement("insert into checkans (q_no, useranswer) values(?,?) on duplicate key update useranswer=?");

            pstmt.setInt(1, q_no);
            pstmt.setString(2, useranswer);
            pstmt.setString(3, updateans);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public ResultSet verifyuser(String username, String token) {
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement("select User_Name, Token from tbl_user where User_Name=? and Token=?");
            pstmt.setString(1, username);
            pstmt.setString(2, token);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error verifyuser: " + e);
        }
        return rs;
    }

    public ResultSet userlogin(String username, String password) {
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement("SELECT User_Name, Password FROM tbl_user WHERE `User_Name`= ? AND `Password` = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            result = pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public int questioninsert(String category, String question, String option1, String option2, String option3, String option4, String correctans) {
        int result = 0;
        String tablename = category;
        try {
            pstmt = conn.prepareStatement("insert into " + tablename + " values(null,?,?,?,?,?,?)");

            pstmt.setString(1, question);
            pstmt.setString(2, option1);
            pstmt.setString(3, option2);
            pstmt.setString(4, option3);
            pstmt.setString(5, option4);
            pstmt.setString(6, correctans);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public int questionupdate(String category, int id, String question, String option1, String option2, String option3, String option4, String correctans) {
        int result = 0;
        String tablename = category;
        try {
            pstmt = conn.prepareStatement("update " + tablename + " set question=?, option1=?, option2=?, option3=?, option4=?, correctans=? where id=?");
            pstmt.setString(1, question);
            pstmt.setString(2, option1);
            pstmt.setString(3, option2);
            pstmt.setString(4, option3);
            pstmt.setString(5, option4);
            pstmt.setString(6, correctans);
            pstmt.setInt(7, id);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;

    }

    public int questiondelete(String category, int id) {
        int result = 0;
        String tablename = category;
        try {
            pstmt = conn.prepareStatement("delete from " + tablename + " where id=?");
            pstmt.setInt(1, id);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;

    }
}
