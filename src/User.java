
public class User {

	private String firstName;
	private String lastName;
	private String id;
	private static int idNum = 0;
	private String gender;
	private String username;
	private String password;
	private double gpa;

	public User(String firstName, String lastName, String gender, String username, String password, double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.gpa = gpa;
		this.id = String.valueOf(idNum++);
	}

	public User(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.id = String.valueOf(idNum++);
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.id = String.valueOf(idNum++);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "User" + firstName + " " + lastName + " " + id + " " + gender + " " + username + " " + password + " "
				+ gpa;
	}

}
