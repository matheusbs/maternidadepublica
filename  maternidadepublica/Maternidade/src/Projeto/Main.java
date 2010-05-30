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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	private static Puerpera puerpera;

	private static RecemNascido recemNascido;

	private static Cadastramento maternidade;

	public static void main(String[] args) throws Exception {
		int opcao = 0;
		maternidade = new Cadastramento();

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a Maternidade Gongol�poles. \n");

		while (opcao >= 0 || opcao <= 3) {
			System.out.println("Menu: \n");
			System.out.println("1 - Cadastrar Pu�rpera. ");
			System.out.println("2 - Remover Pu�rpera. ");
			System.out.println("3 - Cadastrar Rec�m Nascidos. ");
			System.out.println("4 - RemoverRec�m Nascido. ");
			System.out.println("5 - Pesquisar Puerpera");
			System.out.println("6 - Pesquisar Recem Nascido");
			System.out.println("7 - Sair.\n");
			System.out.println("Selecione sua Op��o: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:

				String nome = "",
				cor = "",
				endereco = "",
				pontoReferencia,
				observacaoSaude = "",
				telefone = "",
				dataAdimicao = "",
				dataNascimento = "";

				while (nome.equals("")) {
					System.out.println("Nome: ");
					nome = input.readLine().trim();
					if (nome.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (cor.equals("")) {
					System.out.println("Cor: ");
					cor = input.readLine().trim();
					if (cor.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (endereco.equals("")) {
					System.out.println("Endere�o: ");
					endereco = input.readLine().trim();
					if (endereco.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}

				System.out.println("Ponto de Referencia: ");
				pontoReferencia = input.readLine().trim();

				while (observacaoSaude == "") {
					System.out.println("Observa��o de Saude: ");
					observacaoSaude = input.readLine().trim();
					if (observacaoSaude.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				System.out.println("Telefone: ");
				telefone = input.readLine().trim();

				while (dataAdimicao.equals("")) {
					System.out.println("Data de Adimi��o: ");
					dataAdimicao = input.readLine().trim();
					if (dataAdimicao.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (dataNascimento.equals("")) {
					System.out.println("Data de Nascimento: ");
					dataNascimento = input.readLine().trim();
					if (dataNascimento.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				puerpera = new Puerpera(nome, cor, dataNascimento, endereco,
						pontoReferencia, telefone, dataAdimicao,
						observacaoSaude);
				maternidade.addPuerpera(puerpera);
				break;

			case 2:

				System.out.println("Nome da Pu�rpera? ");
				nome = input.readLine().trim();
				if (maternidade.removePuerpera(nome) == true) {
					System.out.println("Puerpera removida com sucesso. ");
				} else {
					System.out.println("Puerpera n�o p�de ser removida. ");
				}
				break;

			case 3:

				double peso = 0;
				String nomeRecem = "",
				sexo = "",
				corRecem = "",
				observacaoSaudeRecem = "",
				tempoHospitalizacao = "",
				dataNascimentoRecem = "";

				while (nomeRecem.equals("")) {
					System.out.println("Nome: ");
					nomeRecem = input.readLine().trim();
					if (nomeRecem.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (sexo.equals("")) {
					System.out.println("Sexo: ");
					sexo = input.readLine().trim();
					if (sexo.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (corRecem.equals("")) {
					System.out.println("Cor: ");
					corRecem = input.readLine().trim();
					if (corRecem.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (dataNascimentoRecem.equals("")) {
					System.out.println("Data Nascimento: ");
					dataNascimentoRecem = input.readLine().trim();
					if (dataNascimentoRecem.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (peso <= 0) {
					System.out.println("Peso: ");
					peso = sc.nextDouble();
					if (peso <= 0) {
						System.out.println("Peso inv�lido. ");
					}
				}
				while (observacaoSaudeRecem.equals("")) {
					System.out.println("Observa��o de Saude: ");
					observacaoSaudeRecem = input.readLine().trim();
					if (observacaoSaudeRecem.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				while (tempoHospitalizacao.equals("")) {
					System.out.println("Tempo de Hospitaliza��o: ");
					tempoHospitalizacao = input.readLine().trim();
					if (tempoHospitalizacao.equals("")) {
						System.out.println("Campo obrigat�rio. ");
					}
				}
				recemNascido = new RecemNascido(nomeRecem, sexo, corRecem,
						dataNascimentoRecem, peso, tempoHospitalizacao,
						observacaoSaudeRecem);
				maternidade.addRecemNascido(recemNascido);
				break;

			case 4:

				System.out.println("Nome do Recem Nascido? ");
				nome = input.readLine().trim();
				if (maternidade.removeRecemNascido(nome) == true) {
					System.out.println("Recem Nascido removido com sucesso. ");
				} else {
					System.out.println("Recem Nascido n�o p�de ser removido. ");
				}
				break;

			case 5:

				System.out.println("Digite o nome da pu�rpera:");
				nome = input.readLine().trim();
				System.out.println(maternidade.pesquisaPuerpera(nome));
				break;

			case 6:

				System.out.println("Digite o nome do beb�");
				nome = input.readLine().trim();
				System.out.println(maternidade.pesquisaRecemNascido(nome));
				break;

			case 7:

				System.out.println("Fim.");
				System.exit(1);
			}
		}
	}
}
