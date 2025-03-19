import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Inicializacao do objeto na memoria
		
		System.out.println("Digite um numero intero: ");
		int x = sc.nextInt();
		
		System.out.println("Digite um numero real: ");
		double y = sc.nextDouble();
		
		System.out.println("Digite um nome: ");
		String z = sc.next();
		
		System.out.println("x: " + x + ", y: " + y + ", z: " + z);
	}
}
