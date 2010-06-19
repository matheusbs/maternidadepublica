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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	private static Puerpera puerpera;

	private static RecemNascido recemNascido;

	private static Maternidade maternidade;

	private static Consulta consulta1;

	private static Endereco endereco;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		int opcao = 0;

		maternidade = new Maternidade();

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a Maternidade Gongolópoles. \n");

		while (opcao >= 0 || opcao <= 4) {
			System.out.println("Menu: \n");
			System.out.println("1 - Puérpera. ");
			System.out.println("2 - Marcar Consulta. ");
			System.out.println("3 - Visualizar consultas. ");
			System.out.println("4 - Balanço do dia. ");
			System.out.println("5 - Sair.\n");
			System.out.println("Selecione sua Opção: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				int option = 0;

				while (option >= 0 || option <= 4) {
					System.out.println("1 - Cadastrar puerpera. ");
					System.out.println("2 - Cadastrar Recem Nascido. ");
					System.out.println("3 - Remover Puerpera. ");
					System.out.println("4 - Visualizar puerpera. ");
					System.out.println("5 - Voltar ao menu principal.");
					System.out.println("Selecione sua Opção: ");
					option = sc.nextInt();

					switch (option) {

					case 1:

						String cpf = "",
						nome = "",
						tipoParto = "",
						cor = "",
						observacaoSaude = "",
						telefone = "",
						dataAdmissao = "",
						dataNascimento = "",
						rua = "",
						numero = "",
						cep = "",
						bairro = "",
						cidade = "",
						estado = "",
						complemento = "";

						while (nome.equals("")) {

							System.out.println("Nome: ");
							nome = input.readLine().trim();
							if (nome.equals("") || nome.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(nome.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Digite apenas letras no nome. ");
								nome = "";
							}
						}
						while (cpf.equals("")) {
							System.out.println("Cpf: ");
							cpf = input.readLine().trim();
							if (cpf.equals("") || cpf.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(cpf.matches("[0-9]*$"))) {
								System.out.println("Digite apenas numeros. ");
								cpf = "";
							}
						}
						while (cor.equals("")) {

							System.out.println("Cor: ");
							cor = input.readLine().trim();
							if (cor.equals("") || cor.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(cor.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Digite apenas letas na cor. ");
								cor = "";
							}
						}
						while (rua.equals("")) {
							System.out.println("Rua: ");
							rua = input.readLine().trim();
							if (rua.equals("") || rua.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}
						}
						while (numero.equals("")) {
							System.out.println("Numero: ");
							numero = input.readLine().trim();
							if (numero.equals("") || numero.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}
							if (!(numero.matches("[0-9]*$"))) {
								System.out.println("Digite apenas numeros. ");
								numero = "";
							}
						}
						while (cep.equals("")) {
							System.out.println("Cep: ");
							cep = input.readLine().trim();
							if (cep.equals("") || cep.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}
							if (!(cep.matches("[0-9]*$"))) {
								System.out
										.println("Digite apenas Números no cep. ");
								cep = "";
							}
						}
						while (bairro.equals("")) {
							System.out.println("Bairro: ");
							bairro = input.readLine().trim();
							if (bairro.equals("") || bairro.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}

						}
						while (cidade.equals("")) {
							System.out.println("Cidade: ");
							cidade = input.readLine().trim();
							if (cidade.equals("") || cidade.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}
							if (!(cidade.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Digite apenas letras no nome da cidade. ");
								cidade = "";
							}
						}
						while (estado.equals("")) {
							System.out.println("Estado: ");
							estado = input.readLine().trim();
							if (estado.equals("") || estado.equals(null)) {
								System.out.println("Campo Obrigatório. ");
							}
							if (!(estado.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Digite apenas letras no nome estado. ");
								estado = "";
							}
						}

						System.out.println("Complemento: ");
						complemento = input.readLine().trim();

						while (observacaoSaude.equals("")) {

							System.out.println("Observação de Saude: ");
							observacaoSaude = input.readLine().trim();
							if (observacaoSaude.equals("")
									|| observacaoSaude.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
						}

						while (telefone.equals("")) {
							System.out.println("Telefone: ");
							telefone = input.readLine().trim();
							if (!(telefone.matches("[0-9]*$"))) {
								System.out
										.println("Telefone so pode ter numeros. ");
								telefone = "";
							} else {
								break;
							}
						}
						while (dataAdmissao.equals("")) {

							System.out.println("Data de Adimição: ");
							dataAdmissao = input.readLine().trim();
							if (dataAdmissao.equals("")) {
								System.out.println("Campo obrigatório. ");
							}
						}
						while (dataNascimento.equals("")) {

							System.out.println("Data de Nascimento: ");
							dataNascimento = input.readLine().trim();
							if (dataNascimento.equals("")) {
								System.out.println("Campo obrigatório. ");
							}
						}
						while (tipoParto.equals("")) {
							System.out
									.println("O parto foi normal ou cesariana? ");
							tipoParto = input.readLine().trim().toLowerCase();
							if (!(tipoParto.equals("normal") || tipoParto
									.equals("cesariana"))) {
								System.out
										.println("Tipo de parto desconhecido, por favor informe novamente. ");
								tipoParto = "";
							}
						}

						endereco = new Endereco(rua, numero, cep, bairro,
								cidade, estado, complemento);

						puerpera = new Puerpera(nome, cpf, cor, dataNascimento,
								endereco, telefone, dataAdmissao,
								observacaoSaude, tipoParto);
						maternidade.addPuerpera(puerpera);
						break;

					case 2:

						double peso = 0;
						String nomeRecem = "",
						sexo = "",
						corRecem = "",
						estadoSaude = "",
						tempoHospitalizacao = "",
						dataNascimentoRecem = "";

						System.out.println("Digite o cpf da mãe: ");
						cpf = input.readLine().trim();
						while (cpf.equals("")) {
							System.out.println("Cpf: ");
							cpf = input.readLine().trim();
							if (cpf.equals("") || cpf.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(cpf.matches("[0-9]*$"))) {
								System.out.println("Digite apenas numeros. ");
								cpf = "";
							}
						}

						puerpera = maternidade.contemPuerpera(cpf);
						if (puerpera == null) {
							System.out.println("Puerpera nao foi encontrada. ");
							break;
						}
						while (nomeRecem.equals("")) {
							System.out.println("Nome: ");
							nomeRecem = input.readLine().trim();
							if (nomeRecem.equals("") || nomeRecem.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(nomeRecem.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Utilise apenas letras no nome");
								nomeRecem = "";
							}
						}
						while (sexo.equals("")) {
							System.out.println("Sexo: ");
							sexo = input.readLine().trim();
							if (sexo.equals("") || sexo.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(sexo.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Ultilise apenas letras no sexo");
								sexo = "";
							}
						}
						while (corRecem.equals("")) {
							System.out.println("Cor: ");
							corRecem = input.readLine().trim();
							if (corRecem.equals("") || corRecem.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(corRecem.matches("[a-zA-Z]*$"))) {
								System.out
										.println("Ultilize apenas letas na cor");
								corRecem = "";
							}
						}
						while (dataNascimentoRecem.equals("")) {
							System.out.println("Data Nascimento: ");
							dataNascimentoRecem = input.readLine().trim();
							if (dataNascimentoRecem.equals("")
									|| dataNascimentoRecem.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}

						}
						while (peso <= 0) {
							System.out.println("Peso: ");
							peso = sc.nextDouble();
							if (peso <= 0) {
								System.out.println("Peso inválido. ");
							}
						}
						while (estadoSaude.equals("")) {
							System.out
									.println("Estado de Saude(Saudavel, Natimorto, Neomorto): ");
							estadoSaude = input.readLine().trim();
							if (estadoSaude.equals("")
									|| estadoSaude.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}

							if (!(estadoSaude.equals("saudavel")
									|| estadoSaude.equals("natimorto") || estadoSaude
									.equals("neomorto"))) {
								System.out
										.println("Estado de saude não foi reconhecido, por favor informe novamente. ");
								estadoSaude = "";
							}
						}
						while (tempoHospitalizacao.equals("")) {
							System.out.println("Tempo de Hospitalização: ");
							tempoHospitalizacao = input.readLine().trim();
							if (tempoHospitalizacao.equals("")
									|| tempoHospitalizacao.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
						}
						RecemNascido recemNascido = new RecemNascido(nomeRecem,
								sexo, corRecem, dataNascimentoRecem, peso,
								tempoHospitalizacao, estadoSaude);
						System.out.println(puerpera
								.addRecemNascido(recemNascido));
						if (puerpera.addRecemNascido(recemNascido) == true) {
							System.out
									.println("Recem Nascido cadastrado com sucesso. ");
						} else {
							System.out
									.println("Recem Nascido não foi cadastrado com sucesso. ");
						}
						break;

					case 3:

						System.out.println("Digite o cpf da puérpera:");
						cpf = input.readLine().trim();
						while (cpf.equals("")) {
							System.out.println("Cpf: ");
							cpf = input.readLine().trim();
							if (cpf.equals("") || cpf.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(cpf.matches("[0-9]*$"))) {
								System.out.println("Digite apenas numeros. ");
								cpf = "";
							}
						}
						boolean remove;
						remove = maternidade.removePuerpera(cpf);
						if (remove == true) {
							System.out
									.println("Puerpera removida com sucesso. ");
						} else {
							System.out
									.println("Puerpera não pôde ser removida. ");
						}
						break;

					case 4:
						System.out.println("Digite o cpf da puérpera:");
						cpf = input.readLine().trim();
						while (cpf.equals("")) {
							System.out.println("Cpf: ");
							cpf = input.readLine().trim();
							if (cpf.equals("") || cpf.equals(null)) {
								System.out.println("Campo obrigatório. ");
							}
							if (!(cpf.matches("[0-9]*$"))) {
								System.out.println("Digite apenas numeros. ");
								cpf = "";
							}
						}
						System.out.println(maternidade.pesquisaPuerpera(cpf));
						break;

					case 5:
						break;
					}
					break;
				}
				break;
			case 2:

				Puerpera puerpera = null;
				String dataConsulta = "",
				consulta = "",
				tipoConsulta = "",
				confirmaCadastro = "";
				String cpf = "",
				nome = "",
				tipoParto = "",
				cor = "",
				observacaoSaude = "",
				telefone = "",
				dataAdmissao = "",
				dataNascimento = "",
				rua = "",
				numero = "",
				cep = "",
				bairro = "",
				cidade = "",
				estado = "",
				complemento = "";
				while (tipoConsulta.equals("")) {

					System.out.println("A consulta é normal ou urgente? ");
					tipoConsulta = input.readLine().trim().toLowerCase();
					if (!(tipoConsulta.equals("normal") || tipoConsulta
							.equals("urgente"))) {
						tipoConsulta = "";

					}

				}
				while (confirmaCadastro.equals("")) {

					System.out.println("A puerpera ja possui cadastro? ");
					confirmaCadastro = input.readLine().trim().toLowerCase();

				}
				if (confirmaCadastro.equals("s")
						|| confirmaCadastro.equals("sim")) {
					System.out.println("Informe seu CPF: ");
					cpf = input.readLine();
					puerpera = maternidade.contemPuerpera(cpf);
				}

				if (confirmaCadastro.equals("n")
						|| confirmaCadastro.equals("nao")
						|| confirmaCadastro.equals("não")) {

					while (nome.equals("")) {

						System.out.println("Nome: ");
						nome = input.readLine().trim();
						if (nome.equals("") || nome.equals(null)) {
							System.out.println("Campo obrigatório. ");
						}
						if (!(nome.matches("[a-zA-Z]*$"))) {
							System.out
									.println("Digite apenas letras no nome. ");
							nome = "";
						}
					}
					while (cpf.equals("")) {
						System.out.println("Cpf: ");
						cpf = input.readLine().trim();
						if (cpf.equals("") || cpf.equals(null)) {
							System.out.println("Campo obrigatório. ");
						}
						if (!(cpf.matches("[0-9]*$"))) {
							System.out.println("Digite apenas numeros. ");
							cpf = "";
						}
					}
					while (cor.equals("")) {

						System.out.println("Cor: ");
						cor = input.readLine().trim();
						if (cor.equals("") || cor.equals(null)) {
							System.out.println("Campo obrigatório. ");
						}
						if (!(cor.matches("[a-zA-Z]*$"))) {
							System.out.println("Digite apenas letas na cor. ");
							cor = "";
						}
					}
					while (rua.equals("")) {
						System.out.println("Rua: ");
						rua = input.readLine().trim();
						if (rua.equals("") || rua.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}
					}
					while (numero.equals("")) {
						System.out.println("Numero: ");
						numero = input.readLine().trim();
						if (numero.equals("") || numero.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}
						if (!(numero.matches("[0-9]*$"))) {
							System.out.println("Digite apenas numeros. ");
							numero = "";
						}
					}
					while (cep.equals("")) {
						System.out.println("Cep: ");
						cep = input.readLine().trim();
						if (cep.equals("") || cep.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}
						if (!(cep.matches("[0-9]*$"))) {
							System.out
									.println("Digite apenas Números no cep. ");
							cep = "";
						}
					}
					while (bairro.equals("")) {
						System.out.println("Bairro: ");
						bairro = input.readLine().trim();
						if (bairro.equals("") || bairro.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}

					}
					while (cidade.equals("")) {
						System.out.println("Cidade: ");
						cidade = input.readLine().trim();
						if (cidade.equals("") || cidade.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}
						if (!(cidade.matches("[a-zA-Z]*$"))) {
							System.out
									.println("Digite apenas letras no nome da cidade. ");
							cidade = "";
						}
					}
					while (estado.equals("")) {
						System.out.println("Estado: ");
						estado = input.readLine().trim();
						if (estado.equals("") || estado.equals(null)) {
							System.out.println("Campo Obrigatório. ");
						}
						if (!(estado.matches("[a-zA-Z]*$"))) {
							System.out
									.println("Digite apenas letras no nome estado. ");
							estado = "";
						}
					}

					System.out.println("Complemento: ");
					complemento = input.readLine().trim();

					while (observacaoSaude.equals("")) {

						System.out.println("Observação de Saude: ");
						observacaoSaude = input.readLine().trim();
						if (observacaoSaude.equals("")
								|| observacaoSaude.equals(null)) {
							System.out.println("Campo obrigatório. ");
						}
					}

					while (telefone.equals("")) {
						System.out.println("Telefone: ");
						telefone = input.readLine().trim();
						if (!(telefone.matches("[0-9]*$"))) {
							System.out
									.println("Telefone so pode ter numeros. ");
							telefone = "";
						} else {
							break;
						}
					}
					while (dataAdmissao.equals("")) {

						System.out.println("Data de Adimição: ");
						dataAdmissao = input.readLine().trim();
						if (dataAdmissao.equals("")) {
							System.out.println("Campo obrigatório. ");
						}
					}
					while (dataNascimento.equals("")) {

						System.out.println("Data de Nascimento: ");
						dataNascimento = input.readLine().trim();
						if (dataNascimento.equals("")) {
							System.out.println("Campo obrigatório. ");
						}
					}
					while (tipoParto.equals("")) {
						System.out.println("O parto foi normal ou cesariana? ");
						tipoParto = input.readLine().trim().toLowerCase();
						if (!(tipoParto.equals("normal") || tipoParto
								.equals("cesariana"))) {
							System.out
									.println("Tipo de parto desconhecido, por favor informe novamente. ");
							tipoParto = "";
						}
					}

					endereco = new Endereco(rua, numero, cep, bairro, cidade,
							estado, complemento);

					puerpera = new Puerpera(nome, cpf, cor, dataNascimento,
							endereco, telefone, dataAdmissao, observacaoSaude,
							tipoParto);
					maternidade.addPuerpera(puerpera);
					break;
				}
				while (dataConsulta.equals("")) {

					System.out.println("Qual a data da consulta? ");
					dataConsulta = input.readLine().trim().toLowerCase();

				}
				while (consulta.equals("")) {

					System.out.println("Qual sera a consulta ou exame? ");
					consulta = input.readLine();

				}

				consulta1 = new Consulta(puerpera, dataConsulta, consulta,
						tipoConsulta);
				break;

			case 3:
				System.out.println(maternidade.consultasAgendadas());
				break;

			case 4:

				System.out.println(maternidade.balancoGeral());
				break;

			case 5:

				System.out.println("Fim.");
				System.exit(1);

			}
		}
	}
}
