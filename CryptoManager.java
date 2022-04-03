/*
Montgomery College

CMSC 203

Assignment 4 Design

Class: CMSC203 CRN 34166

 Program: Assignment 4 Design

Instructor: Khandan Monshi

 Summary of Description: Create Methods that will decrypt or encrypt messages using the Ceasar Cipher or the Bellaso Cipher

 Due Date: 04/01/2022

 Integrity Pledge: I pledge that I have completed the programming assignment independently.

 I have not copied the code from a student or any source.

 Student: Victor Lopez
 
 Pseudocode:
 
 Method: stringInBound()
 * Declare a boolean variable called boundary and initialize it to true
 * create a for loop
 	* declare an integer named i and set it to 0
 	* as long as i is less than the length of variable: plainText, increment i
 		* for each incrementation, do the following:
 			* if the plainText's specific value at i is not greater than or equal to LOWER_BOUND
 			* and if the plainText's specific values at i are not less than the equal to UPPER_BOUND then:  
 				* set boundary to false
		* end the for loop 	 	 	  		
		* return boundary 
=================================================================================
 Method: encryptCeasr()
 * declare a String called encryptedText and set it to empty quotation marks
 * if stringInBounds(plainText) is true then do the following: 
 	* create a for loop containing:
 		* declare an integer i and set it to 0;
 		* as long as i is less than the length of plainText then;
 		* increment i
		* while i is less than the length of plainText do the following:
			* declare a char named ch and set it equal to the specific value of plainText at i
			* declare an integer named encryptedCharint and set it to ch + key
			* create a while loop 
				* while encryptedCharint is greater than the UPPER_BOUND then:
					* set encryptedCharint to encryptedChar - RANGE 
				* end while loop
			* set ecnryptedText to encryptedText + encryptedCharint
		* end for loop
 * return encryptedText	
===================================================================================
 Method: encryptBellaso()	    	
 * declare a String called encryptedText and set it to empty quotation marks
 * declare an integer named bellasoStrLength and set it to the length of bellasoStr 
 * create a for loop containing:
 		* declare an integer i and set it to 0;
 		* as long as i is less than the length of plainText then;
 		* increment i
		* while i is less than the length of plainText do the following:
			* declare a char named ch and set it equal to the specific value of plainText at i
			* declare an integer named encryptedCharint and set it to (ch + bellasoStr at a specific value of (i % bellasoStrLength)
			* create a while loop 
				* while encryptedCharint is greater than the UPPER_BOUND then:
					* set encryptedCharint to encryptedChar - RANGE 
				* end while loop
			* set ecnryptedText to encryptedText + encryptedCharint
	* end for loop
 * return encryptedText	
====================================================================================
Method: decryptCeasar()
 * declare a String called decryptedText and set it to empty quotation marks
 * declare an integer named bellasoStrLength and set it to the length of bellasoStr 
 * create a for loop containing:
 		* declare an integer i and set it to 0;
 		* as long as i is less than the length of plainText then;
 		* increment i
		* while i is less than the length of plainText do the following:
			* declare a char named ch and set it equal to the specific value of plainText at i
			* declare an integer named decryptedCharint and set it to ch - key
			* create a while loop 
				* while decryptedCharint is less than LOWER_BOUND then:
					* set decryptedCharint to decryptedChar + RANGE 
				* end while loop
			* set decryptedText to decryptedText + decryptedCharint
	* end for loop
 * return decryptedText	
=====================================================================================
Method: decrypBellaso()
 * declare a String called decryptedText and set it to empty quotation marks
 * declare an integer named bellasoStrLength and set it to the length of bellasoStr 
 * create a for loop containing:
 		* declare an integer i and set it to 0;
 		* as long as i is less than the length of plainText then;
 		* increment i
		* while i is less than the length of plainText do the following:
			* declare a char named ch and set it equal to the specific value of plainText at i
			* declare an integer named decryptedCharint and set it to (ch + bellasoStr at a specific value of (i % bellasoStrLength)
			* create a while loop 
				* while decryptedCharint is less than LOWER_BOUND then:
					* set decryptedCharint to decryptedChar + RANGE 
				* end while loop
			* set decryptedText to decryptedText + decryptedCharint
	* end for loop
 * return decryptedText	
====================================================================================
====================================================================================
Description of each Method:
	stringInBound()
	* To create a boolean variable called boundary and to compare it to the wanted bounds of the program. It is set to true but if it is greater or equal to the lower bounds
	* or greater than or equal to the upper bounds, then set it to false. then it returns the variable boundary
	
	encryptCeasar()
	* creates a String variable called encryptedText. Makes an if statement that if stringInBound(plainText) is True then:
	* a for loop runs which increments a variable i each time it i is less than the length of plainText. while the loop runs 
	* a char is created as well as an integer. a while loop runs which runs while the integer variable is greater than the upper bound 
	* the integer is set to the integer minus the range. the while loop ends and encryptedText is set to itself plus the integer. encryptedText is returned
	
	decryptCeasar()
	* creates a String variable called decryptedText. a for loop runs which increments a variable i each time it i is less than 
	* the length of plainText. while the loop runs a char is created as well as an integer. 
	* a while loop runs which runs while the integer variable is less than the lower bound 
	* the integer is set to the integer plus the range. the while loop ends and encryptedText is set to itself plus the integer.
	*  decryptedText is returned
	
	encryptBellaso()
	* creates a String variable called encryptedText. Makes an integer named bellasoStrLength and sets it to bellasoStr.length()
	* a for loop runs which increments a variable i each time it i is less than the length of plainText. 
	* while the loop runs a char is created as well as an integer called encryptedCharin. the integer is set to the char plus bellaso.charAt(i %bellasoStrLength).
	* encryptedCharin is set to itself minus range. The while loop ends and encryptedText is set to itself plus encryptedCharint.
	* returns encryptedText
	
	decryptBellaso()
	* creates a String variable called decryptedText. Makes an integer named bellasoStrLength and sets it to bellasoStr.length()
	* a for loop runs which increments a variable i each time it i is less than the length of plainText. 
	* while the loop runs a char is created as well as an integer called decryptedCharin. the integer is set to the char plus bellaso.charAt(i %bellasoStrLength).
	* decryptedCharin is set to itself plus range. The while loop ends and encryptedText is set to itself plus encryptedCharint.
	* returns decryptedText
	
	
	
	
 
*/
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean boundary = true;
			for (int i = 0; i < plainText.length(); i++) // for loop to increment i for each time i is < the length of encryptedText
			{
				if (!(plainText.charAt(i) >= LOWER_BOUND && plainText.charAt(i) <= UPPER_BOUND)) // if plainText is not >= LOWER_BOUND and 
				{ 																				// plainText is not <= UPPER_BOUND then:
					boundary = false;
				}
			}
			return boundary;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String encryptedText = "";
			if (stringInBounds(plainText))
			{
				for (int i = 0; i < plainText.length(); i++) // for loop to increment i for each time i is < the length of encryptedText
				{
					char ch = plainText.charAt(i);
					int encryptedCharint = ((int)ch + key);
						while (encryptedCharint > UPPER_BOUND) // while loop: while encryptedCharint is > UPPER_BOUND do:
						{
							encryptedCharint -= RANGE;
						}
						encryptedText += (char)encryptedCharint;
				}
			}
			return encryptedText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String encryptedText = "";
		int bellasoStrLength = bellasoStr.length();
			for (int i = 0; i < plainText.length(); i++) // for loop to increment i for each time i is < the length of encryptedText
			{
				char ch = plainText.charAt(i);
				int encryptedCharint = ((int)ch + (int)bellasoStr.charAt(i % bellasoStrLength));
					while (encryptedCharint > (int)UPPER_BOUND) // while loop: while encryptedCharint is > LOWER_BOUND do:
					{
						encryptedCharint -= RANGE;
					}
					encryptedText += (char)encryptedCharint;
			}
			return encryptedText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decryptedText = "";
		for (int i = 0; i < encryptedText.length(); i++) // for loop to increment i for each time i is < the length of encryptedText
		{
			char ch = encryptedText.charAt(i);
			int decryptedCharint = ((int)ch - key); // declare int variable (decryptedCharint) and set to ch - key
				while (decryptedCharint < LOWER_BOUND) // while loop: while decryptedCharint is < LOWER_BOUND do:
				{
					decryptedCharint += RANGE;
				}
				decryptedText += (char)decryptedCharint;
		}
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decryptedText = "";
		int bellasoStrLength = bellasoStr.length();	// set bellasoStrLength to the length of bellasoStr
			for (int i = 0; i < encryptedText.length(); i++) // for loop to increment i for each time i is < the length of encryptedText
			{
				char ch = encryptedText.charAt(i);
				int decryptedCharint = ((int)ch - (int)bellasoStr.charAt(i % bellasoStrLength)); // subtract (int)ch by bellasoStr at char (i % bellasoStrLength)
					while (decryptedCharint < (int)LOWER_BOUND) // while loop: while decryptedCharint is < LOWER_BOUND do:
					{
						decryptedCharint += RANGE;
					}
					decryptedText += (char)decryptedCharint;
			}
			return decryptedText;
		
		}
}