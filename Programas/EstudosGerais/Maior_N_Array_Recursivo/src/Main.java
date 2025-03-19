import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5, r;
		int vet[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		r = maior(vet, n);
		System.out.println("O maior numero do vetor eh: " + r);

	}
	
	public static int maior(int vet[], int n) {
		return maior(vet, n, 0);
	}
	
	public static int maior(int vet[], int n, int i) {
		int resp;
		
		if(i == n - 1) {
			resp = vet[n - 1];
		}
		else {
			resp = maior(vet, n, i + 1);
			if(resp < vet[i]) {
				resp = vet[i];
			}
		}
		
		return resp;
	}

}
