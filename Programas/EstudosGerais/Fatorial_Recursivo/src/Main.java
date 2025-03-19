import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		
		int n = sc.nextInt();
		
		resultado = fat_rcv(n);
		
		System.out.println("O valor do fatorial de " + n + " eh: " + resultado);

	}
	
	public static int fat_rcv(int n) {
		int aux = 1;
		
		if (n==1) {
			return aux;
		}
		else{
			System.out.println("n: " + n);
			aux = n * fat_rcv(n-1);
			
			System.out.println("aux: " + aux);
		}
		
		return aux;
	}

}
