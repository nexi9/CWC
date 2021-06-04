import java.util.Scanner;

public class Q4 {
	
	public static boolean automorphic(int num,int n) {
		boolean k;
		if(num==0) {
			return true;
		} else {
			k=automorphic(num/10, n/10);
			if(num%10 == n%10 && k==true) {
				return true;
			} else {
				return false;
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n = num*num;
		boolean c = automorphic(num,n);
		if(c==true) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not Automorphic");
		}

	}

}
