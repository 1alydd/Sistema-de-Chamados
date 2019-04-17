/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
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
public class ControleEmpresasTest {
    
    public ControleEmpresasTest() {
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
     * Test of retorna method, of class ControleEmpresas.
     */
    @Test
    public void testRetorna() {
        System.out.println("retorna");
        long nmr = 0L;
        String nome = "";
        ControleEmpresas instance = new ControleEmpresas();
        Empresa expResult = null;
        Empresa result = instance.retorna(nmr, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar method, of class ControleEmpresas.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        long contrato = 0L;
        String nome = "";
        ControleEmpresas instance = new ControleEmpresas();
        int expResult = 0;
        int result = instance.validar(contrato, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class ControleEmpresas.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        long n = 0L;
        String nome = "";
        ControleEmpresas instance = new ControleEmpresas();
        Empresa expResult = null;
        Empresa result = instance.inserir(n, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checar method, of class ControleEmpresas.
     */
    @Test
    public void testChecar() {
        System.out.println("checar");
        Long num = null;
        String nome = "";
        ControleEmpresas instance = new ControleEmpresas();
        boolean expResult = false;
        boolean result = instance.checar(num, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarEmpresa method, of class ControleEmpresas.
     */
    @Test
    public void testCadastrarEmpresa() {
        System.out.println("cadastrarEmpresa");
        ControleEmpresas instance = new ControleEmpresas();
        instance.cadastrarEmpresa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTela method, of class ControleEmpresas.
     */
    @Test
    public void testFecharTela() {
        System.out.println("fecharTela");
        ControleEmpresas instance = new ControleEmpresas();
        instance.fecharTela();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
