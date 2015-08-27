package edu.westga.cs6910.nim.tests.strategies;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.nim.model.strategies.ExpertStrategy;

/**
 * JUnit tests for ExpertStrategy
 * @author Christina Bill
 * @version Summer 2014
 *
 */
public class WhenExpertStrategyDeterminesHowManySticks {
	
private ExpertStrategy expert;
	
	private void setUp(){
		expert = new ExpertStrategy();
	}

	@Test
	public void testShouldReturn1IfPileIs2() {
		this.setUp();
		assertEquals(1, expert.howManySticks(2));
		
	}
	

	@Test
	public void testShouldReturn2IfPileIs3() {
		this.setUp();
		assertEquals(2, expert.howManySticks(3));
		
	}	
	
	@Test
	public void testShouldReturn3IfPileIs4() {
		this.setUp();
		assertEquals(3, expert.howManySticks(4));
		
	}
	
	@Test
	public void testShouldReturn3IfPileIs20() {
	this.setUp();
	assertEquals(3, expert.howManySticks(20));
	
	}
	
	@Test
	public void testShouldReturn2IfPileIs19() {
	this.setUp();
	assertEquals(2, expert.howManySticks(19));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs18() {
	this.setUp();
	assertEquals(1, expert.howManySticks(18));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs17() {
	this.setUp();
	assertEquals(1, expert.howManySticks(17));
	
	}
	
	@Test
	public void testShouldReturn2IfPileIs15() {
	this.setUp();
	assertEquals(2, expert.howManySticks(15));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs9() {
	this.setUp();
	assertEquals(1, expert.howManySticks(9));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs5() {
	this.setUp();
	assertEquals(1, expert.howManySticks(5));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs13() {
	this.setUp();
	assertEquals(1, expert.howManySticks(13));
	
	}
	
	@Test
	public void testShouldReturn2IfPileIs11() {
	this.setUp();
	assertEquals(2, expert.howManySticks(11));
	
	}
	
	@Test
	public void testShouldReturn2IfPileIs7() {
	this.setUp();
	assertEquals(2, expert.howManySticks(7));
	
	}
	
	@Test
	public void testShouldReturn1IfPileIs6() {
	this.setUp();
	assertEquals(1, expert.howManySticks(6));
	
	}
	

}

