package Aula4;
import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {
		double numero = 0, par = 0;
		System.out.println("Diga um n�mero: ");
		Scanner s = new Scanner(System.in);
		numero = s.nextDouble();
		
		par = numero % 2;
		
		if(par % 2 <= 0) {
			System.out.println("O n�mero � par");
			
		}else {
			System.out.println("O n�mero � �mpar");
		}
	}
}
