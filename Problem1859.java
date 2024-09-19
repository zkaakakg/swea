import java.util.Scanner;

public class Problem1859 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i <= T;i++) {
			int N = sc.nextInt();
			int[] price = new int[N];
			long result = 0;
			long max = 0;
			for(int j = 0; j<N;j++) {
				price[j] = sc.nextInt();
			}
			for(int j = N-1; j>= 0; j--) {
				if(price[j] > max) {
					max = price[j];
				}else {
					result+=max - price[j];
				}
				
			}
	
			System.out.printf("#%d %d\n",i, result);

		}
	}
}
		