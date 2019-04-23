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
public class PessoaTest {
    
    @Test
    public void criarUmaPessoaTest() {
        Pessoa p = new Pessoa("Nome Bonito", 123456789);
        assertTrue(p.getNome() == "Nome Bonito");
    }
    
    @Test
    public void criarUmaPessoaComTelefoneNegativoTest() {
        Pessoa p = new Pessoa("Nome Bonito", -123456789);
        assertTrue(p.getTelefone() > 0);
    }
    
    @Test(expected = Exception.class)
    public void criarUmaPessoaComTelefoneNegativoComExcecaoTest() {
        Pessoa p = new Pessoa("Nome Bonito", -123456789);
    }
}
