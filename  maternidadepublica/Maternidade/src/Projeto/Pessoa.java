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

public class Pessoa {
	private String nome;
	private String cor;
	private String dataNacimento;

	// Construtor

	/**
	 * Construtor da classe Pessoa, recebe como parametros:
	 * 
	 * @param nome
	 *            - O nome
	 * @param cor
	 *            - A cor da pele
	 * @param dataNascimento
	 *            - A data de nascimento
	 * @throws Exception
	 *             Caso o nome ou a pele sejam invalidos entrara numa Exceçao
	 */
	public Pessoa(String nome, String cor, String dataNascimento)
			throws Exception {
		if (nome.trim().equals("") || nome.trim().equals(null)
				|| cor.trim().equals("") || cor.trim().equals(null)) {
			throw new IllegalArgumentException(
					"Os campos nao devem ser deixados vazios");

		}
		this.nome = nome;
		this.cor = cor;
		this.dataNacimento = dataNascimento;
	}

	// Metodos

	/**
	 * Recebe o nome
	 * 
	 * @return Retorna o nome do Objeto Pessoa
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Recebe a cor
	 * 
	 * @return retorna a cor da pele do Objeto Pessoa
	 */
	public String getCor() {
		return this.cor;
	}

	/**
	 * Recebe a Data de Nascimento
	 * 
	 * @return retorna a data de nascimento do Objeto Pessoa
	 */
	public String getDataNascimento() {
		return this.dataNacimento;
	}

	/**
	 * Compara duas Pessoas
	 * 
	 * @return boolean
	 */
	public boolean equals(Object objeto) {
		if (!(objeto instanceof Pessoa)) {
			return false;
		}
		Pessoa outra = (Pessoa) objeto;
		return getNome() == outra.getNome()
				&& getDataNascimento() == outra.getDataNascimento();
	}
}
