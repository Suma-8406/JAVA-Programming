import java.util.Scanner;
public class SelectionSort {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size");
	int n = sc.nextInt();
	int[] A = new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<A.length;i++)
		A[i] = sc.nextInt();
	sort(A);
	System.out.println("sorted array");
	for(int i=0;i<A.length;i++)
		System.out.print(A[i] + " ");
	}
	
public static void sort(int[] A) {
	int n=A.length;
	for(int i=0;i<n-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<n;j++)
			if(A[minIndex]>A[j])
				minIndex=j;
		int temp=A[i];
		A[i]=A[minIndex];
		A[minIndex]=temp;
	}
}
}
