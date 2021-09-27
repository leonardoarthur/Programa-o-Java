package Aula4;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		double idade = 0;
		System.out.println("Qual a sua idade?");
		Scanner s = new Scanner(System.in);
		idade = s.nextDouble();
		if(idade >= 18) {
			System.out.println("Você é maior de idade, vai pagar seus boletos!");
		} else {
			System.out.println("Você é menor de idade, vá estudar");
		}
		
	}
}
