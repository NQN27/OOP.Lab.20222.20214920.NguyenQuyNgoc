import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month,year = 0;
		boolean check= true;
		do {
		System.out.println("Enter a valid month");
		String monthInput = scanner.next();
		month = parseMonth(monthInput);
		if (month ==-1){
            System.out.println("Invalid input, please try again.\n");
        }
		} while (month <1);
		while(check==true) {
		try {
		System.out.println("Enter a valid years");
		year = scanner.nextInt(); 
		if (year>=0) {check = false;break;};
		}
		catch (Exception e) {
			System.out.println("Invalid input, please try again.\n");
			check = true;
		}
		}
		int days = getDaysInMonth(month,year);
		System.out.println("Number of Days in the month is "+days);
		
	}
	public static int parseMonth(String monthInput) {
		switch(monthInput) {
		case "January":
        case "Jan.":
        case "Jan":
        case "1":
            return 1;
        case "February":
        case "Feb.":
        case "Feb":
        case "2":
        	return 2;
        case "March":
        case "Mar.":
        case "Mar":
        case "3":
        	return 3;
        case "April":
        case "Apr.":
        case "Apr":
        case "4":
        	return 4;
        case "May":
        case "May.":
        case "5":
        	return 5;
        case "June":
        case "June.":
        case "Jun":
        case "6":
        	return 6;
        case "July":
        case "July.":
        case "Jul":
        case "7":
        	return 7;
        case "August":
        case "Aug.":
        case "Aug":
        case "8":
        	return 8;
        case "September":
        case "Sept.":
        case "Sep":
        case "9":
        	return 9;
        case "October":
        case "Oct.":
        case "Oct":
        case "10":
        	return 10;
        case "November":
        case "Nov.":
        case "Nov":
        case "11":
        	return 11;
        case "December":
        case "Dec.":
        case "Dec":
        case "12":
        	return 12;
        default:
        	return -1;
		}
	}
    public static int getDaysInMonth(int month, int year) {
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
            	if ((year%400) == 0) { days=29;break;}
            	else if ((year%100) == 0) {days=28;break;}
            	else if ((year%4) == 0) {days=29;break;}
            	else {days=28;break;}
      
}
        return days;
}
}