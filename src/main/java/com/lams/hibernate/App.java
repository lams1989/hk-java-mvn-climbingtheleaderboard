package com.lams.hibernate;

public class App {
	public static void main(String[] args) {
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice = { 5, 25, 50, 120 };
		int[] result = new int[alice.length];
		result = ClimbingtheLeaderboard.climbingLeaderboard(scores, alice);
		for (int i = 0; i < alice.length; i++) {
			System.out.println(result[i]);
		}

	}

}
