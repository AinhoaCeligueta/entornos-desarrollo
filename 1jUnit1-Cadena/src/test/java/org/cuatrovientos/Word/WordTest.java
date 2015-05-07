/**
 * 
 */
package org.cuatrovientos.Word;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ainhoa Celigueta
 *
 */
public class WordTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.Word.Word#length(java.lang.String)}.
	 */
	@Test
	public void testLength() {
		Word target = new Word();
		int expectedLength = 5;
		int actualLength = target.length("hello");
		
		assertEquals("Length is correct", expectedLength, actualLength);
		
		expectedLength = 0;
		actualLength = target.length("");
		
		assertEquals("Length is correct when 0", expectedLength, actualLength);

		expectedLength = 0;
		actualLength = target.length(null);
		
		assertEquals("Length is correct when null", expectedLength, actualLength);
	}

	/**
	 * Test method for {@link org.cuatrovientos.Word.Word#vowels(java.lang.String)}.
	 */
	@Test
	public void testVowels() {
		Word target = new Word();
		int actualLength = 0;
		int expectedLengths [] = {2,1,3};
		String testingString [] = {"hello","bye","aloha"};
		
		for (int i = 0; i<expectedLengths.length;i++){
			actualLength = target.vowels(testingString[i]);
			assertEquals("Vowel number is correct", expectedLengths[i], actualLength);
		}
		
		int expectedLength = 0;
		actualLength = target.length("");
		
		assertEquals("Vowel number is correct when 0", expectedLength, actualLength);
	}

	/**
	 * Test method for {@link org.cuatrovientos.Word.Word#reverse(java.lang.String)}.
	 */
	@Test
	public void testReverse() {
		Word target = new Word();
		String expected = "MURDER";
		String actual = target.reverse("REDRUM");
		
		assertEquals("Testing reverse", expected, actual);
	}

	/**
	 * Test method for {@link org.cuatrovientos.Word.Word#contarLetra(java.lang.String, char)}.
	 */
	@Test
	public void testCountChar() {
		Word target = new Word();
		int expected = 2;
		int actual = target.countChar("Balloon",'o');
		
		assertEquals("Testing count char", expected, actual);
		
		expected = 0;
		actual = target.countChar("",'o');
		assertEquals("Testing count char with empty String", expected, actual);
	}

}
