import java.util.ArrayList;

/**
 * Caesar contains two static methods for 
 * computing a simple Caesar cipher.
 *
 */
public class Caesar {

	private static String alpha = "abcdefghijklmnopqrstuvwxyz ";

	/**
	 * 
	 * Given a string and a shift amount reverse the encryption.
	 * 
	 */
	static String decrypt(int shift, String ciphertext) {
		return encrypt(alpha.length()-shift, ciphertext);
	}
	
	/**
	 * Encrypt a string by rotating each character by shift.
	 * 
	 * precondition: 0 <= shift <= 27, 
	 *                       plaintext is all alphabetic characters
	 * 
	 */
	static String encrypt(int shift, String plaintext) {

		plaintext = plaintext.toLowerCase();

		// rotate the alphabet by shift amount (including the space).
		String code = 
			alpha.substring(alpha.length()-shift, alpha.length())
			+ alpha.substring(0, alpha.length()-shift);

		String ciphertext = "";
		
		// for each character in plaintext
		for (int i = 0; i < plaintext.length(); i++) {
			ciphertext += alpha.charAt(code.indexOf(plaintext.charAt(i))); 
		}
		return ciphertext;
	}

	/**
	 * Main program just for testing.
	 * 
	 * @param args
	 */
	public static void main(String [] args) {	
		for (int i = 0; i <= 26; i++)
			System.out.println("Shift(" + i + "): " + 
					decrypt(0,encrypt(0, "Hello World")));       
	}
}