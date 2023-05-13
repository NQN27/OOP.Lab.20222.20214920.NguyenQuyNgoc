import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row,col;
		System.out.println("Number of row: ");
		row = scanner.nextInt();
		System.out.println("Number of col: ");
		col = scanner.nextInt();
		double[][] mt1 = new double[row][col];
        double[][] mt2 = new double[row][col];
        double[][] summt = new double[row][col];
        System.out.println("Input the first matrix: ");
        for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		mt1[i][j] = scanner.nextDouble();
        	}
        }
        System.out.println("Input the second matrix: ");
        for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		mt2[i][j] = scanner.nextDouble();
        	}
        }
        for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		summt[i][j] = mt1[i][j]+mt2[i][j];
        	}
        }
        for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		System.out.print(summt[i][j]+" ");
        	}
        	System.out.print("\n");
        }
	}
}
