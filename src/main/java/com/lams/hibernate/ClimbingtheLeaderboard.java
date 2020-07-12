package com.lams.hibernate;

public class ClimbingtheLeaderboard {

	public static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] resultados = new int[alice.length];

		for (int i = 0; i < alice.length; i++) {
			int[] arcresult = new int[scores.length + 1];
			arcresult = llenarResultados(scores, alice[i]);
			int resultado = buscarPosicion(arcresult, alice[i]);
			scores = arcresult;
			resultados[i] = resultado;
		}

		return resultados;
	}

	public static int buscarPosicion(int[] arcresult, int juego) {

		int posicion = 1;
		for (int i = 0; i < arcresult.length; i++) {
			if (juego == arcresult[i]) {
				return posicion;
			} else if (arcresult[i] != arcresult[i + 1]) {
				posicion++;
			}

		}
		return posicion;
	}

	public static int[] llenarResultados(int[] scores, int juego) {
		int[] arcresult = new int[scores.length + 1];
		for (int i = 0; i < scores.length; i++) {
			arcresult[i] = scores[i];
		}
		arcresult[arcresult.length - 1] = juego;
		arcresult = ordenar(arcresult);
		return arcresult;
	}

	private static int[] ordenar(int[] A) {
		int i, j, aux;
		for (i = 0; i < A.length - 1; i++) {
			for (j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] > A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
			}
		}
		return A;
	}

}
