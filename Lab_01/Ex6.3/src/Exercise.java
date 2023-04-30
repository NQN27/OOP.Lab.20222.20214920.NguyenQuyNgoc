import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		int n =0;
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		while (check == true) {
		try {
		System.out.println("Input the number of row you want");
		n = scanner.nextInt();
		if (n<1) {
			check= true;
			System.out.println("Input number higher or equal to 1");}
		else { check = false;}
		} catch (Exception e) {
			check = true;
			System.out.println("wrong type input");
			scanner.nextLine();
			}
		}
		for (int i=1;i<=n;i++) {
			String a ="";
			String b ="";
			for(int j=1; j<=(n-i+1);j++) {a+=" ";}
			for(int k=1; k<=(2*i-1);k++) {b+="*";}
			System.out.println(a+b+a);
					
		}
		}

	}


