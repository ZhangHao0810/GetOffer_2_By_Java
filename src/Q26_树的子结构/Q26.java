package Q26_树的子结构;

/**
 * @author ZhangHao
 * @date 2020/3/10 10:47
 * @Description：  判断root2 是不是 root1 的子树.
 */
public class Q26 {
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSubTreeWithRoot(root1, root2) || hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }

    private boolean isSubTreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val!=root2.val)
            return false;
        return isSubTreeWithRoot(root1.left, root2.left) && isSubTreeWithRoot(root1.right, root2.right);
    }
}
