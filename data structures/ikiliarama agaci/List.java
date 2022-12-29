public class List {

    private TreeNode root;

    public List() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftchild);
            preOrder(localRoot.righchild);
        }
    }

    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftchild);
            localRoot.displayNode();
            inOrder(localRoot.righchild);
        }
    }

    public void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftchild);
            postOrder(localRoot.righchild);
            localRoot.displayNode();
        }
    }

    public void insert(int newdata) {
        TreeNode newNode = new TreeNode();
        newNode.data = newdata;
        if (root == null)
            root = newNode;
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (newdata < current.data) {
                    current = current.leftchild;
                    if (current == null) {
                        parent.leftchild = newNode;
                        return;
                    }
                } else {
                    current = current.righchild;
                    if (current == null) {
                        parent.righchild = newNode;
                        return;
                    }
                }
            }
        }
    }

}
