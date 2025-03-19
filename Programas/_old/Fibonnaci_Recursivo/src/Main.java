import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		resultado = fib_rcv(n);
		System.out.println("O resultado do fibonnaci de " + n + " eh: " + resultado);

	}
	
	public static int fib_rcv(int n) {
		int aux = 1;
		
		if( n == 1 || n == 2) {
			return aux;
		}
		else {
			aux = fib_rcv(n - 1) + fib_rcv(n -2);
		}
		
		return aux;
	}

}
