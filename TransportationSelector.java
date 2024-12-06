import java.util.Scanner;
public class TransportationSelector {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of people:");
    int numberOfPeople = scanner.nextInt();
    System.out.println("Enter the budget:");
    int budget = scanner.nextInt();
    System.out.println("Enter the distance in km:");
    int distance = scanner.nextInt();
    String transportation = selectTransportation(numberOfPeople, budget, distance);
    System.out.println("Recommended transportation: " + transportation);
}
    public static String selectTransportation(int numberOfPeople, int budget, int distance) {
        if (numberOfPeople == 0 && distance <= 10) {
            return "Walk";
        } else if (numberOfPeople >= 1 && numberOfPeople <= 4 && budget >= 10 && budget <= 70 && distance >= 10 && distance <= 30) {
            return "Taxi";
        } else if ((numberOfPeople == 1 || numberOfPeople == 2) && budget >= 0 && budget <= 10 && distance <= 20) {
            return "E-bike";
        } else if (numberOfPeople >= 1 && numberOfPeople <= 4 && budget >= 50 && budget <= 300 && distance >= 30 && distance <= 500) {
            return "Coach";
        } else if (numberOfPeople >= 1 && numberOfPeople <= 4 && budget >= 50 && budget <= 400 && distance >= 100 && distance <= 3600) {
            return "Train";
        } else if (numberOfPeople >= 1 && numberOfPeople <= 4 && budget >= 200 && budget <= 800 && distance >= 500) {
            return "Plane";
        } else if (numberOfPeople >= 1 && numberOfPeople <= 4 && budget >= 0 && budget <= 10 && distance <= 30) {
            return "Bus/Underground";
        } else {
            return "No suitable transportation found";
        }
    }
}
