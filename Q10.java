import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String s = Integer.toString(n);
		String ss = s+s;
		String sss = s+s+s;
		System.out.println("n="+s);
		System.out.println("nn="+ss);
		System.out.println("nnn="+sss);
		System.out.println("Sum="+Integer.parseInt(s)+Integer.parseInt(ss)+Integer.parseInt(sss));

	}

}
