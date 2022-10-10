package railwayTicket;

import java.util.*;

public class Ticket extends Passenger {
	Scanner in = new Scanner(System.in);
	int pnrno;
	String status;
	int nooftickets;
	String berth;
	static int seatCount = 6;

	public void booktickets(int n) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pnrno = n + 1;
		System.out.println("enter the name");
		this.name = in.nextLine();
		System.out.println("enter the sex");
		this.sex = in.nextLine();
		System.out.println("enter the age");
		this.age = in.nextInt();

		if (TrainDemo.upper < 1) {
			System.out.println("Upper berth is not Available");
		} else if (TrainDemo.middle < 1) {
			System.out.println("Middle berth is not available");
		} else if (TrainDemo.lower < 1) {
			System.out.println("Lower berth is not available");
		}

		System.out.println("enter the seat:lower:L middle:M  upper:U");

		if (this.age <= 5) {
			this.berth = "";
			seatCount += 1;
		} else if (this.age >= 60) {
			this.berth = in.next();

			if (TrainDemo.lower > 0) {
				this.berth = "L";
				TrainDemo.lower--;
			} else if (berth.equals("L")) {
				if (TrainDemo.lower > 0) {
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					this.berth = "M";
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					this.berth = "U";
					TrainDemo.upper--;
				}

			} else if (berth.equals("M")) {
				if (TrainDemo.middle > 0) {
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					this.berth = "U";
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					this.berth = "L";
					TrainDemo.lower--;
				}

			} else if (berth.equals("U")) {
				if (TrainDemo.upper > 0) {
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					this.berth = "L";
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					this.berth = "M";
					TrainDemo.middle--;
				}

			}
		}

		else {
			this.berth = in.next();

			if (berth.equals("L")) {
				if (TrainDemo.lower > 0) {
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					this.berth = "M";
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					this.berth = "U";
					TrainDemo.upper--;
				}

			} else if (berth.equals("M")) {
				if (TrainDemo.middle > 0) {
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					this.berth = "U";
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					this.berth = "L";
					TrainDemo.lower--;
				}

			} else if (berth.equals("U")) {
				if (TrainDemo.upper > 0) {
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					this.berth = "L";
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					this.berth = "M";
					TrainDemo.middle--;
				}

			}
		}

		seatCount--;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("your ticket number is:" + this.pnrno);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		

	}

	public static void viewTickets(int num) {
		if (TrainDemo.ticketCount == 0) {
			System.out.println("no tickets available to print");
		}
		for (int i = 0; i < TrainDemo.ticketCount; i++) {
			if (num == TrainDemo.t[i].pnrno) {
				System.out.println("the ticket number:" + TrainDemo.t[i].pnrno);
				System.out.println("the name:" + TrainDemo.t[i].name);
				System.out.println("the age:" + TrainDemo.t[i].age);
				System.out.println("the berth:" + TrainDemo.t[i].berth);
			}
		}
	}

}
