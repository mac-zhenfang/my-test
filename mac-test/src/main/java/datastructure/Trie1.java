/**
 * 
 */
package datastructure;

/**
 * Use Array to
 * 
 * @author zhefang
 * 
 */
public class Trie1 {

	Node root;
	static int MAX_NUM = 26;

	public Trie1() {
		init();
	}

	private Node createNewNode(char ch) {
		Node n = new Node(ch);
		return n;
	}

	int charToIndex(char ch) {
		return ch - 'a';
	}

	private void init() {
		root = createNewNode(' ');
	}

	public void insert(String s) {
		Node n = root;
		int len = s.length();
		char[] chs = s.toCharArray();
		int i = 0;
		while (i < len) {
			Node chNode = n.child[charToIndex(chs[i])];
			if (chNode == null) {
				chNode = createNewNode(chs[i]);
				n.child[charToIndex(chs[i])] = chNode;
			}
			n = chNode;
			i++;
		}
		n.setCompleted();
	}

	public boolean find(String s) {
		Node n = root;
		char[] chs = s.toCharArray();
		int len = s.length();
		int i = 0;
		while (i < len) {
			if (n.child[charToIndex(chs[i])] == null) {
				break;
			}
			n = n.child[charToIndex(chs[i])];
			i++;
		}
		// System.out.println(i);
		return (i == len);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie1 trie = new Trie1();
		trie.insert("test");
		System.out.println(trie.find("te"));
	}

}

class Node {
	NODE_TYPE type;
	char ch;
	Node[] child = new Node[Trie1.MAX_NUM];

	public Node(char ch) {
		this.ch = ch;
		type = NODE_TYPE.UNCOMPLETED;
	}
	
	public boolean isCompleted(){
		return 0 == type.compareTo(NODE_TYPE.COMPLETED);
	}

	public void setCompleted() {
		type = NODE_TYPE.COMPLETED;
	}

	public boolean compare(Node dest) {
		return (this.ch == dest.ch) && (dest.type == this.type);
	}

	public boolean isRoot() {
		return this.ch == ' ';
	}
}

enum NODE_TYPE {
	COMPLETED, UNCOMPLETED;
}