
public class Password {

	public static String generatePassword() {
		String password = "";
		// add capital letters for first 2 chars of password
		int capitalAmount = (int) (Math.random() * 4) + 2;
		for (int i = 0; i < capitalAmount; i++) {
			int capital = (int) (Math.random() * 26) + 1;
			switch (capital) {
			case 1:
				password += "A";
				break;
			case 2:
				password += "B";
				break;
			case 3:
				password += "C";
				break;
			case 4:
				password += "D";
				break;
			case 5:
				password += "E";
				break;
			case 6:
				password += "F";
				break;
			case 7:
				password += "G";
				break;
			case 8:
				password += "H";
				break;
			case 9:
				password += "I";
				break;
			case 10:
				password += "J";
				break;
			case 11:
				password += "K";
				break;
			case 12:
				password += "L";
				break;
			case 13:
				password += "M";
				break;
			case 14:
				password += "N";
				break;
			case 15:
				password += "O";
				break;
			case 16:
				password += "P";
				break;
			case 17:
				password += "Q";
				break;
			case 18:
				password += "R";
				break;
			case 19:
				password += "S";
				break;
			case 20:
				password += "T";
				break;
			case 21:
				password += "U";
				break;
			case 22:
				password += "V";
				break;
			case 23:
				password += "W";
				break;
			case 24:
				password += "X";
				break;
			case 25:
				password += "Y";
				break;
			case 26:
				password += "Z";
				break;
			}
		}
		int lowercaseAmount = (int) (Math.random() * 4) + 2;
		for (int i = 0; i < lowercaseAmount; i++) {
			int lowercase = (int) (Math.random() * 26) + 1;
			switch (lowercase) {
			case 1:
				password += "a";
				break;
			case 2:
				password += "b";
				break;
			case 3:
				password += "c";
				break;
			case 4:
				password += "d";
				break;
			case 5:
				password += "e";
				break;
			case 6:
				password += "f";
				break;
			case 7:
				password += "g";
				break;
			case 8:
				password += "h";
				break;
			case 9:
				password += "i";
				break;
			case 10:
				password += "j";
				break;
			case 11:
				password += "k";
				break;
			case 12:
				password += "l";
				break;
			case 13:
				password += "m";
				break;
			case 14:
				password += "n";
				break;
			case 15:
				password += "o";
				break;
			case 16:
				password += "p";
				break;
			case 17:
				password += "q";
				break;
			case 18:
				password += "r";
				break;
			case 19:
				password += "s";
				break;
			case 20:
				password += "t";
				break;
			case 21:
				password += "u";
				break;
			case 22:
				password += "v";
				break;
			case 23:
				password += "w";
				break;
			case 24:
				password += "x";
				break;
			case 25:
				password += "y";
				break;
			case 26:
				password += "z";
				break;
			}
		}
		int numberAmount = (int) (Math.random() * 4) + 2;
		for (int i = 0; i < numberAmount; i++) {
			int number = (int) (Math.random() * 10);
			password += number;
		}
		int symbolAmount = (int) (Math.random() * 4) + 2;
		for (int i = 0; i < symbolAmount; i++) {
			int symbol = (int) (Math.random() * 34);
			switch (symbol) {
			case 1:
				password += " ";
				break;
			case 2:
				password += "!";
				break;
			case 3:
				password += "\"";
				break;
			case 4:
				password += "#";
				break;
			case 5:
				password += "$";
				break;
			case 6:
				password += "%";
				break;
			case 7:
				password += "&";
				break;
			case 8:
				password += "\'";
				break;
			case 9:
				password += "(";
				break;
			case 10:
				password += ")";
				break;
			case 11:
				password += "*";
				break;
			case 12:
				password += "+";
				break;
			case 13:
				password += ",";
				break;
			case 14:
				password += "-";
				break;
			case 15:
				password += ".";
				break;
			case 16:
				password += "/";
				break;
			case 17:
				password += ":";
				break;
			case 18:
				password += ";";
				break;
			case 19:
				password += "<";
				break;
			case 20:
				password += "=";
				break;
			case 21:
				password += ">";
				break;
			case 22:
				password += "?";
				break;
			// @[\]^_`{|}~
			case 23:
				password += "@";
				break;
			case 24:
				password += "[";
				break;
			case 25:
				password += " \\";
				break;
			case 26:
				password += "]";
				break;
			case 27:
				password += "^";
				break;
			case 28:
				password += "_";
				break;
			case 29:
				password += "`";
				break;
			case 30:
				password += "{";
				break;
			case 31:
				password += "|";
				break;
			case 32:
				password += "}";
				break;
			case 33:
				password += "~";
				break;

			}
		}
		return password;
	}
}
