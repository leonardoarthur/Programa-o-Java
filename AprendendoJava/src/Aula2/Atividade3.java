package Aula2;
import java.util.Scanner;
public class Atividade3 {
	public static void main(String[] args) {
		double salario = 0, sfinal = 0;
		
		//entrada de dados
		System.out.println("Digite seu s�lario:");
		java.util.Scanner s = new Scanner(System.in);
		salario = s.nextDouble();
		
		//aumento de s�lario
		sfinal = salario * 1.15;
		
		System.out.println("Seu novo s�lario � " + sfinal);
	}
}
