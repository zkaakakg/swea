import java.util.Scanner;

public class Problem1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int n = sc.nextInt();
			int result = 0;
			for(int i = 1;i<=n;i++) {
				if(i%2 == 0)
					result -= i;
				else 
					result += i;
			}
			System.out.println("#"+test_case+" " + result);
		
			
			
		}
	}

}
