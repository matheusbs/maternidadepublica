package Projeto;

public class Consulta {

	private String dataConsulta, tipoConsulta, Consulta;
	private Puerpera puerpera;

	public Consulta(Puerpera puerpera, String dataConsulta, String consulta,
			String tipoConsulta) throws Exception {
		this.puerpera = puerpera;
		this.dataConsulta = dataConsulta;
		this.tipoConsulta = tipoConsulta;
		this.Consulta = consulta;

	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setPuerpera(Puerpera puerpera) {
		this.puerpera = puerpera;
	}

	public Puerpera getPuerpera() {
		return puerpera;
	}

	public void setConsulta(String consulta) {
		Consulta = consulta;
	}

	public String getConsulta() {
		return Consulta;
	}

	public String toString() {
		return "Nome: " + puerpera.getNome() + "\nCor: " + puerpera.getCor()
				+ "Data de Nascimento: " + puerpera.getDataNascimento()
				+ "\nData da Consulta: " + getDataConsulta() + "Tipo: "
				+ getTipoConsulta() + "\nConsulta: " + getConsulta();
	}

}
