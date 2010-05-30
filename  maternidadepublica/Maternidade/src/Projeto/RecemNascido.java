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

public class RecemNascido extends Pessoa {

	private double peso;
	private String tempoHospitalizacao;
	private String sexo;
	private String estadoSaude;

	// Construtor

	/**
	 * Construtor de Recem Nascido
	 * 
	 * @param nome
	 *            - Nome do Recem Nascido
	 * @param sexo
	 *            - Sexo do Recem Nascido
	 * @param cor
	 *            - Cor do Recem Nascido
	 * @param dataNascimento
	 *            - Data de Nascimento do Recem Nascido
	 * @param peso
	 *            - Peso do Recem Nascido
	 * @param tempoHospitalizacao
	 *            - Tempo de Hospitalização do Recem Nascido
	 * @param estadoSaude
	 *            - Estado de Saude do Recem Nascido
	 */
	public RecemNascido(String nome, String sexo, String cor,
			String dataNascimento, double peso, String tempoHospitalizacao,
			String estadoSaude) throws Exception {
		super(nome, cor, dataNascimento);
		if (sexo.trim().equals("") || sexo.trim().equals(null) || peso <= 0) {
			throw new IllegalArgumentException("Informações inválidas. ");
		}
		this.peso = peso;
		this.sexo = sexo;
		this.tempoHospitalizacao = tempoHospitalizacao;
		this.estadoSaude = estadoSaude;
	}

	// Metodos

	/**
	 * Recebe Peso do Recem Nascido
	 * 
	 * @return Peso
	 */
	public double getPeso() {
		return this.peso;
	}

	/**
	 * Recebe o Sexo do Recem Nascido
	 * 
	 * @return sexo
	 */
	public String getSexo() {
		return this.sexo;
	}

	/**
	 * Recebe o tempo de Hospitalização
	 * 
	 * @return tempoHospitalizacao
	 */
	public String getTempoHospitalizacao() {
		return this.tempoHospitalizacao;
	}

	/**
	 * Recebe Estado de saude do Recem Nascido
	 * 
	 * @return estadoSaude
	 */
	public String getEstadoSaude() {
		return this.estadoSaude;
	}

	/**
	 * Transforma os dados em String.
	 * 
	 * @return O string com as informações do Recem Nascido.
	 */
	public String toString() {
		return "Nome: " + getNome() + "\nCor: " + getCor() + "   Peso: "
				+ getPeso() + "   Sexo: " + getSexo()
				+ "\nTempo de Hospitalização: " + getTempoHospitalizacao()
				+ "\nEstado de saúde: " + estadoSaude;
	}

	/**
	 * Compara dois Recem Nascidos.
	 * 
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		if (!(objeto instanceof RecemNascido)) {
			return false;
		}
		RecemNascido outra = (RecemNascido) objeto;
		return getNome() == outra.getNome()
				&& getDataNascimento() == outra.getDataNascimento();
	}
}
