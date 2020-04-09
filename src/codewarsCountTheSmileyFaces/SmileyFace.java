/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	09/04/2020
 */


package codewarsCountTheSmileyFaces;

import java.util.List;

public class SmileyFace {

	static int countSmileys(List<String> array) {
		int count = 0;
		for(String smiley : array) {
			if(smiley.length() == 2) {
				if(smiley.matches("[;|:][)|D]")) {
					count++;
				}
			} else if (smiley.length() == 3) {
				if(smiley.matches("[;|:][-|~][)|D]")) {
					count++;
				}
			}
		}
		return count;
	}
	
}
