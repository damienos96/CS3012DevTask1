//import java.util.Collection;
import java.util.List;

public class DevTask1<Key extends Comparable<Key>, Value>
{
	private final int V;
	private List<Key>[] adj;
	private boolean[] marked;
	
	public DevTask1(int V)
	{
		this.V = V;
		adj = (List<Key>[]) new List[V];
		marked = new boolean[this.V];
	}
	
	public void addEdge(int v, Key w)
	{
		adj[v].add(w);
	}
	
	public void depthFirstSearch(int v)
	{
		marked[v] = true;
		for(int w = 0; w < adj.length; w++)
		{
			if(!marked[w])
			{
				depthFirstSearch(w);
			}
		}
	}
	
	public boolean visited(int v)
	{
		return marked[v];
	}
	
	public Key lowestCommonAncestor(int a)
	{
		return null;
	}
}