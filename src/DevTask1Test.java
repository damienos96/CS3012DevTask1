import static org.junit.Assert.*;

import org.junit.Test;

public class DevTask1Test {

	@Test
	public void testAddEdge() {
		DevTask1 dag = new DevTask1(3);
		dag.addEdge(7, 7, 0);
	    dag.addEdge(8, 8, 0);
	    dag.addEdge(3, 3, 0);
	    /*assertEquals("Checking the addEdge() function", true, dag.contains(7));
	    assertEquals("Checking the addEdge() function", true, dag.contains(3));
	    assertEquals("Checking the addEdge() function", true, dag.contains(8));*/
	}
	
	@Test
	public void testRemoveEdge()
	{
		
	}
	
	@Test
	public void testGetOutEdge()
	{
		
	}
	
	@Test
	public void testGetWeight()
	{
		
	}
	
	@Test
	public void testGetListOfAdjacencyList()
	{
		
	}
	
	@Test
	public void testGetInEdgesCount()
	{
		
	}
	
	@Test
	public void testLowestCommonAncestor()
	{
		
	}
}
