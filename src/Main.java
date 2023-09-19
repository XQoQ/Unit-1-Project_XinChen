import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Enter Bill Amount: ");
        String bill = s.nextLine();
        System.out.println("Enter Percentage of Tips to pay: ");
        String tipPercentage = s.nextLine();
        System.out.println("Enter Number of People: ");
        String numOfPeople = s.nextLine();

        double cvtBill = Double.parseDouble((bill));
        int cvtTipPercentage = Integer.parseInt(tipPercentage);
        int cvtNumOfPeople = Integer.parseInt(numOfPeople);
        double tips = cvtBill *  (double) cvtTipPercentage / 100;
        double totalBill = cvtBill + tips;
        double tipPerPerson = tips / cvtNumOfPeople;
        double billPerPerson = totalBill / cvtNumOfPeople;

        System.out.println("The Total Tip Amount is: $" + f.format(tips));
        System.out.println("The ToTal Bill With Tips is: $" + f.format(totalBill));
        System.out.println("Tips Per Person: $" + f.format(tipPerPerson));
        System.out.println("Bill Per Person: $" + f.format(billPerPerson));
    }
}