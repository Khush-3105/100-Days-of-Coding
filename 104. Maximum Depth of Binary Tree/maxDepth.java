class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = 0, right = 0;
        if(root.left != null) {
            left = maxDepth(root.left);
        }
        if(root.right != null) {
            right = maxDepth(root.right);
        }
        return Math.max(left, right) + 1;
    }
}