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

public class PuerperaTest {

	private Puerpera p1, p2, p3;

	@Before
	public void setUp() throws Exception {

		p1 = new Puerpera("Maria", "Caucasiana", "27/10/1879",
				"Maciel pinheiro", "esquina", "88888888", "27/05/2010", "boa");

		p2 = new Puerpera("Teresa", "Pardo", "02/08/1882", "marechal",
				"hospital", "88880000", "27/05/2010", "estavel");

	}

	@Test
	public void testToString() {

		Assert
				.assertEquals(
						"String errada. ",
						"Nome: Maria\nCor: Caucasiana   Data Nascimento: 27/10/1879\nEndereco: Maciel pinheiro\nTelefone: 88888888   Data de Admissão: 27/05/2010\nObservacao Saude: boa",
						p1.toString());
		Assert
				.assertEquals(
						"String errada. ",
						"Nome: Teresa\nCor: Pardo   Data Nascimento: 02/08/1882\nEndereco: marechal\nTelefone: 88880000   Data de Admissão: 27/05/2010\nObservacao Saude: estavel",
						p2.toString());

	}

	@Test
	public void testGetEndereco() {

		Assert.assertEquals("Endereços errado. ", p1.getEndereco(),
				"Maciel pinheiro");
		Assert.assertFalse("Endereços identicos. ", p1.getEndereco().equals(
				p2.getEndereco()));

	}

	@Test
	public void testGetPontoDeReferencia() {

		Assert.assertEquals("Ponto de referencia nao encontrado. ", p2
				.getPontoReferencia(), "hospital");
		Assert.assertFalse("Ponto de referencia identicos. ", p1
				.getPontoReferencia().equals(p2.getPontoReferencia()));

	}

	@Test
	public void testGetTelefone() {

		Assert.assertEquals("Telefone errado. ", p2.getTelefone(), "88880000");
		Assert.assertFalse("Telefones identicos. ", p1.getTelefone().equals(
				p2.getTelefone()));

	}

	@Test
	public void testGetDataAdmissao() {

		Assert.assertEquals("Data errada. ", p2.getDataAdmissao(), "27/05/2010");
		Assert.assertTrue("Datas diferentes. ", p1.getDataAdmissao().equals(
				p2.getDataAdmissao()));

	}

	@Test
	public void testGetObservacaoSaude() {

		Assert.assertEquals("Observacao errada. ", p2.getObservacaoSaude(),
				"estavel");
		Assert.assertFalse("Observacoes identicas. ", p1.getObservacaoSaude()
				.equals(p2.getObservacaoSaude()));

	}

	@Test
	public void testEqualsObject() throws Exception {
		p3 = new Puerpera("Maria", "Caucasiana", "27/10/1879",
				"Maciel pinheiro", "esquina", "88888888", "27/05/2010", "boa");

		Assert.assertEquals("São pacientes diferentes. ", p3, p1);
		Assert.assertTrue("São pacientes diferentes. ", p3.equals(p1));
		Assert.assertFalse("É o mesmo paciente. ", p2.equals(p1));

	}

}
