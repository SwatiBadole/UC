package com.bridgelab.workshop;

import java.util.Random;

public class Gambler {
	public static void gamblecheck() {
		int gamble;
		Random random=new Random();
		gamble=(int) random.nextInt(2);
		
		if(gamble==1) {
			System.out.println("Gambler won");
		}
		else {
			System.out.println("Gambler lost");
		}
		
	}
	public static void main(String[] args) {
		final int gamblersstartstake=100;
		final int gamblebet=1;
		gamblecheck();
	}

}
