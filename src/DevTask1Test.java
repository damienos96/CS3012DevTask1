import static org.junit.Assert.*;

import org.junit.Test;

public class DevTask1Test {

	@Test
	public void test() {
		
	}
	
	@Test
    public void testDelete() {
        DevTask1<Integer, Integer> bst = new DevTask1<Integer, Integer>();
        bst.delete(1);
        assertEquals("Deleting from empty tree", "()", bst.printKeysInOrder());
        
        bst.put(7, 7);   //        _7_
        bst.put(8, 8);   //      /     \
        bst.put(3, 3);   //    _3_      8
        bst.put(1, 1);   //  /     \
        bst.put(2, 2);   // 1       6
        bst.put(6, 6);   //  \     /
        bst.put(4, 4);   //   2   4
        bst.put(5, 5);   //        \
                         //         5
        
        assertEquals("Checking order of constructed tree",
                "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder());
        
        bst.delete(9);
        assertEquals("Deleting non-existent key",
                "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder());

        bst.delete(8);
        assertEquals("Deleting leaf", "(((()1(()2()))3((()4(()5()))6()))7())", bst.printKeysInOrder());

        bst.delete(6);
        assertEquals("Deleting node with single child",
                "(((()1(()2()))3(()4(()5())))7())", bst.printKeysInOrder());

        bst.delete(3);
        assertEquals("Deleting node with two children",
                "(((()1())2(()4(()5())))7())", bst.printKeysInOrder());
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
	public void testPut()
	{
		
	}
}
