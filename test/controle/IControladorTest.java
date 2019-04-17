/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31756123
 */
public class IControladorTest {
    
    public IControladorTest() {
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
     * Test of inserir method, of class IControlador.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        long n = 0L;
        String nome = "";
        IControlador instance = new IControladorImpl();
        Object expResult = null;
        Object result = instance.inserir(n, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IControladorImpl implements IControlador {

        public Object inserir(long n, String nome) {
            return null;
        }
    }
    
}
