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
public class QuestioninsertTest {
    
    public QuestioninsertTest() {
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
     * Test of questioninsert method, of class Dbconnection.
     */
    @Test
    public void testQuestioninsert() {
        System.out.println("questioninsert");
        String category = "gk";
        String question = "Where was gautam buddha born?";
        String option1 = "kaski";
        String option2 = "jhapa";
        String option3 = "daman";
        String option4 = "kapilbastu";
        String correctans = "kapilbastu";
        Dbconnection instance = new Dbconnection();
        int expResult = 1;
        int result = instance.questioninsert(category, question, option1, option2, option3, option4, correctans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
