//import java.util.Collection;
import java.util.List;

public class DevTask1<Key extends Comparable<Key>, Value>
{
	private final int V;
	private List<Key>[] adj;
	
	public DevTask1(int V)
	{
		this.V = V;
		adj = new List[V];
	}
	
	public void addEdge(int v, Key w)
	{
		adj[v].add(w);
	}
	
	public Key lowestCommonAncestor(int a)
	{
		return null;
	}
}