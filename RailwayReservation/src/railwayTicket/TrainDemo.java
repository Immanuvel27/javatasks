package railwayTicket;

import java.util.*;

public class TrainDemo {

	static int upper = 2;
	static int middle = 2;
	static int lower = 2;
	static int rac = 2;
	static Ticket[] t = new Ticket[12];
	static int ticketCount = 0;
	
	
	//booking tickets
	public static void book() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of tickets to book:");
		int n = in.nextInt();
		if (Ticket.seatCount >= n) {

			for (int i = ticketCount; i < ticketCount + n; i++) {
				t[i] = new Ticket();
				t[i].booktickets(i);

			}
			ticketCount += n;
		} else {
			System.out.println(n + " seats not available");
		}

	}
	
	
	//to check available seats
	public static void available() {
		System.out.println("available tickets:" + Ticket.seatCount);
		System.out.println("upper berth:" + upper);
		System.out.println("middle berth:" + middle);
		System.out.println("lower berth:" + lower);
	}
	
	//to cancel tickets
	public static void cancel() {
		System.out.println("cancel the ticket");
	}
	
	//to print the tickets
	public static void Print() {
		Scanner in = new Scanner(System.in);

		System.out.println("enter the pnrno to view ticket:");
		int number = in.nextInt();
		Ticket.viewTickets(number);
	}
	
	
	//main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int check, n;

		System.out.println("Railway ticket booking");
		System.out.println("1. View availability\n"
				+ "2. Book Ticket\n"
				+ "3. Cancel Ticket\n"
				+ "4. Print TIcket\n"
				+ "5. Exit");
		System.out.println("-----------------------------------");
		do {
			System.out.println("Enter Your Choice!!!");
			check = in.nextInt();
			switch (check) {
				case 1:
					System.out.println("Availabiity check");
					available();
					break;
				case 2:
					System.out.println("Booking Ticket!!!");
					book();

					break;
				case 3:
					System.out.println("Cancel Ticket!!!");
					cancel();
					break;
				case 4:
					System.out.println("Print Ticket!!!");
					Print();

					break;
				case 5:
					System.out.println("Thank You!!!");
					break;
				default:
					System.out.println("Wrong Option!!!!");
			}
		} while (check != 5);

	}

}
