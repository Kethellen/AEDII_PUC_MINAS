
public class Main {

	public static void main(String[] args) {
		int i = 10, b = 10, count = 0;
		
		while(i > 0) {
			b--;
			i = i >> 1;
			count++;
			System.out.println("b: " + b + "\ni: " + i);
		}
		
		while(i < 15) {
			b--;
			i+=2;
			count++;
			System.out.println("b: " + b + "\ni: " + i);
		}
		
		System.out.println("cout: " + count);
	}

}
