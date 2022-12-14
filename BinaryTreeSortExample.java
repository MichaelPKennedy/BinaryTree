import java.util.Random;

public class BinaryTreeSortExample {
	public static void main(String[] args) throws Exception {
		int numNodes = 1000000;
		BinaryTree tree = new BinaryTree();
		long start = System.currentTimeMillis();
		Random rand = new Random();
		for (int i=0; i<numNodes; i++) {
			int number = rand.nextInt(1000000);
			tree.insert(number);

		}
		System.out.println("number found? "+ tree.search(7));
		System.out.println("Height of tree = "+ tree.height(tree.root));
		
		long runtime = System.currentTimeMillis() - start;
		System.out.println("Runtime of the recursive insert for " + numNodes + " nodes was " +runtime + " milliseconds");
		
		
	}
}