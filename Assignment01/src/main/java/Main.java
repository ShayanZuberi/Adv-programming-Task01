import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Bank bank = new Bank();
    	String username = "ShayanZuberi";
    	String password = "banking101";
    	boolean loginSuccess = false; 
    	
    	while(loginSuccess == false) {
    		System.out.println("Please enter admin username: ");
    		String un = scan.next();
    		System.out.println("Please enter admin password: ");
    		String pw = scan.next();
    		if (un.equals(username) && pw.equals(password)) {
    			loginSuccess = true;
    		}
    		else {
    			System.out.println("\nIncorrect Credentials ");
    			System.out.println("Press 1 to try again ");
    			System.out.println("Press 2 to exit ");
        		int choice = scan.nextInt();
        		if (choice == 2) {
        			break;
        		}
    		}
    	}
    	
    	while(loginSuccess == true) {
    		System.out.println("\nPress 1 to add a new customer");
    		System.out.println("Press 2 to make a transaction");
    		System.out.println("Press 3 to set Interest rate for all savings accounts");
    		System.out.println("Press 4 to");
    		System.out.println("Press 5 to");
    		System.out.println("Press 6 to exit");
    		int choice = scan.nextInt();
    		if (choice == 1) {
    			bank.addCustomer();
    		}
    		else if (choice == 2) {
    			bank.makeTransaction();
    		}
    		else if (choice == 3) {
    			System.out.println("\nPlease enter new Interest Rate");
    			float rate = scan.nextFloat();
    			bank.setInterestRate(rate);
    		}
    		else if (choice == 4) {
    			
    		}
    		else if (choice == 5) {
    			
    		}
    		else if (choice == 6) {
    			break;
    		}
    		
    		
    	}
    	scan.close();
    }

}
