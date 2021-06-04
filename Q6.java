import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y && x>z) {
			System.out.println("Max="+x);
		} else if (y>z) {
			System.out.println("Max = "+y);
		} else {
			System.out.println("Max ="+z);
		}

	}

}
