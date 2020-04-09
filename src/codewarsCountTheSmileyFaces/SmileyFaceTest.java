package codewarsCountTheSmileyFaces;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SmileyFaceTest {

	@Test
	public void countSmileyFacesTest_2ValidSmileys_return2() {
		List<String> a = new ArrayList<String>();
        a.add(":)");
        assertEquals(1, SmileyFace.countSmileys(a));
    }

}
