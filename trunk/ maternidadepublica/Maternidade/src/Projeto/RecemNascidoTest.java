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

public class RecemNascidoTest {

	private RecemNascido r1, r2, r3;

	@Before
	public void setUp() throws Exception {

		r1 = new RecemNascido("Pedro", "homem", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");
		r2 = new RecemNascido("Marina", "mulher", "caucasiana", "27/05/2010",
				1.8, "1 semana e meia", "estavel");

	}

	@Test(expected = Exception.class)
	public void testSexoVazio() throws Exception {

		r3 = new RecemNascido("Pedro", "    ", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");

	}

	@Test(expected = Exception.class)
	public void testSexoNull() throws Exception {

		r3 = new RecemNascido("Pedro", null, "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");

	}

	@Test(expected = Exception.class)
	public void testPesoZeroOuNegativo() throws Exception {

		r3 = new RecemNascido("Pedro", "homem", "Amarelo", "27/05/2010", 0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "", "Amarelo", "27/05/2010", -1,
				"1 semana", "bom");

	}

	@Test
	public void testGetPeso() {

		Assert.assertEquals(r2.getPeso(), 1.8, 0);
		Assert.assertFalse("Observacoes identicas. ", r1.getPeso() == r2
				.getPeso());

	}

	@Test
	public void testGetSexo() {

		Assert.assertEquals("Sexo errado. ", r2.getSexo(), "mulher");
		Assert.assertFalse("Mesmo sexo. ", r1.getSexo().equals(r2.getSexo()));

	}

	@Test
	public void testGetTempoHospitalizado() {

		Assert.assertEquals("Tempo incorreto. ", r1.getTempoHospitalizacao(),
				"1 semana");
		Assert.assertFalse("Tempo de hospitalizacao é o mesmo. ", r1
				.getTempoHospitalizacao().equals(r2.getTempoHospitalizacao()));

	}

	@Test
	public void testGetEstadoSaude() {

		Assert.assertEquals("Observacao errada. ", r2.getEstadoSaude(),
				"estavel");
		Assert.assertFalse("Observacoes identicas. ", r1.getEstadoSaude()
				.equals(r2.getEstadoSaude()));

	}

	@Test
	public void testEqualsObject() throws Exception {
		r3 = new RecemNascido("Pedro", "homem", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");

		Assert.assertEquals("São pacientes diferentes. ", r3, r1);
		Assert.assertTrue("São pacientes diferentes. ", r3.equals(r1));
		Assert.assertFalse("É o mesmo paciente. ", r2.equals(r1));

	}

	@Test
	public void testToString() {
		System.out.println(r2);
		Assert
				.assertEquals(
						"String errada. ",
						"Nome: Pedro\nCor: Amarelo   Peso: 2.0   Sexo: homem\nTempo de Hospitalização: 1 semana\nEstado de saúde: bom",
						r1.toString());
		Assert
				.assertEquals(
						"String errada. ",
						"Nome: Marina\nCor: caucasiana   Peso: 1.8   Sexo: mulher\nTempo de Hospitalização: 1 semana e meia\nEstado de saúde: estavel",
						r2.toString());

	}
}
