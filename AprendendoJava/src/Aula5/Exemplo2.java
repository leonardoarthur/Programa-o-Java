package Aula5;
import java.util.Scanner;
public class Exemplo2 {
		public static void main(String[] args) {
		    int num = 0;
		     System.out.println( "Para sair, entre com um valor < 0");
		     System.out.println( "Digite um n�mero:");           
		     Scanner s = new Scanner(System.in);
		    num = s.nextInt();
		     while (num >=0)  {
		        if (num % 2 == 0)
		              System.out.println("O n�mero " + num + " � par");
		        else
		              System.out.println("O n�mero " + num + " � impar");
		        System.out.println( "Digite o pr�ximo n�mero:");       
		        num = s.nextInt();
		    }
		    System.out.println("Tchau�");
		}   
	}
