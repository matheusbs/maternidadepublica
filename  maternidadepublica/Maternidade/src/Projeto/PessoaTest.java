/**
 * Projeto Maternidade Public de Gongolopolis
 * 
 * @author Glauber Juarez Barbosa Lopes
 * @author Jos� Arthur Gadelha Alexandre
 * @author Matheus Batista Silva
 * 
 * Vers�o 1.0
 */

package Projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {

	private Pessoa p1, p2, p3;

	@Before
	public void setUp() throws Exception {

		p1 = new Pessoa("Jo�o", "Caucasiano", "20/05/1988");
		p2 = new Pessoa("Maria", "Pardo", "30/01/1985");

	}

	@Test(expected = Exception.class)
	public void testConstrutorNomeVazio() throws Exception {

		p3 = new Pessoa("   ", "Caucasiano", "20/05/1988");
		p3 = new Pessoa("", "Caucasiano", "20/05/1988");

	}

	@Test(expected = Exception.class)
	public void testConstrutorNomeNull() throws Exception {

		p3 = new Pessoa(null, "Caucasiano", "20/05/1988");

	}

	@Test(expected = Exception.class)
	public void testConstrutorCorVazio() throws Exception {

		p3 = new Pessoa("fransica", "   ", "20/05/1988");
		p3 = new Pessoa("junior", "", "20/05/1988");

	}

	@Test(expected = Exception.class)
	public void testConstrutorCorNull() throws Exception {

		p3 = new Pessoa("fransica", null, "20/05/1988");

	}

	@Test
	public void testGetNome() {

		Assert.assertEquals("Nome incorreto. ", p1.getNome(), "Jo�o");
		Assert.assertFalse("Nomes iguais. ", p1.getNome().equals(p2.getNome()));

	}

	@Test
	public void testGetCor() {

		Assert.assertEquals("Ra�a incorreta. ", p1.getCor(), "Caucasiano");
		Assert.assertFalse("Mesma ra�a. ", p1.getCor().equals(p2.getCor()));

	}

	@Test
	public void testGetDataNascimento() {

		Assert.assertEquals("Data incorreta. ", p1.getDataNascimento(),
				"20/05/1988");
		Assert.assertFalse("Mesma data de nascimento. ", p1.getDataNascimento()
				.equals(p2.getDataNascimento()));

	}

	@Test
	public void testEqualsObject() throws Exception {
		p3 = new Pessoa("Jo�o", "Caucasiano", "20/05/1988");
		Assert.assertEquals("S�o pessoas diferentes. ", p3, p1);
		Assert.assertTrue("S�o pessoas diferentes. ", p3.equals(p1));
		Assert.assertFalse("S�o pessoas diferentes. ", p2.equals(p1));
	}

}