/* 
 * RegExTest.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       3
 */

/**
 * This program reads the file and prints the word from it.Checks if the word has any
 * specific properties, like being a palindrome.This evaluation is done using the 
 * pattern class and, also by own methods. 
 * @author      Aishwarya Sontakke
 * @author      Soniya Rode
 */

import java.util.Scanner;
import java.io.*;
import java.util.regex.Pattern;

public class RegExTest {

	/**
	 * testPattern method checks whether the word has a specific property by using
	 * the pattern class to match with the regEx 
	 * @param 		regEx 		Regular Expression to match the String with.
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */

    public static void testPattern(String regEx, String aString, String comment ) {
		if ( Pattern.matches(regEx, aString) )	{
			System.out.println("RegEx Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + regEx );
			System.out.println("\t" + comment);
		}
    }

	/**
	 * testOwn1 method checks whether string has 'a' as the part of the word  
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */   

    public static void testOwn1(String aString, String comment ) {
		if ( aString.indexOf('a') >= 0)	{
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}

	}	

	/**
	 * testOwn2 method checks whether a palindrome is anchored at the begining
	 * and end of word.  
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */

	public static void testOwn2(String aString, String comment ) {
		int p=0;
		String bString = new StringBuffer(aString).reverse().toString();

		for(int i=0; i<aString.length()-1;i++){
			if(aString.charAt(i)==bString.charAt(i))
				p++;
		}
		if(p==aString.length()-1){
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}

    }

	/**
	 * testOwn3 method checks whether a palindrome of two is present in the string.  
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */  

	public static void testOwn3(String aString, String comment ) {
		int p=0;
		for(int i=0; i<aString.length()-1;i++){
			if(aString.charAt(i)==aString.charAt(i+1))
				p++;
		}
		if(p>0){
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}
    }

	/**
	 * testOwn4 method checks whether a palindrome of three  is present in the string.
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */

	public static void testOwn4(String aString, String comment ) {
		int p=0;
		for(int i=2; i<aString.length();i++){
			if(aString.charAt(i)==aString.charAt(i-2)){
				p++;
			}
		}
		if(p>0){
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}

    }

	/**
	 * testOwn6 method checks whether a Word includes only  a's or b's
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */ 

	public static void testOwn6(String aString, String comment ) {
		boolean ans=true;
		for(int i=0; i<aString.length();i++){
			if(aString.charAt(i)!='a'&& aString.charAt(i)!='b')
				ans=false;	
		}
		if(ans){
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}
    }

	/**
	  * testOwn7 method checks whether a Word does not includes a's or b's
	  * @param 		aString 	String to be evaluated for a pattern.
	  * @param 		comment 	Description about the pattern matched.
	  * @return 		void		The method does not return any type. 
	  */  

	public static void testOwn7(String aString, String comment ) {
		boolean ans=true;
		for(int i=0; i<aString.length();i++){
			if(aString.charAt(i)=='a' || aString.charAt(i)=='b')
				ans=false;

				
		}
		if(ans){
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}
    }

	/**
	 * testOwn8 method checks whether word is = " . "
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */  

    public static void testOwn8(String aString, String comment ) {
		if ( aString.indexOf('.') >= 0 && aString.length() == 1)	{
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}

	}

	/**
	 * testOwn9 method checks whether word has " . " in it
	 * @param 		aString 	String to be evaluated for a pattern.
	 * @param 		comment 	Description about the pattern matched.
	 * @return 		void		The method does not return any type. 
	 */  
    public static void testOwn9(String aString, String comment ) {
		if ( aString.indexOf('.') >= 0)	{
			System.out.println("Own Test:");
			System.out.println("\tInput line: " + aString);
			System.out.println("\t" + comment);
		}
	}

	/**
	 * main method
	 * @param 		args 		Command line arguments 
	 * @return 		void		The method does not return any type. 
	 */
    public static void main( String[] args ) {

		String aString;
		String bString;
		String cString;
		String fString;

	    Scanner scan = null;

		try{
	    	scan = new Scanner(new File("data.txt"));
	    	while(scan.hasNextLine()){
	    		aString=scan.nextLine();
				bString="";
				cString="";
				fString="";
				Pattern aPattern;

				int j=aString.length();	
				//Create a RegEx for the given string to check for a palindrome	
				for(int i=0;i<aString.length();i++) {
					bString=bString + "(.?)";
					cString=cString+"\\"+j;
					j--;
				}
				
				//For string of length 1
				if(aString.length()==1){
					fString=bString;
				}

				//For an even length string
				else if(aString.length()/2==0) {
					fString=bString+cString;
				}
				//For an odd length string
				else{
					fString=bString+".?"+cString;
				}

				testPattern(".*a+.*", aString, "string has 'a' as a part of the word ");
				testOwn1(aString, "string has 'a' as a part of the word ");

		        testPattern(fString, aString, "palindrome anchored at the begining and end of word ");
				testOwn2(aString, "palindrome anchored at the begining and end of word");

				testPattern(".*([a-zA-Z])\\1.*", aString, "palindrome of 2  ");
				testOwn3(aString, "palindrome of 2 ");	
				testPattern(".*([a-zA-Z])(.)\\1.*", aString, "palindrome of 3  ");
				testOwn4(aString, "palindrome of 3 ");
				testPattern(".*a+.*", aString, "string has at least one a ");
				testOwn1(aString, "string has at least one a ");
				testPattern("(a|b)*", aString, "Word includes only of a's or b's  ");
				testOwn6(aString, "Word includes only of a's or b's");
				testPattern("[^ab]+", aString, "Word does not include any a's or b's  ");
				testOwn7(aString, "Word does not include any a's or b's"); 
				testPattern("[.]", aString, "Word is == '.' ");
				testOwn8(aString, "Word is == '.'");		
				testPattern(".*[.].*", aString, "Word has  '.' ");
				testOwn9(aString, "Word has '.'");	

			}
		}

		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}