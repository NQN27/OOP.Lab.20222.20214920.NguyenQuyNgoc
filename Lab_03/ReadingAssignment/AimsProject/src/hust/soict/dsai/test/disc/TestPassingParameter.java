package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap( jungleDVD,cinderellaDVD);
		System.out.println("jungle "+jungleDVD.getTitle());
		System.out.println("cinderella "+cinderellaDVD.getTitle());
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle "+jungleDVD.getTitle());
	}
	/*public static void swap(Object dvd1,Object dvd2) {
			Object tmp = dvd1;
			dvd1 = dvd2;
			dvd2 = tmp;
	}*/
	public static void changeTitle(DigitalVideoDisc dvd1,String title) {
		String oldTitle = dvd1.getTitle();
		dvd1.setTitle(title);
		dvd1 = new DigitalVideoDisc(oldTitle);
	}
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tmp);
	}

}
