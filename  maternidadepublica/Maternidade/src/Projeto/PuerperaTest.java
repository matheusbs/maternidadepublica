package Projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PuerperaTest {

	private Puerpera p1, p2, p3;
	private Endereco e1, e2, e3;
	private RecemNascido r1, r2;

	@Before
	public void setUp() throws Exception {

		e1 = new Endereco("rua joao pessoa", "3", "58800000", "centro",
				"campina grande", "paraiba", "centro de campina");

		e2 = new Endereco("rua maciel pinheiro", "10", "57800000", "centro",
				"campina grande", "paraiba", "proximo da praça a bandeira");

		e3 = new Endereco("rua joao pessoa", "3", "58800000", "centro",
				"campina grande", "paraiba", "centro de campina");

		p1 = new Puerpera("maria", "123456789", "branca", "25/05/1973", e1,
				"88888888", "18/06/2010", "saudavel", "normal");

		p2 = new Puerpera("Teresa", "987654321", "Pardo", "02/08/1882", e2,
				"88880000", "27/05/2010", "estavel", "cesariana");

		r1 = new RecemNascido("Pedro", "homem", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");

		r2 = new RecemNascido("Marina", "mulher", "caucasiana", "27/05/2010",
				1.8, "1 semana e meia", "estavel");

	}

	@Test
	public void testToString() {

		Assert
				.assertEquals(
						"String errada. ",
						"CPF: 123456789\nNome: maria\nCor: branca   Data Nascimento: 25/05/1973\nEndereco: Rua: rua joao pessoa, Numero: 3\nCEP: 58800000, Bairro: centro\nCidade: campina grande, Estado: paraiba\nComplemento: centro de campina\nTelefone: 88888888   Data de Admissão: 18/06/2010\nObservacao Saude: saudavel",
						p1.toString());
		Assert
				.assertEquals(
						"String errada. ",
						"CPF: 987654321\nNome: Teresa\nCor: Pardo   Data Nascimento: 02/08/1882\nEndereco: Rua: rua maciel pinheiro, Numero: 10\nCEP: 57800000, Bairro: centro\nCidade: campina grande, Estado: paraiba\nComplemento: proximo da praça a bandeira\nTelefone: 88880000   Data de Admissão: 27/05/2010\nObservacao Saude: estavel",
						p2.toString());

	}

	@Test
	public void testGetEndereco() {

		Assert.assertEquals("Endereços errado. ", p1.getEndereco(), e1);
		Assert.assertFalse("Endereços identicos. ", p1.getEndereco().equals(
				p2.getEndereco()));

	}

	@Test
	public void testGetTelefone() {

		Assert.assertEquals("Telefone errado. ", p2.getTelefone(), "88880000");
		Assert.assertFalse("Telefones identicos. ", p1.getTelefone().equals(
				p2.getTelefone()));

	}

	@Test
	public void testGetDataAdmissao() {

		Assert
				.assertEquals("Data errada. ", p2.getDataAdmissao(),
						"27/05/2010");
		Assert.assertFalse("Datas diferentes. ", p1.getDataAdmissao().equals(
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
		p3 = new Puerpera("maria", "123456789", "branca", "25/05/1973", e1,
				"88888888", "18/06/2010", "saudavel", "normal");

		Assert.assertEquals("São pacientes diferentes. ", p3, p1);
		Assert.assertTrue("São pacientes diferentes. ", p3.equals(p1));
		Assert.assertFalse("É o mesmo paciente. ", p2.equals(p1));

	}

	@Test
	public void testAddRecemNascido() {

		Assert.assertTrue("Não adicionou. ", p1.addRecemNascido(r1));
		Assert.assertTrue("Não adicionou. ", p2.addRecemNascido(r2));

	}

}
