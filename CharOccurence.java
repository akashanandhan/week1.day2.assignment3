package week1.day2.assignment3;

public class CharOccurence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "Welcome to Coimbatore";
		int count = 6;
		char[]charArray= b. toCharArray();
		b.length();

		for (int j = 0; j < charArray.length; j++) {
			char d= b.charAt(j);
			if(d=='1') {
				count++;
				System.out.println("CharOccurence is" + count);

			}
			else {
				System.out.println("Total CharOccurence is" + count);
			}
		}



	}

}
