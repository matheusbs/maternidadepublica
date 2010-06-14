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

public class Cadastramento {

	private ArrayList<Puerpera> listaPuerpera = new ArrayList<Puerpera>();
	private ArrayList<RecemNascido> listaRecem = new ArrayList<RecemNascido>();
	private ArrayList<Consulta> listaConsulta = new ArrayList<Consulta>();

	// Metodos

	/**
	 * Cadastra uma puerpera na Maternidade
	 * 
	 * @param puerpera
	 *            - Puerpera
	 * @return boolean
	 */
	public boolean addPuerpera(Puerpera puerpera) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).equals(puerpera)) {
				return false;
			}
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
	public boolean removePuerpera(String puerpera) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getNome().equals(puerpera)) {
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
	 * @return String contendo as informa��es da Puerpera
	 */
	public String pesquisaPuerpera(String nome) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getNome().toLowerCase().equals(
					nome.toLowerCase())) {
				return listaPuerpera.get(i).toString();
			}
		}
		return "Puerpera n�o encontrada. ";
	}

	/**
	 * Verifica se contem Puerpera
	 * 
	 * @param nome
	 *            - Nome da Puerpera
	 * @return Puerpera
	 */
	public Puerpera contemPuerpera(String nome) {

		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getNome().toLowerCase().equals(
					nome.toLowerCase())) {
				return listaPuerpera.get(i);
			}
		}
		return null;
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
		listaRecem.add(recemNascido);
		return true;
	}

	/**
	 * Remove um Recem Nascido da Maternidade
	 * 
	 * @param recemNascido
	 *            - Recem Nascido
	 * @return boolean
	 */
	public boolean removeRecemNascido(String recemNascido) {
		for (int i = 0; i < listaRecem.size(); i++) {
			if (listaRecem.get(i).getNome().equals(recemNascido)) {
				listaRecem.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * Pesquisa um Recem Nascido
	 * 
	 * @param nome
	 *            - Nome do Recem Nascido
	 * @return String contendo as informa��es do Recem Nascido
	 */
	public String pesquisaRecemNascido(String nome) {
		for (int i = 0; i < listaRecem.size(); i++) {
			if (listaRecem.get(i).getNome().toLowerCase().equals(
					nome.toLowerCase())) {
				return listaRecem.get(i).toString();
			}
		}
		return "Recem Nascido n�o encontrada. ";
	}

	public boolean addConsulta(Consulta consulta) {
		for (int i = 0; i < listaConsulta.size(); i++) {
			if (listaConsulta.get(i).equals(consulta)) {
				return false;
			}
		}
		listaConsulta.add(consulta);
		return true;
	}

	public boolean removeConsulta(String nomePaciente) {
		for (int i = 0; i < listaConsulta.size(); i++) {
			if (listaConsulta.get(i).getPuerpera().getNome().equals(
					nomePaciente)) {
				listaConsulta.remove(i);
				return true;
			}
		}
		return false;
	}

	public String consultasAgendadas() {

		String agenda = "";
		for (int i = 0; i < listaConsulta.size(); i++) {

			agenda = agenda + "\n" + listaConsulta.get(i).toString();

		}

		return agenda;
	}
}