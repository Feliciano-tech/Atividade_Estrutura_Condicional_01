package Array_Vetores;

public class Atividade_Vetores {

	public static void main(String[] args) {
		
		int soma=0;
		int q[]= {35,4,22,20,36,30};
		int n=q.length;
		for (int c=0; c<n;c++) {
			soma=soma+q[c];

		}
		System.out.printf("A média de pessoas por sala é (%d). \nAs sala: 1º c/35 5º "
				+ "c/36 6ºc/30 estão acima da média.",(soma/n));
		
		
			
		


	}

}
