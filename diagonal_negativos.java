import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner srs = new Scanner(System.in);
		
		int N, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		N = srs.nextInt();
		
		int[][] mat = new int [N][N];
		 
		for(int i= 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = srs.nextInt();
			}
		}
			System.out.println("DIAGONAL PRINCIPAL: ");
			for (int i =0; i < N; i++) {
				System.out.print(mat[i][i] + " ");
			}
			System.out.println();
			
			cont = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mat [i][j] < 0) {
						cont = cont++;
					}
				}
			}
			
			System.out.println("Quantidade de Negativos =  " + cont);
			
		srs.close();	
	}

}
