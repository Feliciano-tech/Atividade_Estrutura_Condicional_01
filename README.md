# Atividades_Algoritmo_2022





package Atividade_Algoritmos_Ac02;
import java.util.Scanner;

public class Ac02_Atividade_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ac01, ac02, ag, af, valor;
		System.out.printf("Digite a nota tirada pelo aluno na avaliação Ac1: ");
		ac01 = ler.nextDouble();
		
		System.out.printf("\nDigite a nota tirada pelo aluno na avaliação Ac2: ");
		ac02 = ler.nextDouble();
		
		System.out.printf("\nDigite a nota tirada pelo aluno na avaliação AG: ");
		ag = ler.nextDouble();
		
		System.out.printf("\nDigite a nota tirada pelo aluno na avaliação AF: ");
		af = ler.nextDouble();
		
		double ac01m=ac01*0.5;
		double ac02m=ac02*0.3;
		double agm=ag*0.1;
		double afm=af*0.45;
		
		valor = ac01m+ac02m+agm+afm;
		
		
		System.out.print(valor );
