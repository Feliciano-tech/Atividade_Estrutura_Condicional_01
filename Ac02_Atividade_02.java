package Atividade_Ac02;
import java.util.Scanner;

public class Ac02_Atividade_02
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String rsp;
		
		System.out.print("Responda com Sim ou N�o Para Saber se Foi Aprovado.");
		
		System.out.printf("\nVoc� Foi Aprovado No Exame Psicot�cnico ? ");
		rsp = ler.next();
		
		if (rsp.contains("sim") )
		{
			System.out.printf("\nVoc� Foi Aprovado No Exame de Legisla��o ? ");
			rsp = ler.next();

		}
		if (rsp.contains("sim") )
		{
			System.out.printf("\n Voc� Foi Aprovado no Exame de Dire��o ? " );
			rsp = ler.next();

		}
		if (rsp.contains("sim") )
		{
			System.out.printf("\nParab�ns Voc� Foi Aprovado!" );
			rsp = ler.next();

		}
		else
		{
			System.out.printf("\nVoc� N�o Foi Aprovado." );
			rsp = ler.next();

		}


		
	

	}

}
