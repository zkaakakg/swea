import java.util.Scanner;

public class Problem1288 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			boolean check[] = new boolean[10];
			int cnt=0;
			
			while(true) {
				cnt++;
				String num = Integer.toString(cnt*n);
				for (char c : num.toCharArray()) {
					check[c - '0'] = true; 
	                }
				boolean allChecked = true;
				for(boolean b: check) {
					if(!b) {
						allChecked = false;
						break;
					}
				}
				if(allChecked) break;
			}
			System.out.println("#" + test_case + " "+cnt*n);
			
		}
	}

}
