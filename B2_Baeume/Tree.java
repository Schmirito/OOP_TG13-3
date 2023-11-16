package B2_Baeume;


public class Tree {
    Node root;
    Node parent;
    public Tree() {
        root = null;
    }

    public void insert(int value) {

        if (root == null) {
            root = new Node(value);

        } else {

            insert(root, value);
        }

    }

    private void insert(Node parent, int value) {
        if (parent.value >= value) {
            if (parent.left == null) {
                parent.left = new Node(value);

            } else {
                insert(parent.left, value);
            }
        } else {
            if (parent.value < value) {
                if (parent.right == null) {
                    parent.right = new Node(value);
                } else {
                    insert(parent.right, value);
                }

            }
        }

    }

    public int height() {
        int l = 0;
        int r = 0;

        if (root.left != null) {
            l = height(root.left) + 1;
        }
        if (root.right != null) {
            r = height(root.left) + 1;
        }
        return 0;

    }

    private int height(Node parent)
    {
        int l=0;
        int r=0;
        if (parent.left != null) {
            l = height(parent.left) + 1;
        }
        if (parent.right != null) {
            r = height(parent.left) + 1;
        }

        return Math.max(l, r);
    }

    public int amount() {
        if (root == null) {
            return 0;

        } else {
            return 1 + amount(root.left) + amount(root.right);
        }
    }

    public int amount(Node parent) {
        if (root == null) {
            return 0;

        } else {
            return 1 + amount(root.left) + amount(root.right);
        }
    }

}
