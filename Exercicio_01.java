package Exercicio_Condicional;

import java.util.Scanner;

// Importacao da classe scanner para receber informações do usuario pelo console.//


public class Exercicio_01 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		// CRIAÇÃO DO OBJETO DE LEITURA DO TIPO SCANNER.//
		
				
		System.out.printf("Responda as perguntas com (s) para sim ou (n) para não de acordo com sua condição. ");
		
		// UTILIZAÇÃO DA FUNÇÃO "System.out.printf" PARA IMPRIMIR UMA STRING FORMATADA PARA O USUARIO.//
		
		
		System.out.printf("\nVocê tem mais de 60 anos ? ");
		String rsp = ler.nextLine();
		// CRIAÇÃO DA VARIAVEL "RSP" DO TIPO STRING QUE ESTÁ RECEBENDO "LER" COM O MÉTODO "nextLine" PARA O ESCANEAMENTO DO TECLADO. // 
		
		if (rsp.equals("n")|| rsp.equals("N")) 
	    //UTILIZAÇÃO DA ESTRUTURA CONDICIONAL "IF" E ATRIBUINDO-LHE UMA CONDIÇÃO EM QUE SE O VALOR DIGITADO PELO USUARIO FOR IGUAL A (n) OU (N) NO CASO VERDADEIRO DEVE EXECUTAR O QUE ESTIVER DENTRO DA CHAVE  // 
	    {
			
		System.out.printf("\nVocê Possui algum tipo de deficiência ? ");
		rsp = ler.nextLine();
		
		}
		
		if (rsp.equals("n")|| rsp.equals("N"))
		{
			System.out.printf("\nvocê está gravida no momento ? ");
			rsp = ler.nextLine();

		}
		
		if (rsp.equals("n")|| rsp.equals("N")) 
		
		{
			System.out.printf("\nvocê não tem direito a vaga preferencial. ");

			
		}
		
		// AQUI FORAM UTILIZADOS 3 "IF" PARA QUE SEMPRE QUE O VALOR DIGITADO PELO USUARIO FOR (n) OU (N) (VERDADEIRO) O USUARIO SERA CONDUZIDO AO PROXIMO (IF). //
	    
		else 
		//	O ELSE FOI UTILIZADO AQUI PARA QUE CASO O VALOR DIGITADO PELO USUARIO SEJA FALSO ENTÃO O QUE ESTIVER DENTRO DA CHAVE DA CONDICIONAL "ELSE" SERA EXECUTADA //
	    //(QUALQUER COISA DIGITADA ALEM DO QUE FOI ESTABELECIDO NOS IF SERA CONSIDERADO FALSO).// 
		{
			System.out.printf("\nVocê tem direito a vaga preferencial. ");

		}
		
		ler.close();
		//UTILIZAMOS O MÉTODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.// 
	}
}
		
		
	
		