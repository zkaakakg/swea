import java.util.Arrays;
import java.util.Scanner;

public class Problem1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case<=T;test_case ++) {
			int[] arr = new int[10];
			int[] sortArr = new int[10];
			int sum = 0;
			int avg = 0;
			for(int i = 0; i < 10; i++ ) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i = 1; i<9;i++) {
				sum+=arr[i];
			}
			avg = sum/8;
	
			System.out.println("#" + test_case + " " + avg);
		}
	}

}
