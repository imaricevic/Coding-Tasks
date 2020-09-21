package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given a binary tree, find its maximum depth.
 * 
 *         The maximum depth is the number of nodes along the longest path from
 *         the root node down to the farthest leaf node.
 * 
 *         Note: A leaf is a node with no children.
 */
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		return getDepth(root, 1);
	}

	private int getDepth(TreeNode node, int depth) {
		int left = depth, right = depth;
		if (node.left != null) {
			left = getDepth(node.left, depth + 1);
		}
		if (node.right != null) {
			right = getDepth(node.right, depth + 1);
		}

		return right > left ? right : left;
	}
}
