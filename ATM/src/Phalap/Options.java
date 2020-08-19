package Phalap;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Options extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap <Integer, Integer> Data = new HashMap<Integer, Integer>();


	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				Data.put(1070071, 4478);
				Data.put(123456, 1234);

				System.out.println("Welcome to Phalap's Atm");

				System.out.print("Enter Your Account Number: ");
				setAccountNumber(menuInput.nextInt());

				System.out.print("Enter Your Account Pin: ");
				setAccountPin(menuInput.nextInt());

			} catch(Exception e) {
					System.out.println("\n" + "Invalid Character(s). Input numbers." + "\n");
					break;
			}
			for (Entry<Integer, Integer> Data : Data.entrySet()) {
				if (Data.getKey() == getAccountNumber() && Data.getValue() == getAccountPin()) {
					getAccountType();
				}
				else{
				System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
			}
		}

		}while (2 >= x);

	}
	
	public void getAccountType() {
		System.out.println("select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thanks for using this ATM, have a nice day.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thanks for using this ATM, have a nice day.");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getChecking();
		}
	}
	
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		
		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;

		case 2:
			getSavingWithdrawalInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		default:
			System.out.println("\n" + "Invalid choice" + "\n");
			getSaving();
		}
	}
	
	
	int selection;
	
	}
		

	
	
