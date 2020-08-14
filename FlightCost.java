/*
    A family consists of  x members. You are given the task to book flight tickets for these x members.
    You are given the following information about the airline in which you have to book the tickets:
        P: It denotes the cost of one ticket of the flight.
        S: It denotes the number of total available seats in the flight.
        T: If the numbers of available seats are less than or equal to T, then the cost of the flight ticket increases to H.
        H: It denotes the new hiked cost.
    Determine the total cost to book the tickets for all the family members.
    Note: The tickets are booked one by one for all the family members.

    Input format:
        First line: Five space-separated integers P, S, T, H and x respectively.

    Output format:
        Print the total cost to book the tickets for all the members of the family.

    Sample Input:                      Sample Output:
        6000 10 5 6500 7                 43000
        2766 29 16 6848 23               104438
        61427 221 131 66768 4            245708
 */

import java.util.Scanner;

public class FlightCost {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int P = sc.nextInt();  //It denotes the cost of one ticket of the flight.
        int S = sc.nextInt();  //It denotes the number of total available seats in the flight.
        int T = sc.nextInt();  //If the numbers of available seats are less than or equal to T , then the cost of the flight ticket increases to H.
        int H = sc.nextInt();  //It denotes the new hiked cost.
        int x = sc.nextInt();  //Number of family members.
        int cheapTicketCost = 0, costlyTicket = 0, costlyTicketCost = 0;
        int cheapTicket = S - T;

        if(cheapTicket > x){
            cheapTicketCost = x * P;
        } else {

            cheapTicketCost = cheapTicket * P;

            costlyTicket = x - cheapTicket;
            costlyTicketCost = costlyTicket * H;
        }

        int totalcCost = costlyTicketCost + cheapTicketCost;
        System.out.println(totalcCost);
    }
}
