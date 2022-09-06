package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static long fibonazzi(byte N) {
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else {
			return fibonazzi((byte) (N - 1)) + fibonazzi((byte) (N - 2));
		}
	}


	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

}
