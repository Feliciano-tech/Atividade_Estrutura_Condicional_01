package Atividade_Ac02;
import java.util.Scanner;

public class Ac02_Atividade_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String rsp;
		
		System.out.print("Responda com Sim ou N�o de Acordo com Sua Condi��o.");
		
		System.out.printf("\nVoc� Tem mais de 60 anos ? ");
		rsp = ler.next();
		
		if (rsp.contains("nao") )
		{
			System.out.printf("\nVoc� Possui Alguma Defici�ncia ? ");
			rsp = ler.next();

		}
		if (rsp.contains("nao") )
		{
			System.out.printf("\n Voc� Est� Gravida ?" );
			rsp = ler.next();

		}
		if (rsp.contains("nao") )
		{
			System.out.printf(" \nVoc� N�o tem Direito a Vaga Especial." );
			rsp = ler.next();

		}

	
		else 
		{
			System.out.print(" Voc� tem Direito a Vaga Especial");

		}

		
	

	}

}
