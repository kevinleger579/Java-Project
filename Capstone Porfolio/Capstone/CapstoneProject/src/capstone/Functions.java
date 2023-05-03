package capstone;

import javax.swing.JOptionPane;

public class Functions {

	public Functions() {
		JOptionPane.showMessageDialog(null, "Welcome!");
		String User = JOptionPane.showInputDialog(null,
				"Which Function would you like to use \n1)Find a Char at An Index Within a String \n"
						+ "2)Compare 2 Strings\n3)Contains function\n4)Make an uppercase word, lowercase\n5)"
						+ "Make an integer, a string\n6)Check if 2 words are the same\n7)Find first occurance of a word"
						+ "\n8)Find Last occurance of a word\n9)Find the length of a word\n10)Create a string from an old string");
		// FindCharWithinString Method
		String inputString;
		String tempinputString;
		int indexNum;
		// CompareTwoString Method
		String compareString1 = null;
		String compareString2 = null;
		// ContainsIncludedStringMethod
		String UserString1 = null;
		String IncludedString = null;
		// ConvertStringtoLowercase Method
		String UppercaseString = null;
		// ConvertIntToString
		int InttoString;
		// CheckIfStringsAreTheSame
		String SameString1 = null;
		String SameString2 = null;
		// FindFirstOccurOfSubString
		String UserInputSentence = null;
		String WordInSentence = null;
		// FindLastOccurOfSubString
		String userInputSentence2 = null;
		String repeatingWords = null;
		// FindLengthOfString method
		String UserString = null;
		// Substring Method
		String tempString;
		String tempString2;
		int num1;
		int num2;

		if (User.equals("1")) {
			inputString = JOptionPane.showInputDialog(null, "Enter a word");
			tempinputString = JOptionPane.showInputDialog(null, "enter a number lower than " + inputString.length());
			indexNum = Integer.parseInt(tempinputString);
			FindCharWithinStringName(inputString, indexNum);
		}
		if (User.equals("2")) {
			CompareTwoStrings(compareString1, compareString2);

		}
		if (User.equals("3")) {
			ContainsIncludedString(UserString1, IncludedString);
		}
		if (User.equals("4")) {
			ConvertStringtoLowercase(UppercaseString);
		}
		if (User.equals("5")) {
			tempinputString = JOptionPane.showInputDialog(null, "enter a number");
			InttoString = Integer.parseInt(tempinputString);
			ConvertIntToString(InttoString);
		}
		if (User.equals("6")) {
			CheckIfStringsAreTheSame(SameString1, SameString2);
		}
		if (User.equals("7")) {
			FindFirstOccurOfSubString(UserInputSentence, WordInSentence);
		}
		if (User.equals("8")) {
			FindLastOccurOfSubString(userInputSentence2, repeatingWords);
		}
		if (User.equals("9")) {
			UserString = JOptionPane.showInputDialog(null, "Enter a word");
			FindLengthOfString(UserString);
		}
		if (User.equals("10")) {
			UserString = JOptionPane.showInputDialog(null, "Enter a sentence");
			tempString = JOptionPane.showInputDialog(null, "enter a number lower than " + UserString.length());
			tempString2 = tempinputString = JOptionPane.showInputDialog(null,
					"Enter another number greater than than " + tempString);
			num1 = Integer.parseInt(tempString);
			num2 = Integer.parseInt(tempString2);
			Substring(UserString, num1, num2);
		}
	}

	public char FindCharWithinStringName(String inputString, int indexNum) {
		char IndexLocation = inputString.charAt(indexNum);
		JOptionPane.showMessageDialog(null, IndexLocation);
		return IndexLocation;

	}

	public int CompareTwoStrings(String compareString1, String compareString2) {
		compareString1 = JOptionPane.showInputDialog(null, "Enter a string");
		compareString2 = JOptionPane.showInputDialog(null, "Enter another string");

		JOptionPane.showMessageDialog(null, compareString1.compareTo(compareString2));

		return compareString1.compareTo(compareString2);

	}

	public boolean ContainsIncludedString(String string1, String includedString) {
		string1 = JOptionPane.showInputDialog(null, "Enter a word or sentence");
		includedString = JOptionPane.showInputDialog(null, "Enter a section from " + string1);

		JOptionPane.showMessageDialog(null, string1.contains(includedString));

		return string1.contains(includedString);
	}

	public String ConvertStringtoLowercase(String UpperCaseString) {
		UpperCaseString = JOptionPane.showInputDialog(null, "Enter a string");
		String LowercaseString = UpperCaseString.toLowerCase();
		JOptionPane.showMessageDialog(null, LowercaseString);
		return LowercaseString;
	}

	public String ConvertIntToString(int InttoString) {
		JOptionPane.showMessageDialog(null, Integer.toString(InttoString));
		return Integer.toString(InttoString);
	}

	public boolean CheckIfStringsAreTheSame(String string1, String string2) {
		string1 = JOptionPane.showInputDialog(null, "Enter a string");
		string2 = JOptionPane.showInputDialog(null, "Enter another string");

		JOptionPane.showMessageDialog(null, string1.equals(string2));

		return string1.equals(string2);

	}

	public int FindFirstOccurOfSubString(String string1, String includedString) {
		string1 = JOptionPane.showInputDialog(null, "Enter a sentence");
		includedString = JOptionPane.showInputDialog(null, "Enter a word from " + string1);

		int indexOfSubString = string1.indexOf(includedString);

		JOptionPane.showMessageDialog(null, includedString + " first appeared at index : " + indexOfSubString);
		return indexOfSubString;
	}

	public int FindLastOccurOfSubString(String string1, String string2) {
		string1 = JOptionPane.showInputDialog(null, "Enter a sentence \n Hint: Try to repeat a word or two");
		string2 = JOptionPane.showInputDialog(null,
				"Enter a word from" + string1 + "\nHint: Try yo use one your repeating words");

		int indexOfSubString = string1.lastIndexOf(string2);

		JOptionPane.showMessageDialog(null, string2 + " last appeared at index : " + indexOfSubString);
		return indexOfSubString;
	}

	public int FindLengthOfString(String strings) {
		int stringLength = strings.length();
		JOptionPane.showMessageDialog(null, "The length of your word is " + stringLength + " characters");
		return stringLength;
	}

	public String Substring(String UserString, int num1, int num2) {
		JOptionPane.showMessageDialog(null, "Your new String is " + UserString.substring(num1, num2));
		return UserString;
	}
}
