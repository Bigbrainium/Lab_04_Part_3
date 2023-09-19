import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int winterCost;
        int springCost;
        int summerCost;
        int fallCost;


        System.out.println("What is your winter maintenance cost");
        winterCost = scan.nextInt();
        System.out.println("What is your spring maintenance cost");
        springCost = scan.nextInt();
        System.out.println("What is your summer maintenance cost");
        summerCost = scan.nextInt();
        System.out.println("What is your fall maintenance cost");
        fallCost = scan.nextInt();

        int totalCost = winterCost + summerCost + springCost + fallCost;

        System.out.println("");
        System.out.println("Your yearly maintenance cost is: $" + totalCost);
    }
}