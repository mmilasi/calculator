import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        int gum = 202;
        int toffee = 118;
        int icream = 2250;
        int choco = 1680;
        int dough = 1075;
        int panc = 80;
        int income = gum + toffee + icream + choco + dough + panc;

        System.out.println("\nIncome: " + "$" + income);

        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();

        int netIncome = income - staffExpenses - otherExpenses;

        System.out.print("Net income: " + netIncome);

        sc.close();
    }
}