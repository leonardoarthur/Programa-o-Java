package Aula4;
import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		
		double sorvete = 0, bolas = 0;
		
		System.out.println("Qual sorvete você quer?");
		System.out.println("1 - chocolate     2 - Morango");
		
		Scanner s = new Scanner(System.in);
		
		sorvete = s.nextDouble();
		System.out.println("Com quantas bolas?");
		bolas = s.nextDouble();
		
		if(sorvete == 1 && bolas >= 3) {
			System.out.println("Voce tem um desconto de 10%");
		}if(sorvete == 1 && bolas == 2) {
			System.out.println("Você tem um desconto de 5%");
		}else {
			System.out.println("Obrigado por comprar sorvete com a gente!");
		}
	}
}
