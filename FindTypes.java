package week1.day2.assignment3;

public class FindTypes {
	public static void count(String[] args) {
		String test = "$$ Welcome to 3nd Class of Automation$$";
		int letter = 0, space = 0, num = 0, SpecialChar = 0;
		char[]CharAt =test.toCharArray();
		for(int i=0; i<CharAt.length; i++) {
			if(Character.isLetter(CharAt[i])) {
				letter ++;
			}
			else if(Character.isDigit(CharAt[i])) {

				num ++;
	}
		else if (Character.isSpaceChar(CharAt[i])) {

			space ++;

		}
		else {
		SpecialChar ++;
		}
			System.out.println("Letter Count is" + letter);
			System.out.println("Digit Count is" + num);
			System.out.println("Space Count is" + space);
			System.out.println("Special character Count is" + SpecialChar);


	}

	}
}
