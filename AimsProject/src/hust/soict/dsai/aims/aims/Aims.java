package hust.soict.dsai.aims.aims;
import java.util.ArrayList;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import java.util.Scanner;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	private static Store store = new Store();
	private static Cart cart = new Cart();
	public static int showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner opt = new Scanner(System.in);
		int choice = opt.nextInt();
		return choice;
	}
	public static int updateStore() {
		System.out.println("1. Add a Media");
		System.out.println("2. Remove a Media");
		System.out.println("0. Exit");
		Scanner opt = new Scanner(System.in);
		int choice = opt.nextInt();
		return choice;
	}
	public static int updateCart() {
		System.out.println("1. Add a Media");
		System.out.println("2. Notadd a Media");
		System.out.println("0. Exit");
		Scanner opt = new Scanner(System.in);
		int choice = opt.nextInt();
		return choice;
	}
	public static void NewMedia() {
		Scanner optadd = new Scanner(System.in);
		System.out.println("1. Add a DVD");
		System.out.println("2. Add a CD");
		System.out.println("3. Add a Book");
		int type = optadd.nextInt();
		switch(type) {
		case 1: //add DVD
				System.out.println("Enter title of media");
				String title = optadd.nextLine();
				System.out.println("Enter length of media");
				int length = optadd.nextInt();
				System.out.println("Enter cost of media");
				float cost = optadd.nextFloat();
				System.out.println("Enter category of media");
				String category = optadd.nextLine();
				System.out.println("Enter director of media");
				String director = optadd.nextLine();
				DigitalVideoDisc dvd1 = new DigitalVideoDisc(title,category,director,length,cost);
				store.addMedia(dvd1);
				break;
		case 2: // add Book
			System.out.println("Enter title of media");
			String titleb = optadd.nextLine();
			System.out.println("Enter category of media");
			String categoryb = optadd.nextLine();
			System.out.println("Enter cost of media");
			float costb = optadd.nextFloat();
			System.out.println("Enter author name");
			ArrayList<String> author = new ArrayList<String>();
			while (true) {
				System.out.println("You enter the name and continue by pressing enter or stop by typing \"Out\"");
				String nameauthor =optadd.nextLine();
				if (nameauthor.equals("Out")) {
					break;
				}
				author.add(nameauthor);
			}
			Book bk1 = new Book(titleb,categoryb,costb,author);
			store.addMedia(bk1);
			break;
		case 3: // add CD
			System.out.println("Enter title of media");
			String titlecd = optadd.nextLine();
			System.out.println("Enter category of media");
			String categorycd = optadd.nextLine();
			System.out.println("Enter director name");
			String directorcd = optadd.nextLine();
			System.out.println("Enter cost of media");
			float costcd = optadd.nextFloat();
			System.out.println("Enter artist name");
			String artist = optadd.nextLine();
			CompactDisc cd1 = new CompactDisc(titlecd,categorycd,costcd,directorcd,artist);
			while (true) {
				System.out.println("You enter the track and continue by pressing enter or stop by typing \"Out\" when the system ask");
				System.out.print("Enter title track");
				String titletrack =optadd.nextLine();
				System.out.print("Enter length track");
				int lengthtrack = optadd.nextInt();
				Track trk = new Track(titletrack,lengthtrack);
				cd1.addTrack(trk);
				System.out.print("Do you want to out");
				if (optadd.nextLine().equalsIgnoreCase("Out")){break;}
			}

			store.addMedia(cd1);
			break;
		}
	}
	public static int storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner opt = new Scanner(System.in);
		int choice = opt.nextInt();
		return choice;
	}
	public static void cartMenu() {
		cart.showMedia();
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		Scanner opt = new Scanner(System.in);
		int choice = opt.nextInt();
		switch(choice) {
		case 1: //Fitler by
			System.out.println("1. By Id");
			System.out.println("2. By Title");
			int choice2 = opt.nextInt();
			switch(choice2){
				case 1:
					int id=opt.nextInt();
					ArrayList<Media> r= cart.searchMediaID(id);
					if (r.size()!=0) {
						for (Media z:r) {
							System.out.println(z);
						}
					}
					else {System.out.println("Not found");}
					break;
				case 2:
					String title = opt.next();
					r = cart.searchMedia(title);
					if (r.size()!=0) {
						for (Media z:r) {
							System.out.println(z);
						}
					}
					else {System.out.println("Not found");}
					break;
				default:
					System.out.println("Wrong syntax");
					break;
			}
			break;
		case 2: // Sort by
			System.out.println("1. By Title - Cost");
			System.out.println("2. By Cost - Title");
			int choice3 = opt.nextInt();
			switch(choice3){
			case 1:
				cart.SortbyTitleCost();
				cart.printout();
				break;
			case 2:
				cart.SortbyCostTitle();
				cart.printout();
				break;
			default:
				System.out.println("Wrong Syntax");
				break;
			}
			break;
		case 3: //Remove
			System.out.println("Enter title");
			String title = opt.next();
			ArrayList<Media> r = cart.searchMedia(title);
			if (r.size()!=0) {
				for (Media z:r) {
					System.out.println(z);
					System.out.println("1. Delete");
					System.out.println("2. Pass");
					int opt3 = opt.nextInt();
					switch(opt3) {
					case 1:
						cart.removeMedia(z);
					case 2:
						continue;
					}
				}
			}
			else {System.out.println("Not found");}
		case 4: //Play media
			System.out.println("Enter Media title: ");
			String tle3 = opt.nextLine();
			ArrayList<Media> mda3 = cart.searchMedia(tle3);
			if (mda3.size() != 0) {
				for (Media r1:mda3) {
					if (r1 instanceof Disc) {				
						((Disc) r1).play();	
					} 
					else if (r1 instanceof Book)
						System.out.println("Cannot play book");
				}
			}
		case 5: // Order
			System.out.println("Total cost is:"+ cart.totalCost());
			cart.clear();
			break;
		case 0:
			break;
		default:
				System.out.println("Wrong syntax");
				break;
		}
	}

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		store.addMedia(dvd3);
		Book b1 = new Book("Wolf of Wall Street", "Comedy", 24.95f,"Martin Scorsese");
		store.addMedia(b1);
		CompactDisc cd1 = new CompactDisc("Star Wars", "theme song", 30f, "George Lucas", "George Lucas");
		Track t1 = new Track("theme 1", 10);
		cd1.addTrack(t1);
		store.addMedia(cd1);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int chosenmenu = showMenu();
			switch(chosenmenu) {
			case 1 : //View store
				store.showMedia();
				while (true) {
				int chosenstore = storeMenu();
				switch(chosenstore) {
				case 1: //See a media's details
					scanner.nextLine();
					System.out.println("Enter Media title: ");
					String tle = scanner.nextLine();
					store.searchMedia(tle);
				case 2: //Add a media to cart
					System.out.println("Enter Media title: ");
					String tle2 = scanner.nextLine();
					ArrayList<Media> mda = store.searchMedia(tle2);
					if (mda.size() != 0) {
						for (int i =0;i<mda.size();i++) {
							int choice = updateCart();
							switch(choice) {
							case 1:
								cart.addMedia(mda.get(i));
							case 2:
								continue;
							case 0:
								break;
							}
							}
						}
					break;
				case 3: // Play a media
					System.out.println("Enter Media title: ");
					String tle3 = scanner.nextLine();
					ArrayList<Media> mda3 = store.searchMedia(tle3);
					if (mda3.size() != 0) {
						for (Media r:mda3) {
							if (r instanceof Disc) {				
								((Disc) r).play();	
							} else if (r instanceof Book)
								System.out.println("Cannot play book");
					}
				}
					break;
				case 4: // See current cart
					cartMenu();
					break;
				case 0:
					break;
				}
			}
			case 2: // update store
				int op = updateStore();
				switch (op) {
				case 1:
					NewMedia();
				case 2:
					System.out.println("Enter title");
					String title = scanner.nextLine();
					ArrayList<Media> r = store.searchMedia(title);
					if (r.size()!=0) {
						for (Media z:r) {
							System.out.println(z);
							int opt3 = scanner.nextInt();
							System.out.println("1. Delete");
							System.out.println("2. Pass");
							switch(opt3) {
							case 1:
								store.removeMedia(z);
							case 2:
								continue;
							}
						}
					}
					else {System.out.println("Not found");}
				}
			case 3: // See current cart
				cartMenu();
			case 0:
				System.out.println("Out successfully");
				break;
			}
		}
		}
		
		

}
