/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_2s2022;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ROGA11
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones.Suma(a, b);
        
    }

    /**
     * Test of Resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones.Resta(a, b);
        
    }

    /**
     * Test of Producto method, of class Operaciones.
     */
    @Test
    public void testProducto() {
        System.out.println("Producto");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones.Producto(a, b);
        
    }

    /**
     * Test of Dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones.Dividir(a, b);
       
    }

    /**
     * Test of Potencia method, of class Operaciones.
     */
    @Test
    public void testPotencia() {
        System.out.println("Potencia");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Operaciones.Potencia(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Factorial method, of class Operaciones.
     */
    @Test
    public void testFactorial() {
        System.out.println("Factorial");
        long i = 0L;
        long expResult = 0L;
        long result = Operaciones.Factorial(i);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valorAbs method, of class Operaciones.
     */
    @Test
    public void testValorAbs() {
        System.out.println("valorAbs");
        float a = 0.0F;
        Operaciones.valorAbs(a);
        
    }

   
}
