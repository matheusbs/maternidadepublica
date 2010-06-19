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

import java.util.ArrayList;

public class Puerpera extends Pessoa {

	private ArrayList<RecemNascido> listaRecem = new ArrayList<RecemNascido>();
	private Endereco endereco;
	private String telefone;
	private String dataAdmissao;
	private String observacaoSaude;
	private String tipoParto;
	private String cpf;
	private int estadoSaudaveis, estadoNeomortos, estadoNatimortos;

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
	 *            - As informa��es sobre o seu endere�o
	 * @param pontoReferencia
	 *            - Um ponto de referencia
	 * @param telefone
	 *            - O telefone
	 * @param dataAdmissao
	 *            - A data de admiss�o
	 * @param observacaoSaude
	 *            - Sua observa�ao de saude
	 * @param tipoParto
	 *            - O tipo do parto, se � cesariana ou normal
	 * @throws Exception
	 *             Temos Exce�ao caso n�o seja completado os campos com o nome e
	 *             a cor.
	 */
	public Puerpera(String nome, String cpf, String cor, String dataNascimento,
			Endereco endereco, String telefone, String dataAdmissao,
			String observacaoSaude, String tipoParto) throws Exception {
		super(nome, cor, dataNascimento);

		if (!(cpf.matches("[0-9]*$"))) {
			throw new Exception("O cpf deve ser composto apenas de numeros. ");
		}

		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataAdmissao = dataAdmissao;
		this.observacaoSaude = observacaoSaude;
		this.tipoParto = tipoParto;

	}

	// Metodos

	/**
	 * Recebe o endere�o
	 * 
	 * @return retorna o endere�o da pessoa
	 */
	public Endereco getEndereco() {
		return this.endereco;
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
	 * Modifica o Tipo do Parto
	 * 
	 * @param tipoParto
	 */
	public void setTipoParto(String tipoParto) {
		this.tipoParto = tipoParto;
	}

	/**
	 * Recebe o tipo do Parto
	 * 
	 * @return retorna o tipo do Parto
	 */
	public String getTipoParto() {
		return tipoParto;
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
		return "CPF: " + getCpf() + "\nNome: " + getNome() + "\nCor: "
				+ getCor() + "   Data Nascimento: " + getDataNascimento()
				+ "\nEndereco: " + getEndereco() + "\nTelefone: "
				+ getTelefone() + "   Data de Admiss�o: " + getDataAdmissao()
				+ "\nObservacao Saude: " + getObservacaoSaude();
	}

	/**
	 * Cadastra um Recem Nascido a Maternidade
	 * 
	 * @param recemNascido
	 *            - Recem Nascido
	 * @return boolean
	 */
	public boolean addRecemNascido(RecemNascido recemNascido) {
		for (int i = 0; i < listaRecem.size(); i++) {
			if (listaRecem.get(i).equals(recemNascido)) {
				return false;
			}
		}
		if (recemNascido.getEstadoSaude().trim().toLowerCase().equals(
				"saudavel")) {
			estadoSaudaveis++;
		}
		if (recemNascido.getEstadoSaude().trim().toLowerCase().equals(
				"neomorto")) {
			estadoNeomortos++;
		}
		if (recemNascido.getEstadoSaude().trim().toLowerCase().equals(
				"natimorto")) {
			estadoNatimortos++;
		}
		listaRecem.add(recemNascido);
		return true;

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumeroDeRecemNascidos() {
		return listaRecem.size();
	}

	public int getEstadoSaudavel() {
		return estadoSaudaveis;
	}

	public int getEstadoNeomortos() {
		return estadoNeomortos;
	}

	public int getEstadoNatimortos() {
		return estadoNatimortos;
	}
}