import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner ssf = new Scanner(System.in);
			
			String nome1, nome2;
			int idade1, idade2;
			double media;
			
			System.out.println("Dados da primeira pessoa: ");
			System.out.print("Nome: ");
			nome1 = ssf.nextLine();
			System.out.print("Idade: ");
			idade1 = ssf.nextInt();
			
			System.out.println("Dados da segunda pessoa: ");
			System.out.print("Nome: ");
			ssf.nextLine();
			nome2 = ssf.nextLine();
			System.out.println("Idade: ");
			idade2 = ssf.nextInt();
			
			media = (double)(idade1 + idade2) / 2.0;
			System.out.println("A idade media de " + nome1 +" e " + nome2 + " eh de " + String.format("%.1f", media) + " anos");
			
			
	ssf.close();	
	}

}
