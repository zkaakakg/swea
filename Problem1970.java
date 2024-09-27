import java.util.Scanner;

public class Problem1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] money = {50000,10000,5000,1000,500,100,50,10}; 
			int[] result = new int[8];
			for(int i = 0; i< 8; i++) {
				result[i] = n/money[i];
				n %= money[i];
			}
			System.out.println("#"+ test_case);
			for(int i = 0; i< 8; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}

}
