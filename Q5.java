import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Number of inversions");
		int count = 0;
		for(int i=0; i<n-1; i++) {
			for(int j= i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					count++;
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		System.out.println("Inversions = "+count);

	}

}
