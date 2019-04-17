/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
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
public class ControleClientesTest {
    
    public ControleClientesTest() {
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
     * Test of getClienteDAO method, of class ControleClientes.
     */
    @Test
    public void testGetClienteDAO() {
        System.out.println("getClienteDAO");
        ControleClientes instance = new ControleClientes();
        ClienteDAO expResult = null;
        ClienteDAO result = instance.getClienteDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarCliente method, of class ControleClientes.
     */
    @Test
    public void testCadastrarCliente() {
        System.out.println("cadastrarCliente");
        ControleClientes instance = new ControleClientes();
        instance.cadastrarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incluiNovoCliente method, of class ControleClientes.
     */
    @Test
    public void testIncluiNovoCliente() {
        System.out.println("incluiNovoCliente");
        Empresa empresa = null;
        long cpf = 0L;
        String nome = "";
        long telefone = 0L;
        ControleClientes instance = new ControleClientes();
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.incluiNovoCliente(empresa, cpf, nome, telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTelaCliente method, of class ControleClientes.
     */
    @Test
    public void testFecharTelaCliente() {
        System.out.println("fecharTelaCliente");
        ControleClientes instance = new ControleClientes();
        instance.fecharTelaCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
