import java.util.HashMap;
import java.util.Map;

public class AccountBag {

	private Map<String, User> accountMap = new HashMap<String, User>(7000);

	public AccountBag() {

	}

	public boolean hasUsername(String username) {
		if (accountMap.containsKey(username)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkPassword(String username, String password) {
		if (hasUsername(username)) {
			User value = accountMap.get(username);
			if (password.equals(value.getPassword())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void addUser(User user) {
		accountMap.put(user.getUsername(), user);
	}

}
