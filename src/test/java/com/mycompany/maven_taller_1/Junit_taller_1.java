package com.mycompany.maven_taller_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HUAWEI
 */
public class Junit_taller_1 {
    
    public Junit_taller_1() {
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
     * Test of SepararFrases method, of class Inicio.
     */
//    @Test
//    public void testSepararFrases() {
//        System.out.println("SepararFrases");
//        Inicio instance = new Inicio();
//        instance.SepararFrases();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ActivoPasivo method, of class Inicio.
     */
//    @Test
//    public void testActivoPasivo() {
//        System.out.println("ActivoPasivo");
//        String frase = "";
//        int expResult = 0;
//        int result = Inicio.ActivoPasivo(frase);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of SepararPalabras method, of class Inicio.
     */
    @Test
    public void testSepararPalabras() {
        System.out.println("SepararPalabras");
        String frase = "Sam eat apple";
        String entrada [] = maven_class_taller_1.SepararPalabras(frase);
        String[] salida = {"Sam","eat","apple"};
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertArrayEquals(salida, entrada );
        
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        maven_class_taller_1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}