
public class Username {

	// first 4 of last name
	// lastName.substring(0,4)
	// first letter of first name
	// firstName.charAt(0)
	// last digit of id
	// id.charAt(id.length() - 1)

	public static String generateUsername(User user) {
		return user.getLastName().substring(0, 4) + "" + user.getFirstName().charAt(0) + ""
				+ user.getId().charAt(user.getId().length() - 1);
	}

}
