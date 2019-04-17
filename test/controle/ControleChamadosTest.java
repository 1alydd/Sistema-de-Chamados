/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
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
public class ControleChamadosTest {
    
    public ControleChamadosTest() {
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
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_4args() {
        System.out.println("alterarChamado");
        Chamado chamado = null;
        String status = "";
        String causa = "";
        String solucao = "";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.alterarChamado(chamado, status, causa, solucao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoRede method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoRede() {
        System.out.println("InserirChamadoRede");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String conexao = "";
        String enderecoRede = "";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.InserirChamadoRede(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, conexao, enderecoRede);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoBancoDeDados method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoBancoDeDados() {
        System.out.println("InserirChamadoBancoDeDados");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String bancoDeDados = "";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoDesempenho method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoDesempenho() {
        System.out.println("InserirChamadoDesempenho");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String operacao = "";
        double tempo = 0.0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirRegistroChamado method, of class ControleChamados.
     */
    @Test
    public void testInserirRegistroChamado() {
        System.out.println("inserirRegistroChamado");
        String assunto = "";
        Chamado chamado = null;
        Tecnico tec = null;
        ControleChamados instance = new ControleChamados();
        RegistroChamado expResult = null;
        RegistroChamado result = instance.inserirRegistroChamado(assunto, chamado, tec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarChamado method, of class ControleChamados.
     */
    @Test
    public void testCadastrarChamado() {
        System.out.println("cadastrarChamado");
        ControleChamados instance = new ControleChamados();
        instance.cadastrarChamado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTela method, of class ControleChamados.
     */
    @Test
    public void testFecharTela() {
        System.out.println("fecharTela");
        ControleChamados instance = new ControleChamados();
        instance.fecharTela();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of voltaChamadoCodigo method, of class ControleChamados.
     */
    @Test
    public void testVoltaChamadoCodigo() {
        System.out.println("voltaChamadoCodigo");
        Integer codigo = null;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.voltaChamadoCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testSetChamadoAlterado() {
        System.out.println("setChamadoAlterado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        instance.setChamadoAlterado(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testGetChamadoAlterado() {
        System.out.println("getChamadoAlterado");
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.getChamadoAlterado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emitirRelatorios method, of class ControleChamados.
     */
    @Test
    public void testEmitirRelatorios() {
        System.out.println("emitirRelatorios");
        int tipoproblema = 0;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.emitirRelatorios(tipoproblema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaPeloCodigo method, of class ControleChamados.
     */
    @Test
    public void testBuscaPeloCodigo() {
        System.out.println("buscaPeloCodigo");
        int codigoChamado = 0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.buscaPeloCodigo(codigoChamado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaDetalhesChamado method, of class ControleChamados.
     */
    @Test
    public void testRetornaDetalhesChamado() {
        System.out.println("retornaDetalhesChamado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.retornaDetalhesChamado(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_0args() {
        System.out.println("alterarChamado");
        ControleChamados instance = new ControleChamados();
        instance.alterarChamado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrirRelatorio method, of class ControleChamados.
     */
    @Test
    public void testAbrirRelatorio() {
        System.out.println("abrirRelatorio");
        ControleChamados instance = new ControleChamados();
        instance.abrirRelatorio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTelaAlteracao method, of class ControleChamados.
     */
    @Test
    public void testFecharTelaAlteracao() {
        System.out.println("fecharTelaAlteracao");
        ControleChamados instance = new ControleChamados();
        instance.fecharTelaAlteracao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarQtdChamados method, of class ControleChamados.
     */
    @Test
    public void testValidarQtdChamados() {
        System.out.println("validarQtdChamados");
        ClienteEmpresa cliente = null;
        ControleChamados instance = new ControleChamados();
        int expResult = 0;
        int result = instance.validarQtdChamados(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
