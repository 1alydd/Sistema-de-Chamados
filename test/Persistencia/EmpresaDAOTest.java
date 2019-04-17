/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
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
     * Test of put method, of class EmpresaDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Empresa ep = null;
        EmpresaDAO instance = new EmpresaDAO();
        instance.put(ep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persit method, of class EmpresaDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        EmpresaDAO instance = new EmpresaDAO();
        instance.persit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpresas method, of class EmpresaDAO.
     */
    @Test
    public void testGetEmpresas() {
        System.out.println("getEmpresas");
        EmpresaDAO instance = new EmpresaDAO();
        Collection<Empresa> expResult = null;
        Collection<Empresa> result = instance.getEmpresas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of voltaEmpresa method, of class EmpresaDAO.
     */
    @Test
    public void testVoltaEmpresa() {
        System.out.println("voltaEmpresa");
        EmpresaDAO instance = new EmpresaDAO();
        HashMap<Long, Empresa> expResult = null;
        HashMap<Long, Empresa> result = instance.voltaEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
