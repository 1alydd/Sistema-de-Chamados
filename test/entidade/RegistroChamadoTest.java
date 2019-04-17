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
public class RegistroChamadoTest {
    
    public RegistroChamadoTest() {
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
     * Test of getCodigo method, of class RegistroChamado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        RegistroChamado instance = null;
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class RegistroChamado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        RegistroChamado instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChamado method, of class RegistroChamado.
     */
    @Test
    public void testSetChamado() {
        System.out.println("setChamado");
        Chamado chamado = null;
        RegistroChamado instance = null;
        instance.setChamado(chamado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChamado method, of class RegistroChamado.
     */
    @Test
    public void testGetChamado() {
        System.out.println("getChamado");
        RegistroChamado instance = null;
        Chamado expResult = null;
        Chamado result = instance.getChamado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class RegistroChamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class RegistroChamado.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        RegistroChamado instance = null;
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class RegistroChamado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class RegistroChamado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        RegistroChamado instance = null;
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssunto method, of class RegistroChamado.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getAssunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssunto method, of class RegistroChamado.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assunto = "";
        RegistroChamado instance = null;
        instance.setAssunto(assunto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class RegistroChamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        RegistroChamado instance = null;
        Tecnico expResult = null;
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class RegistroChamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        Tecnico tecnico = null;
        RegistroChamado instance = null;
        instance.setTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
