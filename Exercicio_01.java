package Exercicio_Condicional;

import java.util.Scanner;

// Importacao da classe scanner para receber informa��es do usuario pelo console.//


public class Exercicio_01 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		// CRIA��O DO OBJETO DE LEITURA DO TIPO SCANNER.//
		
				
		System.out.printf("Responda as perguntas com (s) para sim ou (n) para n�o de acordo com sua condi��o. ");
		
		// UTILIZA��O DA FUN��O "System.out.printf" PARA IMPRIMIR UMA STRING FORMATADA PARA O USUARIO.//
		
		
		System.out.printf("\nVoc� tem mais de 60 anos ? ");
		String rsp = ler.nextLine();
		// CRIA��O DA VARIAVEL "RSP" DO TIPO STRING QUE EST� RECEBENDO "LER" COM O M�TODO "nextLine" PARA O ESCANEAMENTO DO TECLADO. // 
		
		if (rsp.equals("n")|| rsp.equals("N")) 
	    //UTILIZA��O DA ESTRUTURA CONDICIONAL "IF" E ATRIBUINDO-LHE UMA CONDI��O EM QUE SE O VALOR DIGITADO PELO USUARIO FOR IGUAL A (n) OU (N) NO CASO VERDADEIRO DEVE EXECUTAR O QUE ESTIVER DENTRO DA CHAVE  // 
	    {
			
		System.out.printf("\nVoc� Possui algum tipo de defici�ncia ? ");
		rsp = ler.nextLine();
		
		}
		
		if (rsp.equals("n")|| rsp.equals("N"))
		{
			System.out.printf("\nvoc� est� gravida no momento ? ");
			rsp = ler.nextLine();

		}
		
		if (rsp.equals("n")|| rsp.equals("N")) 
		
		{
			System.out.printf("\nvoc� n�o tem direito a vaga preferencial. ");

			
		}
		
		// AQUI FORAM UTILIZADOS 3 "IF" PARA QUE SEMPRE QUE O VALOR DIGITADO PELO USUARIO FOR (n) OU (N) (VERDADEIRO) O USUARIO SERA CONDUZIDO AO PROXIMO (IF). //
	    
		else 
		//	O ELSE FOI UTILIZADO AQUI PARA QUE CASO O VALOR DIGITADO PELO USUARIO SEJA FALSO ENT�O O QUE ESTIVER DENTRO DA CHAVE DA CONDICIONAL "ELSE" SERA EXECUTADA //
	    //(QUALQUER COISA DIGITADA ALEM DO QUE FOI ESTABELECIDO NOS IF SERA CONSIDERADO FALSO).// 
		{
			System.out.printf("\nVoc� tem direito a vaga preferencial. ");

		}
		
		ler.close();
		//UTILIZAMOS O M�TODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.// 
	}
}
		
		
	
		