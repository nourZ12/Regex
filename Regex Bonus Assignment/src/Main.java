import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		menu();
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();

		while (choice != 0) {
			if (choice == 1) {
				System.out.println("Enter Email Address:");
				String email = scan.next();
				validateEmail(email);
			} else if (choice == 2) {
				System.out.println("Enter Mac Address:");
				String macAddress = scan.next();
				macAddress(macAddress);
			} else if (choice == 3) {
				System.out.println("Enter ipv4 Address:");
				String ipv4 = scan.next();
				ipv4Address(ipv4);
			} else {
				System.out.println("No such choice, Try again\\n --------------\\n");
			}
			menu();
			choice = scan.nextInt();
		}
		if(choice == 0) {
			System.out.println("Goodbye!");
			System.exit(0);
		}

	}

	public static void menu() {
		System.out.println("Please select an option from below:\n1-Validate email  address\n2-Validate mac address"
				+ "\n3-Validate ipv4 address\n4-Press zero (0) to exit\n");
	}

	public static void validateEmail(String email) {
		Pattern pattern = Pattern.compile("\\w.{5,20}@\\w{5,10}[.][a-z]{3,5}");
		Matcher match = pattern.matcher(email);
		if (match.find()) {
			System.out.println(email + " is valid.\n --------------\n");
		} else {
			System.out.println("Not Valid.\n --------------\n");
		}
	}

	public static void macAddress(String macAddress) {
		Pattern pattern = Pattern.compile("\\w{4}[.]\\w{4}[.]\\w{4}");
		Matcher match = pattern.matcher(macAddress);
		if (match.find()) {
			System.out.println(macAddress + " is valid.\n --------------\n");
		} else {
			System.out.println("Not Valid\n --------------\n.");
		}
	}

	public static void ipv4Address(String ipv4Address) {
		Pattern pattern = Pattern.compile("\\b((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])[.]){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
		
		Matcher match = pattern.matcher(ipv4Address);
		if (match.find()) {
			System.out.println(ipv4Address + " is valid.\n --------------\n");
		} else {
			System.out.println("Not Valid\n --------------\n.");
		}
	}

}
