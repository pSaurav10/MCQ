/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqassignment;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class QuestionupdateTest {
    
    public QuestionupdateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of questionupdate method, of class Dbconnection.
     */
    @Test
    public void testQuestionupdate() {
        System.out.println("questionupdate");
        String category = "gk";
        int id = 27;
        String question = "Where was gautam buddha born?";
        String option1 = "Nepal";
        String option2 = "Bhutan";
        String option3 = "India";
        String option4 = "China";
        String correctans = "Nepal";
        Dbconnection instance = new Dbconnection();
        int expResult = 1;
        int result = instance.questionupdate(category, id, question, option1, option2, option3, option4, correctans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
