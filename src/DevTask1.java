//import BST.Node;
import java.util.NoSuchElementException;

public class DevTask1<Key extends Comparable<Key>, Value> {
	private Node root;             // root of BST

    /**
     * Private node class.
     */
    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int N;             // number of nodes in subtree

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }
    
    // is the symbol table empty?
    public boolean isEmpty() { return size() == 0; }

    // return number of key-value pairs in BST
    public int size() { return size(root); }

    // return number of key-value pairs in BST rooted at x
    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    /**
     *  Search BST for given key.
     *  Does there exist a key-value pair with given key?
     *
     *  @param key the search key
     *  @return true if key is found and false otherwise
     */
    public boolean contains(Key key) {
        return get(key) != null;
    }
    
    /**
     *  Search BST for given key.
     *  What is the value associated with given key?
     *
     *  @param key the search key
     *  @return value associated with the given key if found, or null if no such key exists.
     */
    public Value get(Key key) { return get(root, key); }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.val;
    }

    /**
     *  Insert key-value pair into BST.
     *  If key already exists, update with new value.
     *
     *  @param key the key to insert
     *  @param val the value associated with key
     */
    
    public void put(Key key, Value val) {
        if (val == null) { delete(key); return; }
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if(x == null)
        {
        	return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
        {
        	x.left  = put(x.left,  key, val);
        }
        else if(cmp > 0)
        {
        	x.right = put(x.right, key, val);
        }
        else
        {
        	x.val   = val;
        }
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Tree height.
     *
     * Asymptotic worst-case running time using Theta notation: TODO
     *
     * @return the number of links from the root to the deepest leaf.
     *
     * Example 1: for an empty tree this should return -1.
     * Example 2: for a tree with only one node it should return 0.
     * Example 3: for the following tree it should return 2.
     *   B
     *  / \
     * A   C
     *      \
     *       D
     */
    public int height() {
    	return height(root);
    }
    
    private int height(Node node) {
    	if(node == null)
    	{
    		return -1;
    	}
    	int heightOfLeftNode = 0;
    	int heightOfRightNode = 0;
    	heightOfLeftNode = height(node.left);
    	heightOfRightNode = height(node.right);
    	if(heightOfLeftNode >= heightOfRightNode)
    	{
    		return 1 + heightOfLeftNode;
    	}
    	else
    	{
    		return 1 + heightOfRightNode;
    	}
    }
    
    /**
     * Deletes a key from a tree (if the key is in the tree).
     * Note that this method works symmetrically from the Hibbard deletion:
     * If the node to be deleted has two child nodes, then it needs to be
     * replaced with its predecessor (not its successor) node.
     *
     * @param key the key to delete
     */
    public void delete(Key key) {
        if (isEmpty() || !contains(key))
        {
      	  return;
        }
        else
        {
        	root = delete(key, root);
        }
    }
      
    private Node delete(Key key, Node x) 
    {
    	int cmp = key.compareTo(x.key);
    	if (cmp < 0) 
    		x.left = delete(key, x.left);
    	else if (cmp > 0) 
    		x.right = delete(key, x.right);
    	else 
    	{
    		if (x.left == null)
    		{
    			return x.right;
    		}
    		if (x.right == null)
    		{
    			return x.left;
    		}
    			 
    		Node t = x;
    		x = floor(t.left, x.key);
    		x.left = deleteMax(t.left);
    		x.right = t.right;
    	}
    	x.N = size(x.left) + size(x.right) + 1;
    	return x;
    }
    
    private Node deleteMax(Node x)
    {
    	if (x.right == null)
    	{
    		return x.left;
    	}
    	x.right = deleteMax(x.right);
    	x.N = 1 + size(x.left) + size(x.right);
    	return x;
    }

    public Node floor (Key key)
    {
    	return floor(root, key);
    }
    
    private Node floor(Node x, Key key)
    {
    	if (x == null) 
    		return null;
    	int cmp = key.compareTo(x.key);
    	if (cmp == 0) 
    		return x;
    	if (cmp < 0) 
    		return floor(x.left, key);
    	else {
    		Node t = floor(x.right, key);
    		if (t != null) 
    			return t;
    		else 
    			return x;
    	}
    }
    
    public Key lowestCommonAncestor(Key p, Key q)
    {
    	return lowestCommonAncestor(this.root, p, q).key;
    }
    
    Node lowestCommonAncestor(Node node, Key n1, Key n2) 
    {
        if (node == null)
        {
        	return null;
        }
        if(node.key.compareTo(n1) > 0 && node.key.compareTo(n2) > 0)
        {
        	return lowestCommonAncestor(node.left, n1, n2);
        }
        if(node.key.compareTo(n1) < 0 && node.key.compareTo(n2) < 0)
        {
        	return lowestCommonAncestor(node.right, n1, n2);
        }
        return node;
    }
}