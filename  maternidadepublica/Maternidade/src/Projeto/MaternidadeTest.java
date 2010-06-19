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

public class MaternidadeTest {

	private Maternidade maternidade;
	private Puerpera p1, p2;
	private Endereco e1, e2;
	private Consulta c1, c2;

	@Before
	public void setUp() throws Exception {

		maternidade = new Maternidade();

		e1 = new Endereco("rua joao pessoa", "3", "58800000", "centro",
				"campina grande", "paraiba", "centro de campina");

		e2 = new Endereco("rua maciel pinheiro", "10", "57800000", "centro",
				"campina grande", "paraiba", "proximo da praça a bandeira");

		p1 = new Puerpera("maria", "123456789", "branca", "25/05/1973", e1,
				"88888888", "18/06/2010", "saudavel", "normal");

		p2 = new Puerpera("Teresa", "987654321", "Pardo", "02/08/1882", e2,
				"88880000", "27/05/2010", "estavel", "cesariana");

		c1 = new Consulta(p1, "18/06/2010", "exame", "normal");

		c2 = new Consulta(p2, "19/06/2010", "parto", "urgente");

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

		Assert.assertTrue("Nao removeu. ", maternidade
				.removePuerpera("123456789"));
		Assert.assertTrue("Nao removeu. ", maternidade
				.removePuerpera("987654321"));

	}

	@Test
	public void testPesquisaPuerpera() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);

		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaPuerpera("123456789"), p1.toString());
		Assert.assertEquals("Não foi encontrada.", maternidade
				.pesquisaPuerpera("987654321"), p2.toString());
		Assert.assertEquals("Foi encontrada. ", maternidade
				.pesquisaPuerpera("654123378"), "Puerpera não encontrada. ");

	}

	@Test
	public void testContemPuerpera() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);

		Assert.assertTrue("Não contem.", maternidade
				.contemPuerpera("123456789").equals(p1));
		Assert.assertTrue("Não contem.", maternidade
				.contemPuerpera("987654321").equals(p2));
		Assert.assertFalse("Contem. ", maternidade
				.pesquisaPuerpera("654123378").equals(p1));

	}

	@Test
	public void testAddConsulta() {

		Assert.assertTrue("Não foi adicionada.", maternidade.addConsulta(c1));
		Assert.assertTrue("Não foi adcionada.", maternidade.addConsulta(c2));
		Assert.assertFalse("Foi adicionada. ", maternidade.addConsulta(c1));

	}

	@Test
	public void testRemoveConsulta() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);
		maternidade.addConsulta(c1);
		maternidade.addConsulta(c2);

		Assert.assertTrue("Não foi removida.", maternidade
				.removeConsulta("123456789"));
		Assert.assertTrue("Não foi removida.", maternidade
				.removeConsulta("987654321"));
		Assert.assertFalse("Foi removida. ", maternidade
				.removeConsulta("123456789"));

	}

	@Test
	public void testConsultasAgendadas() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);
		maternidade.addConsulta(c1);
		maternidade.addConsulta(c2);

		Assert
				.assertEquals(
						"A agenda esta errada. ",
						"Nome: maria\nCor: brancaData de Nascimento: 25/05/1973\nData da Consulta: 18/06/2010Tipo: normal\nConsulta: exame\nNome: maria\nCor: brancaData de Nascimento: 25/05/1973\nData da Consulta: 18/06/2010Tipo: normal\nConsulta: exame\nNome: Teresa\nCor: PardoData de Nascimento: 02/08/1882\nData da Consulta: 19/06/2010Tipo: urgente\nConsulta: parto\n",
						maternidade.consultasAgendadas());

	}

	@Test
	public void testBalancoGeral() {

		maternidade.addPuerpera(p1);
		maternidade.addPuerpera(p2);
		maternidade.addConsulta(c1);
		maternidade.addConsulta(c2);

		Assert
				.assertEquals(
						"Balanço esta errado. ",
						"Numero de Puerperas: 2\nPartos Normais: 1\nPartos Cesarianas: 1\nNumero de Recem Nascidos: 0\nRecem Nascidos saudaveis: 0\nRecem Nascidos neomortos: 0\nRecem Nascidos natimortos: 0\nNumero de Consultas agendadas: 2",
						maternidade.balancoGeral());
	}
}
