import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int temp;
		for(int i=0; i<n/2; i++){
			if(arr[i]>arr[n-i-1]) {
				temp = arr[i];
				arr[i] = arr[n-i-1];
				arr[n-i-1] = temp;
				count++;
			}
		}
		System.out.println("Minimum no of swaps required = "+count);
		

	}

}
