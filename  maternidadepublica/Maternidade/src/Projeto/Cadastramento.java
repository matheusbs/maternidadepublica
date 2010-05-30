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

public class Cadastramento {

	private ArrayList<Puerpera> listaPuerpera = new ArrayList<Puerpera>();
	private ArrayList<RecemNascido> listaRecem = new ArrayList<RecemNascido>();

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
	 * Pesquisa uma Puerpera
	 * 
	 * @param nome
	 *            - Nome da Puerpera
	 * @return String contendo as informações da Puerpera
	 */
	public String pesquisaPuerpera(String nome) {
		for (int i = 0; i < listaPuerpera.size(); i++) {
			if (listaPuerpera.get(i).getNome().toLowerCase().equals(
					nome.toLowerCase())) {
				return listaPuerpera.get(i).toString();
			}
		}
		return "Puerpera não encontrada. ";
	}

	/**
	 * Pesquisa um Recem Nascido
	 * 
	 * @param nome
	 *            - Nome do Recem Nascido
	 * @return String contendo as informações do Recem Nascido
	 */
	public String pesquisaRecemNascido(String nome) {
		for (int i = 0; i < listaRecem.size(); i++) {
			if (listaRecem.get(i).getNome().toLowerCase().equals(
					nome.toLowerCase())) {
				return listaRecem.get(i).toString();
			}
		}
		return "Recem Nascido não encontrada. ";
	}
}