package interview;

public class MainDriver {
	public static void main(String[] args) {
		// Sort an array in mountain order
		int arr[] = {5, 9, 7, 1, 4, 2};
		
		int idx = arr.length / 2;
		for (int i = 0; i <= idx - 2; i++) {
			if (arr[i+1] < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for (int i = idx; i <= arr.length - 2; i++) {
			if (arr[i+1] > arr[i]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=========================");
		
		// Fibonacci algorithm
		// 1, 1, 2, 3, 5
		int a = 1, b = 1;
		for (int i = 1; i < 100; i=b) {
			if (a == 1 && b == 1) {
				System.out.println(a);
				System.out.println(b);
				int temp = b;
				b+=a;
				a=temp;
			} else {
				System.out.println(b);
				int temp = b;
				b+=a;
				a=temp;
			}
		}
		
	}

}
