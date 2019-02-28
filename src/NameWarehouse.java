import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameWarehouse {

	private String[] girlsNames;
	private String[] boysNames;
	private String[] lastNames;
	private int totalGirlsNames;
	private int totalBoysNames;
	private int totalLastNames;
	private AccountBag ab;
	private static final int MAX = 1500;

	public NameWarehouse(AccountBag ab) throws FileNotFoundException {
		this.ab = ab;
		girlsNames = new String[650];
		boysNames = new String[650];
		lastNames = new String[15000];
		loadGirlNames();
		loadBoyNames();
		loadLastNames();

	}

	public void loadGirlNames() throws FileNotFoundException {
		File file = new File("C:\\Users\\Katie\\Downloads\\Names\\Names\\girls_names.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			sc.useDelimiter("\\t{1,9}");
			girlsNames[totalGirlsNames++] = sc.next();
		}
		sc.close();
	}

	public void loadBoyNames() throws FileNotFoundException {
		File file = new File("C:\\Users\\Katie\\Downloads\\Names\\Names\\boys_names.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			sc.useDelimiter("\\t{1,6}[0-9]{1,5}.\\s");
			boysNames[totalBoysNames++] = sc.next();
		}
		sc.close();
	}

	public void loadLastNames() throws FileNotFoundException {
		File file = new File("C:\\Users\\Katie\\Downloads\\Names\\Names\\last_names.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			sc.useDelimiter("\\n{0,9}");
			lastNames[totalLastNames++] = sc.next();
		}
		sc.close();
	}

	public void loadGirls() {
		int count = 0;
		while (count < MAX) {
			User user = new User(girlsNames[(int) (Math.random() * 500)], lastNames[(int) (Math.random() * 14000)]);
			user.setUsername(Username.generateUsername(user));
			user.setPassword(Password.generatePassword());
			user.setGpa(GPA.generateGPA());
			user.setGender("F");
			ab.addUser(user);
		}
	}

	public void loadBoys() {
		int count = 0;
		while (count < MAX) {
			User user = new User(boysNames[(int) (Math.random() * 500)], lastNames[(int) (Math.random() * 14000)]);
			user.setUsername(Username.generateUsername(user));
			user.setPassword(Password.generatePassword());
			user.setGpa(GPA.generateGPA());
			user.setGender("M");
			ab.addUser(user);
		}
	}

}
