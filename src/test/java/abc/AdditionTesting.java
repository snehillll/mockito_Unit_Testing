package abc;


import org.junit.jupiter.api.AfterAll; 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AdditionTesting {
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("Before all the test cases");
	}
	
	
	@BeforeEach
	public void beforeeach() {
		System.out.println(" Before each test");
	}
	
	
	@Test
	public void testAddition1() {
		Addition obj = new Addition();
		assertEquals(0, obj.addition(0, 0));
		System.out.println("  Test 1");
	}
	
	private void assertEquals(int i, int addition) {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void testAddition2() {
		Addition obj = new Addition();
		assertEquals(30, obj.addition(10, 20));
		System.out.println("  Test 2");
	}
	
	@Test
	public void testAddition3() {
		Addition obj = new Addition();
		assertEquals(40, obj.addition(20, 20));
		System.out.println("  Test 3");
	}
	
	@Test
	public void testAddition4() {
		Addition obj = new Addition();
		assertEquals(100, obj.addition(50, 50));
		System.out.println("  Test 4");
	}
	
	@AfterEach
	public void aftereach() {
		System.out.println(" after each teast case");
	}
	
	@AfterAll
	public static void afterall() {
		System.out.println("After all the test cases");
	}
}