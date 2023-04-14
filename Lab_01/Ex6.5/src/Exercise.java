import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size_array;
		double sum=0;
		System.out.println("Input size of array");
		size_array = scanner.nextInt();
		double[] array1 = new double[size_array];
		for (int i=0;i<size_array;i++) {
			array1[i]=scanner.nextDouble();}
		for (int i=0;i<size_array;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.print("\n");
		for (int i=0;i<size_array;i++) {
			for (int j=0;j<size_array-i-1;j++) {
				if (array1[j]>array1[j+1]) {
					double temp =array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is");
		for (int i=0;i<size_array;i++) {
			System.out.print(array1[i]+" ");}
		System.out.println();
		for (int i=0;i<size_array;i++) {
			sum+=array1[i];
		}
		System.out.println("Sum of array is "+sum+" and the average is "+sum/size_array);
	}
}
