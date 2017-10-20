import static org.junit.Assert.*;

import org.junit.Test;

public class DevTask1Test {

	@Test
	public void testPut() {
		
	}
	
	@Test
    public void testDelete() {
        DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
        bst.delete(1);
        assertEquals("Deleting from empty tree", 0, bst.height());
        
        bst.put(7, 7);   //        _7_
        bst.put(8, 8);   //      /     \
        bst.put(3, 3);   //    _3_      8
        bst.put(1, 1);   //  /     \
        bst.put(2, 2);   // 1       6
        bst.put(6, 6);   //  \     /
        bst.put(4, 4);   //   2   4
        bst.put(5, 5);   //        \
                         //         5
        
    }
	
	@Test
	public void testHeight()
	{
		
	}
	
	@Test
	public void testIsEmpty()
	{
		
	}
	
	@Test
	public void testSize()
	{
		
	}
	
	@Test
	public void testContains()
	{
		
	}
	
	@Test
	public void testLowestCommonAncestor()
	{
		
	}
}
