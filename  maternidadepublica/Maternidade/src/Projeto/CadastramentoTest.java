/**
 * Projeto Maternidade Public de Gongolopolis
 * 
 * @author Glauber Juarez Barbosa Lopes
 * @author José Arthur Gadelha Alexandre
 * @author Matheus Batista Silva
 * 
 * Versão 1.0
 */

package Projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CadastramentoTest {

	private Cadastramento maternidade;
	private Puerpera p1, p2;
	private RecemNascido r1, r2;

	@Before
	public void setUp() throws Exception {

		maternidade = new Cadastramento();

		p1 = new Puerpera("Maria", "Caucasiana", "27/10/1879",
				"Maciel pinheiro", "esquina", "88888888", "27/05/2010", "boa");

		p2 = new Puerpera("Teresa", "Pardo", "02/08/1882", "marechal",
				"hospital", "88880000", "27/05/2010", "estavel");

		r1 = new RecemNascido("Pedro", "homem", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");
		r2 = new RecemNascido("Marina", "mulher", "caucasiana", "27/05/2010",
				1.8, "1 semana e meia", "estavel");

	}

	@Test
	public void testAddPuerpera() {

		Assert.assertTrue("Nao adicionou. ", maternidade.addPuerpera(p1));
		Assert.assertFalse("Nao adicionou. ", maternidade.addPuerpera(p1));
		Assert.assertTrue("Nao adicionou. ", maternidade.addPuerpera(p2));

	}

	@Test
	public void testRemovePuerpera() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);

		Assert.assertTrue("Nao removeu. ", maternidade.removePuerpera("Maria"));
		Assert
				.assertTrue("Nao removeu. ", maternidade
						.removePuerpera("Teresa"));

	}

	@Test
	public void testAddRecemNascido() {

		Assert.assertTrue("Não adicionou. ", maternidade.addRecemNascido(r1));
		Assert.assertTrue("Não adicionou. ", maternidade.addRecemNascido(r2));

	}

	@Test
	public void testRemoveRecemNascido() {

		maternidade.addRecemNascido(r1);
		maternidade.addRecemNascido(r2);

		Assert.assertTrue("Nao removeu. ", maternidade
				.removeRecemNascido("Pedro"));
		Assert.assertTrue("Nao removeu. ", maternidade
				.removeRecemNascido("Marina"));

	}

	@Test
	public void testPesquisaPuerpera() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);

		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaPuerpera("Maria"), p1.toString());
		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaPuerpera("teresa"), p2.toString());
		Assert.assertEquals("Foi encontrada. ", maternidade
				.pesquisaPuerpera("francisca"), "Puerpera não encontrada. ");

	}

	@Test
	public void testPesquisaRecemNascido() {

		maternidade.addRecemNascido(r1);
		maternidade.addRecemNascido(r2);

		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaRecemNascido("pedro"), r1.toString());
		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaRecemNascido("marina"), r2.toString());
		Assert.assertEquals("Foi encontrada. ", maternidade
				.pesquisaRecemNascido("francisca"),
				"Recem Nascido não encontrada. ");

	}

}
