package leetcode;

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return areSame(p, q);
	}

	private boolean areSame(TreeNode a, TreeNode b) {
		if (a == null && b == null) {
			return true;
		}
		if (a == null || b == null) {
			return false;
		}
		if (a.val != b.val) {
			return false;
		}

		return areSame(a.left, b.left) && areSame(a.right, b.right);
	}
}
