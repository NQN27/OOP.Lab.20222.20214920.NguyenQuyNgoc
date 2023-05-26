package hust.soict.dsai.aims.media;
import java.util.*;
public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
		for (int i=0;i<this.authors.size();i++) {
			if (this.authors.get(i) == authorName){
				System.out.print("Already exist");
				return;
			}
			this.authors.add(authorName);
			System.out.println("add Author Successfully");
		}
	}
	public void removeAuthor(String authorName) {
		for (int i=0;i<this.authors.size();i++) {
			if (this.authors.get(i) == authorName){
				this.authors.remove(authorName);
				System.out.println("Remove Successfully");
				return;
			}
			System.out.println("No Author Already");
		}
	}

	public Book() {
	}

}
