/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.string_calculator_with_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author boss
 */
public class StringCalculatorTest {
    
    private StringCalculator calc;
    
    public StringCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc= new StringCalculator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class StringCalculator.
     */
    @Test
    public void testAdd() {
          
    }
    
    @Test
    public void executeShouldReturnZeroIfEmptyString(){
        assertEquals(0, calc.add(""));
    }
    
}
