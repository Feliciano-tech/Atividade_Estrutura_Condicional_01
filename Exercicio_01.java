package Exercicio_Condicional;

import java.util.Scanner;

// Importacao da classe scanner para receber informações do usuario pelo console.//

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // CRIAÇÃO DE OBJETO DE LEITURA DO TIPO SCANNER.

		String rsp; // DECLARACAO DE VARIAVEL DO TIPO STRING.
		System.out.printf(
				"Responda as perguntas com (s) para sim ou (n) para nao de acordo com sua condicao.\nVoce tem mais de 60 anos ? ");
		// UTILIZAÇÃO DA FUNÇÃO "System.out.printf" PARA IMPRIMIR UMA STRING FORMATADA
		// PARA O USUARIO.

		rsp = ler.nextLine();

		if (rsp.equals("s") || rsp.equals("S")) /*
												 * UTILIZACAO DE ESTRUTURA CONDICIONAL 'IF' E DECLARACAO DE CONDICAO
												 * ONDE SE 'RSP' RECEBER- O VALOR 'S' OU 's' RETORNARA VERDADEIRO E
												 * EXECUTARA O COMANDO DENTRO DE SUA CHAVE.
												 */

		{
			System.out.printf("\nVoce tem direito a vaga preferencial.");
		}

		else /*
				 * ESTRUTURA CONDICIONAL 'ELSE' EXECUTARA CASO 'IF' RETORNE UM VALOR FALSO
				 * 
				 */
		{
			System.out.printf("\nVoce possui algum tipo de deficiencia ? ");
			rsp = ler.nextLine();

			if (rsp.equals("s") || rsp.equals("S")) {
				System.out.printf("\nVoce tem direito a vaga preferencial.");
			} else {
				System.out.printf("\nVoce esta gravida no momento ? ");
				rsp = ler.nextLine();

				if (rsp.equals("s") || rsp.equals("S")) {
					System.out.printf("\nVoce tem direito a vaga preferencial.");
				}

				else {
					System.out.printf("\nVoce nao tem direito a vaga preferencial.");
				}

				ler.close();
				// UTILIZAMOS O MÉTODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

			}

		}

	}
}
