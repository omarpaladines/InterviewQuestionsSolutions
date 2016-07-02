package chapter1;
import static org.junit.Assert.*;
import org.junit.Test;

public class OneAwayTest {
	OneAway oneAway = new OneAway();
	
	@Test
	public void oneDeleteTest() {
		assertTrue(oneAway.oneEdit("pale", "ple"));
	}
	
	@Test
	public void oneInsertTest() {
		assertTrue(oneAway.oneEdit("ple", "pale"));
	}
	
	@Test
	public void oneDeleteTest2() {
		assertTrue(oneAway.oneEdit("pales", "pale"));
	}
	
	@Test
	public void oneReplaceTest() {
		assertTrue(oneAway.oneEdit("pale", "bale"));
	}
	
	@Test
	public void twoReplaceTest() {
		assertFalse(oneAway.oneEdit("pale", "bake"));
	}
	
	@Test
	public void tooLongTest() {
		assertFalse(oneAway.oneEdit("pales", "pal"));
	}

}
