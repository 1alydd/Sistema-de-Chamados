/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class ClienteEmpresaTest {
    
    public ClienteEmpresaTest() {
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
     * Test of getCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        ClienteEmpresa instance = null;
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        ClienteEmpresa instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        ClienteEmpresa instance = null;
        long expResult = 0L;
        long result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        long cpf = 0L;
        ClienteEmpresa instance = null;
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpresa method, of class ClienteEmpresa.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        ClienteEmpresa instance = null;
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ClienteEmpresa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ClienteEmpresa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
