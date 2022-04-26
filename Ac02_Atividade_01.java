package Atividade_Ac02;
import java.util.Scanner;

public class Ac02_Atividade_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String rsp;
		
		System.out.print("Responda com Sim ou Não de Acordo com Sua Condição.");
		
		System.out.printf("\nVocê Tem mais de 60 anos ? ");
		rsp = ler.next();
		
		if (rsp.contains("nao") )
		{
			System.out.printf("\nVocê Possui Alguma Deficiência ? ");
			rsp = ler.next();

		}
		if (rsp.contains("nao") )
		{
			System.out.printf("\n Você Está Gravida ?" );
			rsp = ler.next();

		}
		if (rsp.contains("nao") )
		{
			System.out.printf(" \nVocê Não tem Direito a Vaga Especial." );
			rsp = ler.next();

		}

	
		else 
		{
			System.out.print(" Você tem Direito a Vaga Especial");

		}

		
	

	}

}
