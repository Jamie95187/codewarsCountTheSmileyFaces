# Count the smiley faces!

Solving [this](https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java) codewars challenge.

## Description

Given an array (arr) as an argument complete the function `countSmileys` that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as `:` or `;`
-A smiley face can have a nose but it does not have to. Valid characters for a nose are `-` or `~`
-Every smiling face must have a smiling mouth that should be marked with either `)` or `D`.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
`:) :D ;-D :~)`
Invalid smiley faces:
`;( :> :} :]`

## Examples

```
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
```

**Note**: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same

## Tests

Using Junit 4 and testing in the eclipse IDE.

```
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
```



