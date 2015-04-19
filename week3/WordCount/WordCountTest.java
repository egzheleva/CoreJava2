import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

	private static WordCountResult wc;

	@Before
	public void setUp() throws Exception {
		wc = new WordCountResult("lq.txt");
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testWordCount() throws IOException {
		int result = wc.getWordCount();
		assertEquals(2, result);
	}
	
	@Test
	public void testCharCount() throws IOException {
		int result = wc.getCharacterCount();
		assertEquals(6, result);
	}

	@Test
	public void testLineCount() throws IOException {
		int result = wc.getLineCount();
		assertEquals(2, result);
	}
}
