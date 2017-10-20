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
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testIsEmpty()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testSize()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testContains()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testDelete()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testFloor()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
	
	@Test
	public void testLowestCommonAncestor()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    bst.put(1, 1);
	    bst.put(2, 2);
	    bst.put(6, 6);
	    bst.put(4, 4);
	    bst.put(5, 5);
	}
}
