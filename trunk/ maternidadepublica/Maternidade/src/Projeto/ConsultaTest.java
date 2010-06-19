package Projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsultaTest {
	private Consulta c1, c2, c3, c4;

	@Before
	public void setUp() throws Exception {
		Endereco endereco1 = new Endereco("Galdino Formiga", "14", "555555",
				"Areias", "Sousa", "Ceara", "1 andar");
		Puerpera puerpera1 = new Puerpera("Maria", "5555555", "Caucasiana",
				"27/10/1879", endereco1, "5555555", "18/06/2010", "estavel",
				"cesariana");

		c1 = new Consulta(puerpera1, "18/06/2010", "Parto", "urgente");

	}

	@Test(expected = Exception.class)
	public void testaConstrutoNull() throws Exception {
		Endereco endereco1 = new Endereco("Galdino Formiga", "14", "555555",
				"Areias", "Sousa", "Ceara", "1 andar");
		Puerpera puerpera1 = new Puerpera("Maria", "5555555", "Caucasiana",
				"27/10/1879", endereco1, "5555555", "18/06/2010", "estavel",
				"cesariana");

		c2 = new Consulta(null, "18/06/2010", "Parto", "urgente");
		c3 = new Consulta(puerpera1, null, "Parto", "urgente");
		c4 = new Consulta(puerpera1, "18/06/2010", null, "urgente");
		c2 = new Consulta(puerpera1, "18/06/2010", "Parto", null);

	}

	@Test
	public void setGetTipoConsulta() {
		Assert.assertEquals("urgente", c1.getTipoConsulta());
		c1.setTipoConsulta("normal");
		Assert.assertEquals("normal", c1.getTipoConsulta());
	}

	@Test
	public void setGetDataConsulta() {
		Assert.assertEquals("18/06/2010", c1.getDataConsulta());
		c1.setDataConsulta("22/06/2010");
		Assert.assertEquals("22/06/2010", c1.getDataConsulta());
	}

	@Test
	public void setGetPuerpera() throws Exception {
		Endereco endereco1 = new Endereco("Galdino Formiga", "14", "555555",
				"Areias", "Sousa", "Ceara", "1 andar");
		Puerpera puerpera1 = new Puerpera("Maria", "5555555", "Caucasiana",
				"27/10/1879", endereco1, "5555555", "18/06/2010", "estavel",
				"cesariana");
		Puerpera puerpera2 = new Puerpera("Joana", "5555555", "Amarela",
				"27/10/1879", endereco1, "5555555", "18/06/2010", "estavel",
				"cesariana");
		Assert.assertEquals(puerpera1, c1.getPuerpera());
		c1.setPuerpera(puerpera2);
		Assert.assertEquals(puerpera2, c1.getPuerpera());
	}

	@Test
	public void setGetConsutlta() {
		Assert.assertEquals("Parto", c1.getConsulta());
		c1.setConsulta("cesariana");
		Assert.assertEquals("cesariana", c1.getConsulta());
	}
}
