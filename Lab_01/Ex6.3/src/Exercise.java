import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		System.out.println("Input the number of row you want");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i=1;i<=n;i++) {
			String a ="";
			String b ="";
			for(int j=1; j<=(n-i+1);j++) {a+=" ";}
			for(int k=1; k<=(2*i-1);k++) {b+="*";}
			System.out.println(a+b+a);
					
		}
		}

	}


