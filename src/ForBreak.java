//package com.hush.ravim;

public class ForBreak {
	public static void main(String[] args) {
		// TODO pessoa x faz código 10912
		
		int x = 1;
		
		int y = 1000;
		
		int numeroAVerificar = 171;
		
		for(int i = x; i < y; i++) {
			if(i % numeroAVerificar == 0) {
				System.out.println("Primeiro numero de 0 à 1000 que é divisivel por " + numeroAVerificar + ": " + i );
				break;
			}
		}
	}
}
