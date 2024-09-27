import java.util.Scanner;

public class Problem1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int costA;
			int costB=0;
			costA = p * w;
			if(w<=r) {
				costB = q;
			}else  {
				costB = q+(w-r)*s;
			}
			if(costA < costB) System.out.println("#" + test_case + " " + costA);
			else System.out.println("#" + test_case + " " + costB);
		}
	}

}
