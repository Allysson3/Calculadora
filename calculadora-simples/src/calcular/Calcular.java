package calcular;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {

		double n1, n2;
		int opcao;
		double soma, subtracao, multiplicacao, divisao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro valor");
		n1 = entrada.nextDouble();
		System.out.println("Insira o segundo valor");
		n2 = entrada.nextDouble();

		System.out.println(">Selecione uma operação<");

		System.out.println("[1] - Somar");
		System.out.println("[2] - Subtrair");
		System.out.println("[3] - Multiplicar");
		System.out.println("[4] - Dividir");
		System.out.println("Digite sua opção:");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			soma = n1 + n2;
			System.out.println("A soma é: " + soma);
			break;
		case 2:
			subtracao = n1 - n2;
			System.out.println("A subtrçaõ é: " + subtracao);
			break;
		case 3:
			multiplicacao = n1 * n2;
			System.out.println("A multiplição é: " + multiplicacao);
			break;
		case 4:
			divisao = n1 / n2;
			System.out.println("A divisão é: " + divisao);
			break;
			default:
				System.out.println("Escolha uma opção válida");

		}
	}
}
