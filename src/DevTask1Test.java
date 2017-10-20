import static org.junit.Assert.*;

import org.junit.Test;

public class DevTask1Test {

	@Test
	public void testPut() {
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking the put() function", true, bst.contains(7));
	    assertEquals("Checking the put() function", true, bst.contains(3));
	    assertEquals("Checking the put() function", true, bst.contains(8));
	}
	
	@Test
	public void testHeight()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		assertEquals("Checking the height() function for an empty tree", -1, bst.height());
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking the height() function for a non-empty tree", 1, bst.height());
	}
	
	@Test
	public void testIsEmpty()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		assertEquals("Checking the isEmpty() function for an empty tree", true, bst.isEmpty());
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking the isEmpty() function for a non-empty tree", false, bst.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    
	}
	
	@Test
	public void testContains()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    
	}
	
	@Test
	public void testDelete()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    
	}
	
	@Test
	public void testFloor()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    
	}
	
	@Test
	public void testLowestCommonAncestor()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    
	}
}
