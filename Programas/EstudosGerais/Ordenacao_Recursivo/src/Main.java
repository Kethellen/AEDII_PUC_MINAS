import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int r[] = new int[n];
		int vet[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		r = ordena(vet, n);
		System.out.println("O vetor ordenado eh: " + r);

	}
	
	public static int [] ordena(int vet[], int n) {
		return ordena(vet, n, 0);
	}
	
	public static int [] ordena(int vet[], int n, int i) {
		int resp[] = new int[i];
		
		if(i == n - 1) {
			resp[i] = vet[n - 1];
		}
		else {
			resp = ordena(vet, n, i + 1);
			if(resp[i] < vet[i]) {
				resp[i] = vet[i];
			}
		}
		
		return resp;
	}

}