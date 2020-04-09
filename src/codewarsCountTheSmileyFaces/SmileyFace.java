package codewarsCountTheSmileyFaces;

import java.util.List;

public class SmileyFace {

	static int countSmileys(List<String> array) {
		for(String smiley : array) {
			if(smiley.contains("(")) {
				return array.size() - 1;
			}
		}
		return array.size();
	}
	
}
