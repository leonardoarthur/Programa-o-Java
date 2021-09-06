package Aula3;
import java.util.Scanner;
public class Atividade6 {
	public static void main(String[] args) {
		
		String nome = " ", qualidade = " ";
		
		System.out.println("Qual seu nome?");
		Scanner s = new Scanner(System.in);
		nome = s.next();
		System.out.println("Qual a sua principal qualidade?");
		qualidade = s.next();
		
		System.out.println("Seja bem vindo " + nome + ", sua qualidade principal é " + qualidade);
	}
	
}
