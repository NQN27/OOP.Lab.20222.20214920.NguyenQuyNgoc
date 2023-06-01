package hust.soict.dsai.aims.media;
import java.util.*;
public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
		for (int i=0;i<this.authors.size();i++) {
			if (this.authors.get(i).equals(authorName)){
				System.out.print("Already exist");
				return;
			}
			this.authors.add(authorName);
			System.out.println("add Author Successfully");
		}
	}
	public void removeAuthor(String authorName) {
		for (int i=0;i<this.authors.size();i++) {
			if (this.authors.get(i).equals(authorName)){
				this.authors.remove(authorName);
				System.out.println("Remove Successfully");
				return;
			}
			System.out.println("No Author Already");
		}
	}

	public Book( String title, String category, float cost,List<String> authors) {
		super(title,category,cost);
		for (int i=0;i<=authors.size();i++) {
			addAuthor(authors.get(i));
		}
	}
	public Book( String title, String category, float cost,String authors) {
		super(title,category,cost);
		this.authors.add(authors) ;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			if (((Book) obj).getTitle().equals(this.getTitle())) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String nameauthor="";
		for (int i=0;i<=this.authors.size();i++) {
			nameauthor=nameauthor+" "+this.authors.get(i);
		}
	return this.getId()+"Book-"+this.getTitle()+" - "+this.getCategory()+" - "+" - "+" :"+this.getCost()+nameauthor;}
}
