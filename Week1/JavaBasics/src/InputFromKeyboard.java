import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String strName = Keyboard.nextLine();
		System.out.println("How old are you ?");
		int age = Keyboard.nextInt();
		System.out.println("How tall are you (m) ?");
		double height = Keyboard.nextDouble();
		System.out.println("Your name is "+strName+"You are "+age+"years old "+" and your height is "+height+".");
	}

}
