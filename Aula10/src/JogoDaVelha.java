import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		String OláMundo = "";
		Scanner teclado = new Scanner(System.in);
		String[][] tabuleiro = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		String adv = "";
		System.out.println("JOGO DA VELHA");
		System.out.println("Digite X ou O pra jogar: ");
		String esc = teclado.nextLine();
		switch (esc) {
		case "X":
			System.out.println("Você escolheu X ");
			adv = "O";
			break;
		case "O":
			System.out.println("Você escolheu O ");
			adv = "X";
			break;
		}
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.println(Arrays.toString(tabuleiro[i]));
		}
		for (int pos = 0; pos < tabuleiro.length; pos++) {
			System.out.println("Digite a posição do " + esc);
			int p = Integer.parseInt(teclado.nextLine());
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					int n = Integer.parseInt(tabuleiro[i][j]);
					if (n == p) {
						if (tabuleiro[i][j] != esc) {
							tabuleiro[i][j] = esc;
						} else {
							System.out.println("Esse lugar já foi ocupado ");
						}
					}
				}
			}
			for (int i = 0; i < tabuleiro.length; i++) {
				System.out.println(Arrays.toString(tabuleiro[i]));
			}
		}

		teclado.close();
	}
}