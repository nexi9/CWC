import java.util.Scanner;

public class Q3 {
	
	public static int print(int n) {
		if(n<3)
			return 0;
		else if(n==3)
			return 1;
		else 
			return print(n-1)+print(n-2)+print(n-3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(print(i)+" ");
		}
	}

}
