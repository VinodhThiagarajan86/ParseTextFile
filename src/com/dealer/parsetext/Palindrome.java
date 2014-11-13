package com.dealer.parsetext;

public class Palindrome {
	/**
	 * @param This method checks if the given String is Palindrome
	 */
	public static void main(String[] args) {
		
			//Set the input String ( this is a positive flow)
		    String inputString = "Ah, Satan sees Natasha";
		    //Set the input String ( this is a negative flow)
		    // String inputString = "Ah, Satan sees Nsha";
		 
		    //Remove all the alphaNumeric and make is Lower or UpperCase to Ease comparison
		    String nonAlphaString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		    
		    //Print the result
		    System.out.println("Is this String '"+inputString+ "' a Palindrome ? : "+isPalindrome(nonAlphaString));
	}
	
	
	/**
	 * On providing a String this function will asses if its a Palindrome or not
	 * @param toTestThisString
	 * @return
	 */
	public static boolean isPalindrome(String toTestThisString){
		boolean isPalindrome = false;
		int length  = toTestThisString.length();
	    int i, begin, end, middle;
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	    for (i = begin; i <= middle; i++) {
	      if (toTestThisString.charAt(begin) == toTestThisString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	    	isPalindrome = true;
	    }
	    else {
	    	isPalindrome = false;
	    }   
		return isPalindrome;
	}
}
