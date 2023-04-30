import java.util.Scanner;

class Day{
	public static void main(String[] args){


	Scanner s = new Scanner(System.in);
	String day = s.next();

	if(day.equals("monday") ||day.equals("tuesday")  || day.equals("Wednsday")){
	System.out.println("Discount 5%");
	}
	else if(day.equals("thursday")  || day.equals("Friday")) {
	System.out.println("Discount 4%");
	}
	else if(day.equals("Saturday")  || day.equals("Sunday")) {
	System.out.println("Discount 3%");
	}
	else{
	System.out.println("You typed in the wrong thing. Try again");
	}
}
}