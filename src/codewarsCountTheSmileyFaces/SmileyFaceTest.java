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
        array.clear();
        array.add(":)");
        array.add(":[");
        assertEquals(1, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_2ValidSmileys_return2() {
        array.add(":)");
        assertEquals(1, SmileyFace.countSmileys(array));
        array.add(":-D");
        assertEquals(2, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_3ValidSmileysOutOf4_return2() {
        array.add(":)");
        assertEquals(1, SmileyFace.countSmileys(array));
        array.add(":-D");
        assertEquals(2, SmileyFace.countSmileys(array));
        array.add(":D");
        assertEquals(3, SmileyFace.countSmileys(array));
        array.add(":-(");
        assertEquals(3, SmileyFace.countSmileys(array));
    }

	@Test
	public void countSmileyFacesTest_2ValidSmileysOutOf4_return2() {
        array.add(":)");
        array.add(";(");
        array.add(";}");
        array.add(":-D");
        assertEquals(2, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_3ValidSmileysOutOf4_return3() {
        array.add(";D");
        array.add(":-(");
        array.add(":-)");
        array.add(";~)");
        assertEquals(3, SmileyFace.countSmileys(array));
    }
	
	@Test
	public void countSmileyFacesTest_1ValidSmileysOutOf4_return3() {
        array.add(";]");
        array.add(":[");
        array.add(";*)");
        array.add(";-D");
        assertEquals(1, SmileyFace.countSmileys(array));
    }
}
