/**
 * Projeto Maternidade Public de Gongolopolis
 * 
 * @author Glauber Juarez Barbosa Lopes
 * @author Jos� Arthur Gadelha Alexandre
 * @author Matheus Batista Silva
 * 
 * Vers�o 1.0
 */

package Projeto;

public class Puerpera extends Pessoa {
	private String endereco;
	private String pontoReferencia;
	private String telefone;
	private String dataAdmissao;
	private String observacaoSaude;

	// Construtor

	/**
	 * Construtor Puerpera
	 * 
	 * @param nome
	 *            - O nome
	 * @param cor
	 *            - A cor
	 * @param dataNascimento
	 *            - Sua data de nascimento
	 * @param endereco
	 *            - O seu endere�o
	 * @param pontoReferencia
	 *            - Um ponto de referencia
	 * @param telefone
	 *            - O telefone
	 * @param dataAdmissao
	 *            - A data de admiss�o
	 * @param observacaoSaude
	 *            - Sua observa�ao de saude
	 * @throws Exception
	 *             Temos Exce�ao caso n�o seja completado os campos com o nome e
	 *             a cor.
	 */
	public Puerpera(String nome, String cor, String dataNascimento,
			String endereco, String pontoReferencia, String telefone,
			String dataAdmissao, String observacaoSaude) throws Exception {

		super(nome, cor, dataNascimento);
		this.endereco = endereco;
		this.pontoReferencia = pontoReferencia;
		this.telefone = telefone;
		this.dataAdmissao = dataAdmissao;
		this.observacaoSaude = observacaoSaude;

	}

	// Metodos

	/**
	 * Recebe o endere�o
	 * 
	 * @return retorna o endere�o da pessoa
	 */
	public String getEndereco() {
		return this.endereco;
	}

	/**
	 * Recebe o Ponto de Referencia
	 * 
	 * @return retorna o Ponto de Referencia
	 */
	public String getPontoReferencia() {
		return this.pontoReferencia;
	}

	/**
	 * Recebe o telefone
	 * 
	 * @return retorna o telefone
	 */
	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * Recebe a Data de Admiss�o
	 * 
	 * @return retorna a data de admiss�o
	 */
	public String getDataAdmissao() {
		return this.dataAdmissao;
	}

	/**
	 * Recebe Observa��o de Saude
	 * 
	 * @return retorna a observa��o de saude
	 */
	public String getObservacaoSaude() {
		return this.observacaoSaude;

	}

	/**
	 * Compara duas Puerperas.
	 * 
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		if (!(objeto instanceof Puerpera)) {
			return false;
		}
		Puerpera outra = (Puerpera) objeto;
		return getNome() == outra.getNome()
				&& getDataNascimento() == outra.getDataNascimento();
	}

	/**
	 * Transforma os dados em String.
	 * 
	 * @return O string com as informa��es da Puerpera.
	 */
	public String toString() {
		return "Nome: " + getNome() + "\nCor: " + getCor()
				+ "   Data Nascimento: " + getDataNascimento() + "\nEndereco: "
				+ getEndereco() + "\nTelefone: " + getTelefone()
				+ "   Data de Admiss�o: " + getDataAdmissao()
				+ "\nObservacao Saude: " + getObservacaoSaude();
	}
}