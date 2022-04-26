package Atividade_Ac02;
import java.util.Scanner;

public class Ac02_Atividade_02
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String rsp;
		
		System.out.print("Responda com Sim ou Não Para Saber se Foi Aprovado.");
		
		System.out.printf("\nVocê Foi Aprovado No Exame Psicotécnico ? ");
		rsp = ler.next();
		
		if (rsp.contains("sim") )
		{
			System.out.printf("\nVocê Foi Aprovado No Exame de Legislação ? ");
			rsp = ler.next();

		}
		if (rsp.contains("sim") )
		{
			System.out.printf("\n Você Foi Aprovado no Exame de Direção ? " );
			rsp = ler.next();

		}
		if (rsp.contains("sim") )
		{
			System.out.printf("\nParabéns Você Foi Aprovado!" );
			rsp = ler.next();

		}
		else
		{
			System.out.printf("\nVocê Não Foi Aprovado." );
			rsp = ler.next();

		}


		
	

	}

}
