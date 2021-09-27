package Aula5;
import java.util.Scanner;
public class Exemplo2 {
		public static void main(String[] args) {
		    int num = 0;
		     System.out.println( "Para sair, entre com um valor < 0");
		     System.out.println( "Digite um número:");           
		     Scanner s = new Scanner(System.in);
		    num = s.nextInt();
		     while (num >=0)  {
		        if (num % 2 == 0)
		              System.out.println("O número " + num + " é par");
		        else
		              System.out.println("O número " + num + " é impar");
		        System.out.println( "Digite o próximo número:");       
		        num = s.nextInt();
		    }
		    System.out.println("Tchau…");
		}   
	}
