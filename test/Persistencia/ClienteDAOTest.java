/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import java.util.HashMap;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
     * Test of validarCPF method, of class ClienteDAO.
     */
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        long cpf = 0L;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.validarCPF(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarCodigo method, of class ClienteDAO.
     */
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        ClienteDAO instance = new ClienteDAO();
        int expResult = 0;
        int result = instance.gerarCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of voltaCashCliente method, of class ClienteDAO.
     */
    @Test
    public void testVoltaCashCliente() {
        System.out.println("voltaCashCliente");
        ClienteDAO instance = new ClienteDAO();
        HashMap<Long, ClienteEmpresa> expResult = null;
        HashMap<Long, ClienteEmpresa> result = instance.voltaCashCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class ClienteDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        ClienteEmpresa cliente = null;
        ClienteDAO instance = new ClienteDAO();
        instance.put(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ClienteDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long codigoCliente = null;
        ClienteDAO instance = new ClienteDAO();
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.get(codigoCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persit method, of class ClienteDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        ClienteDAO instance = new ClienteDAO();
        instance.persit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
