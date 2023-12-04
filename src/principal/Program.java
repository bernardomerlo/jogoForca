package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palavras palavras = new Palavras();
		palavras.colocarPalavras();
		char querJogar = 's';
		while (querJogar == 's') {
			String[] dicas = palavras.getPalavrasParaForca().keySet().toArray(String[]::new);
			Random random = new Random();
			String dicaAleatoria = dicas[random.nextInt(dicas.length)];

			String[] palavra = palavras.getPalavrasParaForca().get(dicaAleatoria).split("");
			String[] palavraChute = new String[palavra.length];
			System.out.println("Dica: " + dicaAleatoria);
			boolean ganhou = false;
			int cont = 0;

			while (!ganhou) {
				if (cont != 7) {
					ganhou = true;
					for (int i = 0; i < palavraChute.length; i++) {
						if (palavraChute[i] == null) {
							System.out.print("_ ");
							ganhou = false;
						} else {
							System.out.print(palavraChute[i] + " ");
						}
					}
					System.out.println();
					boolean passou = false;
					if (!ganhou) {
						System.out.print("Digite uma letra: ");
						String letra = sc.next();
						for (int i = 0; i < palavraChute.length; i++) {
							if (letra.equals(palavra[i])) {
								palavraChute[i] = palavra[i];
								passou = true;
							}
						}
						if (!passou) {
							printForca(cont);
							cont++;
						}
					} else {
						System.out.println("Parabéns! Você acertou todas as letras.");
					}
					System.out.println();
				} else {
					System.out.println("A palavra era " + palavras.getPalavrasParaForca().get(dicaAleatoria));
					break;
				}
			}
			System.out.println("Deseja continuar? ");
			querJogar = sc.next().charAt(0);
		}
		sc.close();
	}

	private static void printForca(int cont) {
		switch (cont) {
		case 0: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 1: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 2: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("   |   |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 3: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("   |\\  |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 4: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("  /|\\  |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 5: {

			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("  /|\\  |");
			System.out.println("    \\  |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		case 6: {
			System.out.println("   +---+");
			System.out.println("   |   |");
			System.out.println("   O   |");
			System.out.println("  /|\\  |");
			System.out.println("  / \\  |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println(" =========|");
			break;
		}
		}
	}

}
