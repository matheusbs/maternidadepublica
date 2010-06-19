package Projeto;

public class Consulta {

	private String dataConsulta, tipoConsulta, Consulta;
	private Puerpera puerpera;

	/**
	 * Construtor de Consulta
	 * 
	 * @param puerpera
	 *            A puerpera
	 * @param dataConsulta
	 *            A data da consulta
	 * @param consulta
	 *            O nome da consulta
	 * @param tipoConsulta
	 *            O tipo da consulta
	 * @throws Exception
	 * Cso algum dos parametros seja nulo ou vazio
	 */
	public Consulta(Puerpera puerpera, String dataConsulta, String consulta,
			String tipoConsulta) throws Exception {
		if (puerpera.equals("") || puerpera.equals(null)
				|| dataConsulta.equals("") || dataConsulta.equals(null)
				|| consulta.equals("") || consulta.equals(null)
				|| tipoConsulta.equals("") || tipoConsulta.equals(null)) {

		}
		this.puerpera = puerpera;
		this.dataConsulta = dataConsulta;
		this.tipoConsulta = tipoConsulta;
		this.Consulta = consulta;

	}
/**
 * Metodo para modificar o valor do Tipo da Consulta
 * @param tipoConsulta
 * Recebe como parametro o novo tipo da consulta
 */
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
/**
 * Metodo acessador 
 * @return
 * retorna o valor do tipo da consulta
 */
	public String getTipoConsulta() {
		return tipoConsulta;
	}
/**
 * Metodo que muda o valor da data da consulta
 * @param dataConsulta
 * Recebe como parametro a nova data da Consulta
 */
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
/**Metodo acessador
 * @return
 * retorna a data da consulta
 */
	public String getDataConsulta() {
		return dataConsulta;
	}
/**
 * Altera o valor da puerpera 
 * @param puerpera
 * recebe como parametro a nova puerpera
 */
	public void setPuerpera(Puerpera puerpera) {
		this.puerpera = puerpera;
	}
/**
 * Metodo acessador
 * @return
 * retorna o valor da puerpera
 */
	public Puerpera getPuerpera() {
		return puerpera;
	}
/**
 * Metodo que altera o valor da consulta
 * @param consulta
 * Recebe como parametro o novo valor da consulta
 */
	public void setConsulta(String consulta) {
		Consulta = consulta;
	}
/**
 * Metodo acessador
 * @return
 * Retorna o valor da consulta
 */
	public String getConsulta() {
		return Consulta;
	}
/**
 * Metodo toString
 * retorna a toString da clase
 */
	public String toString() {
		return "Nome: " + puerpera.getNome() + "\nCor: " + puerpera.getCor()
				+ "Data de Nascimento: " + puerpera.getDataNascimento()
				+ "\nData da Consulta: " + getDataConsulta() + "Tipo: "
				+ getTipoConsulta() + "\nConsulta: " + getConsulta();

	}

}
