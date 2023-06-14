public class BinaryTree<T> {
    private TreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    private static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(T data) {
        root = insertNode(root, data);
    }

    private TreeNode<T> insertNode(TreeNode<T> root, T data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertNode(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public boolean contains(T data) {
        return containsNode(root, data);
    }

    private boolean containsNode(TreeNode<T> root, T data) {
        if (root == null) {
            return false;
        }

        if (data.equals(root.data)) {
            return true;
        } else if (data.compareTo(root.data) < 0) {
            return containsNode(root.left, data);
        } else {
            return containsNode(root.right, data);
        }
    }
}
