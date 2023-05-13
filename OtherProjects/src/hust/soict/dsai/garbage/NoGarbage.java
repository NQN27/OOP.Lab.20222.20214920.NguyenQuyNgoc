package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\FPTSHOP\\Desktop\\Java_OOP\\Lab\\ON_lab\\OOP.Lab.20222.20214920.NguyenQuyNgoc\\OtherProjects\\src\\sample-2mb-text-file.txt";
		byte[] inputBytes = {0};
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		long start = System.currentTimeMillis();
		/*String outputString = "";
		for ( byte b : inputBytes) {
			outputString +=(char)b;
		}*/
		StringBuilder outputStringBuilder = new StringBuilder();
		for ( byte b : inputBytes) {
			outputStringBuilder.append(b);
		}

		System.out.println(System.currentTimeMillis()-start);
		
	}
}
/* StringBuilder/StringBuffer reduce lots of time because it is mutation
then it won't create a temporary to sign */