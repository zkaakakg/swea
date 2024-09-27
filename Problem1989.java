import java.util.Scanner;

public class Problem1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case<=T;test_case++) {
			String word = sc.next();
			StringBuffer sb = new StringBuffer(word);
			String reverseWord = sb.reverse().toString();
			System.out.print("#" + test_case + " ");
			if(word.equals(reverseWord)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
		}
		
	}

}
