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
	public void testConstrutorNull() throws Exception {

		r3 = new RecemNascido("Pedro", null, "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", null, "27/05/2010", 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", null, 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "27/05/2010",
				2.0, null, "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "27/05/2010",
				2.0, "1 semana", null);
		r3 = new RecemNascido(null, "Masculino", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");

	}

	@Test(expected = Exception.class)
	public void testConstrutorVazio() throws Exception {

		r3 = new RecemNascido("", "homem", "Amarelo", "27/05/2010", 0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "", "Amarelo", "27/05/2010", -1,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "", "27/05/2010", 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "", 2.0,
				"1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "27/05/2010",
				-2.0, "1 semana", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "27/05/2010",
				2.0, "", "bom");
		r3 = new RecemNascido("Pedro", "Masculino", "Amarelo", "27/05/2010",
				2.0, "1 semana", "");

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
		r2 = new RecemNascido("joao", "homem", "Amarelo", "27/05/2010", 2.0,
				"1 semana", "bom");
		RecemNascido r4 = new RecemNascido("Pedro", "homem", "Amarelo",
				"27/05/2010", 2.0, "1 semana", "bom");
		RecemNascido r5 = new RecemNascido("Pedro", "homem", "Caucasiano",
				"29/06/2010", 2.8, "1 mes", "regular");
		Assert.assertEquals("São pacientes diferentes. ", r3, r1);
		Assert.assertTrue("São pacientes diferentes. ", r3.equals(r1));
		Assert.assertFalse("É o mesmo paciente. ", r2.equals(r1));
		Assert.assertFalse("É o mesmo paciente. ", r3.equals(r2));
		Assert.assertTrue("É o mesmo paciente. ", r3.equals(r4));
		Assert.assertFalse("São pacientes diferentes. ", r5.equals(r4));
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
