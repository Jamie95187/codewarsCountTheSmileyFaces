package codewarsCountTheSmileyFaces;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SmileyFaceTest {

	List<String> array = new ArrayList<String>();
	
	@Before
	public void setUp() {
		array.clear();
	}
	
	@Test
	public void countSmileyFacesTest_1ValidSmiley_return1() {
        array.add(":)");
        assertEquals(1, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_1ValidSmileyOutOf2_return1() {
        array.add(":)");
        array.add(":(");
        assertEquals(1, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_2ValidSmileys_return2() {
        array.add(":)");
        assertEquals(1, SmileyFace.countSmileys(array));
        array.add(":-D");
        assertEquals(2, SmileyFace.countSmileys(array));
    }

}
