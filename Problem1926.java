import java.util.Scanner;

public class Problem1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         
        for(int i = 1; i<= N; i++) {
            String num = Integer.toString(i);
            if(num.matches(".*[369].*")) {
            	String result = num.replaceAll("[369]","-").replaceAll("\\d", "");
                System.out.print(result + " ");
            }else {
            	System.out.print(num + " ");
            }
			
	}
}
}

