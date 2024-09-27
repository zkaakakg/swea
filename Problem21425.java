import java.util.Scanner;

public class Problem21425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case =1;test_case<=T;test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int cnt = 0;
			while(a <= n && b <= n) {
				if(a<b) a+=b;
				else b+=a;
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
