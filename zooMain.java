package proj;

import java.util.ArrayList;
import java.util.Scanner;

public class zooMain {
	
	
	public static void displayAll(ArrayList<zooTicketing> al) {
		
		
		for(zooTicketing st : al) {
		
			System.out.println("Name:  "+ st.guestName + "  Age: "+ st.guestAge +" Ticketing: " + st.calculateBill());
			
			
			
		}
		
	}
	public static void priceDetails(ArrayList<zooTicketing> al) {
		int total =0;
		for(zooTicketing st : al) {
			
			total+=st.total;
		
		}
		System.out.println("Total Bill: "+total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch="y";
		
		System.out.println("1. If age <= 2 years, entrance price is INR 0.");
		System.out.println("2. If age > 2 years and <18, entrance price is INR 100.");
		System.out.println("3. If age >=18 years and <60, entrance price is INR 500.");
		System.out.println("4. If age >= 60 years, entrance price is INR 300.");
		ArrayList<zooTicketing> al = new ArrayList<zooTicketing>();
		
		System.out.println("Do you want to continue?(y/n)");
		String gChoice= sc.next();
		
		
		
		if(gChoice.equals("y")) {
		
		do
		{
			zooTicketing z1 = new zooTicketing();
			System.out.println("Please Enter Guest Name:");
			z1.setGuestName(sc.next());
			
			System.out.println("Please Enter Guest Age:");
			z1.setGuestAge(sc.nextInt());
			

			al.add(z1);
			System.out.println("Do you want to continue:");
			ch = sc.next();
		}
		while(ch.equals("y"));
		}
		displayAll(al);
		priceDetails(al);
		
		
		

	}

}
