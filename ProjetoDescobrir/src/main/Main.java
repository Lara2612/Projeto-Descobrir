package main;
import java.util.Scanner;

import descobrir.*;

public class Main {
	public static void main(String[] args) {
		
		Descobrir d = new Descobrir();
		Scanner sc = new Scanner(System.in);
		int numero;
		String msg;
		
		do {
			System.out.print("Qual seu chute? ");
			numero = sc.nextInt();
			msg = d.chutar(numero);
			
			System.out.println(msg);
		} while(!msg.equals("ACERTOU"));
		System.out.println("Número de tentativas: " + d.getNumeroDeTentativas());
	}
}
