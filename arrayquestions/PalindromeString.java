package com.arrayquestions;

//q11)WAP to remove the String which is not palindrome string from the array of String.
public class PalindromeString {
	public static void main(String[] args) {
		String[] str = { "nisha", "madam", "nishi", "mom" };
		for (String string : str) {
			if (PalindromeString.isPalindrom(string)) {
				continue;
			}
		}

	}

	private static boolean isPalindrom(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equals(reverse)) {
			System.out.println(reverse);
			return true;
		} else {
			return false;
		}

	}
}
