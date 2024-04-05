package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Madam";
		if(isPalindrome(name)) {
			System.out.println(name + " is a palindrome");
		}
		else {
			System.out.println(name + " is not a palindrome");
		}

	}

	private static boolean isPalindrome(String name) {
		// TODO Auto-generated method stub
		String clean = name.replaceAll("\\s", "").toLowerCase();
		StringBuilder reversename = new StringBuilder(clean).reverse();
		return clean.equals(reversename.toString());
	}

}
