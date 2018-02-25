package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<Character> myStack = new Stack<Character>();
	int openclose = 0;

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
			myStack.add(b.charAt(i));
		}
		for (int i = 0; i < myStack.size(); i++) {
			if (myStack.get(i).toString().contains("{")) {
				openclose++;
			} else {
				openclose--;
				if (openclose < 0) {
					return false;
				}
			}
		}
		if (openclose == 0) {
			return true;
		} else {
			return false;
		}
	}
}