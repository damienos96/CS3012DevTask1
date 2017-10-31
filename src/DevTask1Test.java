import static org.junit.Assert.*;

import org.junit.Test;

public class DevTask1Test {

	@Test
	public void testInsertNode() {
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.insertNode(7, 7);
	    bst.insertNode(8, 8);
	    bst.insertNode(3, 3);
	    assertEquals("Checking the insertNode() function", true, bst.contains(7));
	    assertEquals("Checking the insertNode() function", true, bst.contains(3));
	    assertEquals("Checking the insertNode() function", true, bst.contains(8));
	}
	
	@Test
	public void testContains()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		assertEquals("Checking the contains() function for an empty tree", false, bst.contains(5));
		bst.insertNode(7, 7);
	    bst.insertNode(8, 8);
	    bst.insertNode(3, 3);
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(7));
	    assertEquals("Checking the contains() function for a non-empty tree", false, bst.contains(1));
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(8));
	    assertEquals("Checking the contains() function for a non-empty tree", true, bst.contains(3));
	}
	
	@Test
	public void testDelete()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.insertNode(7, 7);
	    bst.insertNode(8, 8);
	    bst.insertNode(3, 3);
	    assertEquals("Checking if key 3 is present", true, bst.contains(3));
	    bst.delete(3);
	    assertEquals("Checking if key 3 was deleted", false, bst.contains(3));
	}
	
	@Test
	public void testLowestCommonAncestor()
	{
		DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
		bst.insertNode(7, 7);
	    bst.insertNode(8, 8);
	    bst.insertNode(3, 3);
	    bst.insertNode(1, 1);
        bst.insertNode(2, 2);
        bst.insertNode(6, 6);
        assertEquals("Checking the lowestCommonAncestor of a non-empty tree", 7, (int)bst.lowestCommonAncestor(7, 6));
	}
}
