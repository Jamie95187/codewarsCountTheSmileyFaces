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
