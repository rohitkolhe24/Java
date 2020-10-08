package com.problems;

import java.util.function.Predicate;

public class DetectCapital {
		
	// Below method complexity is O(n)
	public boolean detectCapitals(String word) {
		int numberOfCapitals = 0;
		boolean flag = false;
		for(int i=0; i<word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				numberOfCapitals++;
			}
		}
		if(numberOfCapitals == word.length() || numberOfCapitals == 0) 
			flag = true;

		if(numberOfCapitals == 1 && Character.isUpperCase(word.charAt(0)))
			flag = true;
		
		return flag;
	}
	
	// Below method complexity is O(n). 
	//But used more advanced way of writing clean code. 
	public boolean detectCapitals2(String word) {
		if(word.length()<=1) return true;
		Predicate<Character> correctCase = Character::isLowerCase;
		if(Character.isUpperCase(word.charAt(0))
				&& Character.isUpperCase(word.charAt(1)) ) {
			correctCase = Character::isUpperCase;
		}
		for(int i=1; i<word.length(); i++) {
			if(!correctCase.test(word.charAt(i))) return false;
		}
		return true;
	}
	
}
