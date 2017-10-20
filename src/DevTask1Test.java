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
		assertEquals("Checking the size() function for an empty tree", 0, bst.size());
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking the size() function for a non-empty tree", 3, bst.size());
	}
	
	@Test
	public void testContains()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		assertEquals("Checking the contains() function for an empty tree", false, bst.contains(5));
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(7));
	    assertEquals("Checking the contains() function for a non-empty tree", false, bst.contains(1));
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(8));
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(3));
	}
	
	@Test
	public void testDelete()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.put(7, 7);
	    bst.put(8, 8);
	    bst.put(3, 3);
	    assertEquals("Checking if key 3 is present", true, bst.contains(3));
	    bst.delete(3);
	    assertEquals("Checking if key 3 was deleted", false, bst.contains(3));
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
        assertEquals("Checking the lowestCommonAncestor of a non-empty tree", 7, (int)bst.lowestCommonAncestor(2, 1));
	}
}
