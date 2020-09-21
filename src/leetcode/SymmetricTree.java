package leetcode;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return recursive(root.left, root.right);
	}

	private boolean recursive(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null || right == null) {
			return false;
		}

		// both not null
		if (left.val != right.val) {
			return false;
		}
		return recursive(left.left, right.right) && recursive(left.right, right.left);
	}

}
