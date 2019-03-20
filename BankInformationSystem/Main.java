import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int noa = 0;


    public static void main(String[] args) {
	// write your code here

        ArrayList Customer = new ArrayList();


        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there valued customer. Please enter which function you would like to complete (create savings account, create checking account, or see balances)");
        if (sc.next().equals("create savings account")) {
            System.out.println("How much would you like to deposit?");
            Float balance = sc.nextFloat();
            Savings account1 = new Savings(noa+1, balance);
            Customer.add(account1);
            showBalance(Customer.indexOf(account1));

        }

        if (sc.next().equals("see balances")) {
            System.out.println("Please enter your account number: ");
            showBalance(sc.nextInt());

        }

    }

    public static int showBalance(int accountno) {
        System.out.println("Your account number is");
        return 0;
    }

}
