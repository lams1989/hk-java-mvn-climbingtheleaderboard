package com.lams.hibernate;

import junit.framework.TestCase;

public class ClimbingtheLeaderboardTest extends TestCase {

	public void testLlenarResultados() {
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };

		int juego = 5;
		int[] resultado = ClimbingtheLeaderboard.llenarResultados(scores, juego);

		assertEquals(100, resultado[0]);
		assertEquals(100, resultado[1]);
		assertEquals(50, resultado[2]);
		assertEquals(40, resultado[3]);
		assertEquals(40, resultado[4]);
		assertEquals(20, resultado[5]);
		assertEquals(10, resultado[6]);
		assertEquals(5, resultado[7]);

	}

	public void testLlenarResultados2() {
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };

		int juego = 60;
		int[] resultado = ClimbingtheLeaderboard.llenarResultados(scores, juego);
		
		assertEquals(100, resultado[0]);
		assertEquals(100, resultado[1]);
		assertEquals(60, resultado[2]);
		assertEquals(50, resultado[3]);
		assertEquals(40, resultado[4]);
		assertEquals(40, resultado[5]);
		assertEquals(20, resultado[6]);
		assertEquals(10, resultado[7]);

	}
	public void testBuscarPosicion() {
		int[] arcresult = { 100, 100, 50, 40, 40, 20, 10 };
		int juego = 20;
		int prueba = ClimbingtheLeaderboard.buscarPosicion(arcresult, juego);
		assertEquals(4, prueba);
	}
	
	public void testBuscarPosicion2() {
		int[] arcresult = { 100, 50, 40, 20, 10, 5};
		int juego = 5;
		int prueba = ClimbingtheLeaderboard.buscarPosicion(arcresult, juego);
		assertEquals(6, prueba);
	}
	public void testBuscarPosicion3() {
		int[] arcresult = { 100, 50, 40, 20, 10, 5};
		int juego = 100;
		int prueba = ClimbingtheLeaderboard.buscarPosicion(arcresult, juego);
		assertEquals(1, prueba);
	}
}
