import java.util.Scanner;

public class Problem1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			 int n = sc.nextInt();
			 char[] c = new char[n];
			 int[] k = new int[n];
			 for(int i = 0; i< n; i++) {
				 c[i] = sc.next().charAt(0);
				 k[i] = sc.nextInt();
				 }
			 System.out.println("#" + test_case);
			 int cnt = 0;
			 for(int i =0;i<n;i++) {
				 for(int j = 0; j<k[i];j++) {
					 System.out.print(c[i]);
					 cnt++;
					 if(cnt == 10) {
						 System.out.println();
						 cnt = 0;
						 }
					 }
				 }
			 }
		}
}
