import java.util.Scanner;
import java.util.Locale;

public class do_while {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double media;
		char continuar;
		double notas = 0;
		double total = 0;
		int i = 1;

		do {
			System.out.println("Digite a quantidade de notas: ");
			n = sc.nextInt();
			total = 0;
			for (i = 1; i <= n; i++) {
				System.out.printf("Nota %d: ", i);
				notas = sc.nextDouble();
				total = total + notas;
			}
			media = total / (i - 1);
			System.out.printf("Média= %.1f%n", media);
			System.out.println("Fazer outra média?(y/n)");
			continuar = sc.next().charAt(0);
		} while (continuar != 'n');

		sc.close();
	}
}