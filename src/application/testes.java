package application;

import br.edu.unifacisa.si.p2.input.*;

public class testes {

	public static void main(String[] args) {

		int n = Input.leInt("Digite o número das dimensões da matriz quadrada: ");
		int[][] matriz = new int[n][n];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Input.leInt("Valor da linha " + (1 + i) + " na coluna " + (1 + j) + ": ");
			}
		}
		System.out.println("Dados da matriz:");
		System.out.print("Diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Matriz:");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
