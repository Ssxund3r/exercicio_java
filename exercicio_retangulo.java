import java.util.Locale;
import java.util.Scanner;

public class exercicio_retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		base = src.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = src.nextDouble();

		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2.0)+ Math.pow(altura,  2.0));
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));		
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		src.close();
	}

}
