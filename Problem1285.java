import java.util.Scanner;

public class Problem1285 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] d = new int[n];
			
			for(int i = 0;i<n;i++) {
				d[i] = Math.abs(sc.nextInt());
			}
			int cnt = 0;
			int min_d = d[0];
			for(int i = 0;i<n;i++) {
				if(d[i] < min_d){
					min_d = d[i];
					cnt = 1;
				}else if(d[i] == min_d) {
					cnt++;
				}
			}
			System.out.println("#"+test_case + " " + min_d +" "+ cnt);
			
		}
	}

}
