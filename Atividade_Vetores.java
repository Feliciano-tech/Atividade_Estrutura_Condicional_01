package Array_Vetores;

public class Atividade_Vetores {

	public static void main(String[] args) {
		
		int soma=0;
		int q[]= {35,4,22,20,36,30};
		int n=q.length;
		for (int c=0; c<n;c++) {
			soma=soma+q[c];

		}
		System.out.printf("A m�dia de pessoas por sala � (%d). \nAs sala: 1� c/35 5� "
				+ "c/36 6�c/30 est�o acima da m�dia.",(soma/n));
		
		
			
		


	}

}
