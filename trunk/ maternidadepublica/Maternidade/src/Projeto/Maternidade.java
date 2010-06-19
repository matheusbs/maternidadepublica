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

import java.util.ArrayList;

public class Maternidade {

	private ArrayList<Puerpera> listaPuerpera = new ArrayList<Puerpera>();
	private ArrayList<Consulta> listaConsulta = new ArrayList<Consulta>();
	private int partosNormais, partosCesarianas;

	// Metodos

	/**
	 * Cadastra uma puerpera na Maternidade
	 * 
	 * @param puerpera
	 *            - Puerpera
	 * @return boolean
	 * @throws IOException
	 */
	public boolean addPuerpera(Puerpera puerpera) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getCpf().equals(puerpera.getCpf())) {
				return false;
			}
		}

		if (puerpera.getTipoParto().trim().toLowerCase().equals("normal")) {
			partosNormais++;
		}
		if (puerpera.getTipoParto().trim().toLowerCase().equals("cesariana")) {
			partosCesarianas++;
		}

		listaPuerpera.add(puerpera);

		return true;
	}

	/**
	 * Remove a puerpera da Maternidade
	 * 
	 * @param puerpera
	 *            - Puerpera
	 * @return boolean
	 */
	public boolean removePuerpera(String cpf) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getCpf().equals(cpf)) {
				listaPuerpera.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * Pesquisa uma Puerpera
	 * 
	 * @param nome
	 *            - Nome da Puerpera
	 * @return String contendo as informações da Puerpera
	 */
	public String pesquisaPuerpera(String cpf) {

		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getCpf().toLowerCase().equals(
					cpf.toLowerCase())) {
				return listaPuerpera.get(i).toString();
			}
		}
		return "Puerpera não encontrada. ";
	}

	/**
	 * Verifica se contem Puerpera
	 * 
	 * @param nome
	 *            - Nome da Puerpera
	 * @return Puerpera
	 */
	public Puerpera contemPuerpera(String cpf) {

		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getCpf().equals(cpf)) {
				return listaPuerpera.get(i);
			}
		}

		return null;
	}

	/**
	 * Metodo para adicionar consulta
	 * 
	 * @param consulta
	 * @return retorna true se a consulta for adicionada e falso se nao for.
	 */

	public boolean addConsulta(Consulta consulta) {
		for (int i = 0; i < listaConsulta.size(); i++) {
			if (listaConsulta.get(i).equals(consulta)) {
				return false;
			}
		}
		listaConsulta.add(consulta);
		return true;
	}

	/**
	 * Metodo que remove a consulta
	 * 
	 * @param nomePaciente
	 * @return retorna true caso consiga remover a consult e falso se nao
	 *         conseguir
	 */
	public boolean removeConsulta(String cpf) {
		for (int i = 0; i < listaConsulta.size(); i++) {
			if (listaConsulta.get(i).getPuerpera().getCpf().equals(cpf)) {
				listaConsulta.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo usado para retornar a agenda do dia
	 * 
	 * @return
	 */

	public String consultasAgendadas() {

		String agenda = "";
		for (int i = 0; i < listaConsulta.size(); i++) {

			agenda += agenda + listaConsulta.get(i).toString() + "\n";
		}
		return agenda;
	}

	/**
	 * Metodo de balanco geral
	 * 
	 * @return retorna o balanço geral do dia
	 */
	public String balancoGeral() {
		int numeroRecem = 0, estadoSaudavel = 0, estadoNeomorto = 0, estadoNatimorto = 0;
		String balancoRecem = "";
		for (int i = 0; i < listaPuerpera.size(); i++) {
			numeroRecem += listaPuerpera.get(i).getNumeroDeRecemNascidos();
			estadoSaudavel += listaPuerpera.get(i).getEstadoSaudavel();
			estadoNeomorto += listaPuerpera.get(i).getEstadoNeomortos();
			estadoNatimorto += listaPuerpera.get(i).getEstadoNatimortos();

		}
		balancoRecem = "\nNumero de Recem Nascidos: " + numeroRecem
				+ "\nRecem Nascidos saudaveis: " + estadoSaudavel
				+ "\nRecem Nascidos neomortos: " + estadoNeomorto
				+ "\nRecem Nascidos natimortos: " + estadoNatimorto;

		return "Numero de Puerperas: " + listaPuerpera.size()
				+ "\nPartos Normais: " + partosNormais
				+ "\nPartos Cesarianas: " + partosCesarianas + balancoRecem
				+ "\nNumero de Consultas agendadas: " + listaConsulta.size();
	}
}