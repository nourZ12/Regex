import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 Nour Zalatimo
 */
public class RegEx {

	public static void main(String[] args) throws FileNotFoundException {
		// Opening a file and scanning it's content using bufferreader to append all
		// lines to a string
		File file = new File("text.txt");
		Scanner scan = new Scanner(file);
		String string = null;
		String text = null;
		StringBuilder string1 = new StringBuilder();
		while (scan.hasNextLine()) {
			text = scan.nextLine();
			string1.append(text);
			string1.append("\r\n");
		}
		string = string1.toString();
		Pattern pattern = null;
		Matcher matcher = null;
		int partsOfTextOfInterfaces = 0;
		ArrayList<InterfaceName> interfaces1 = new ArrayList<>();
		pattern = Pattern.compile("\\b^.\\S*\\b", Pattern.MULTILINE);
		matcher = pattern.matcher(string);
		// finding the number of interfaces in file
		while (matcher.find()) {
			partsOfTextOfInterfaces++;
		}
		System.out.println("partsOfText of Interfaces found: " + partsOfTextOfInterfaces + "\n\n");

		String partsOfText[] = string.split("\\r?\\n\\r?\\n");
		// scanning for data (finding) , and saving them into interface object
		for (int y = 0; y < partsOfTextOfInterfaces; y++) {
			String name = regEx(partsOfText[y], "\\b^.\\S*\\b", pattern, matcher);
			String ipAddress = regEx(partsOfText[y], "\\b((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])[.]){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b"
					, pattern, matcher);
			String description = regEx(partsOfText[y], "(?<=Description: )\\w.*", pattern, matcher);
			String ifSpeed = regEx(partsOfText[y], "(?<=duplex,).+[,]", pattern, matcher);
			String duplexMode = regEx(partsOfText[y], ".*(?<=duplex),", pattern, matcher);
			String adminStatus = regEx(partsOfText[y], "\\b(up|down)(,)", pattern, matcher);
			String operationStatus = regEx(partsOfText[y], "(?<=line protocol is\\s)\\w{2,4}", pattern, matcher);
			String mac = regEx(partsOfText[y], "\\b\\w{4}[.]\\w{4}[.]\\w{4}\\s", pattern, matcher);
			String mtu = regEx(partsOfText[y], "(?<=MTU )\\d+", pattern, matcher);
			interfaces1.add(new InterfaceName(name, ipAddress, description, ifSpeed, duplexMode, adminStatus,
					operationStatus, mac, mtu));
		}

		for (int y = 0; y < interfaces1.size(); y++) {
			System.out.println("Interface Name: " + interfaces1.get(y).getInterfaceName() + "\nIP Address: "
					+ interfaces1.get(y).getIpAddress() + "\nDescription: " + interfaces1.get(y).getDescription()
					+ "\nifSpeed: " + interfaces1.get(y).getIfSpeed() + "\nDuplex Mode: "
					+ interfaces1.get(y).getDuplexMode() + "\nAdmin Status: " + interfaces1.get(y).getAdminStatus()
					+ "\nOperation Status: " + interfaces1.get(y).getOperationStatus() + "\nMac Address: "
					+ interfaces1.get(y).getMacAddress() + "\nMTU: " + interfaces1.get(y).getMtu()
					+ "\n----------------------------");
		}

	}

	public static String regEx(String text, String regex, Pattern pattern, Matcher match) {
		pattern = Pattern.compile(regex, Pattern.MULTILINE);
		match = pattern.matcher(text);
		if (match.find()) {
			return match.group(0);
		} else
			return "Not found";

	}

}
