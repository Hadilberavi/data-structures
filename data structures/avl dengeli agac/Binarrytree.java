class Binarrytree{
    Node root;

    public Node getRoot(){   // 
        return root;
    }
    int height(Node node){    // anlamadim
        if (node == null)
        return 0;
        return 1 + Math.max(height(node.left),height(node.right));
    }


    //dengeli mi değil mi

    boolean isBalanced(Node node){ 
        int lh;
        int rh;
        if(node == null)
        return true;
        lh = height(node.left);
        rh = height(node.right);
        if( Math.abs(lh-rh)<=1 && isBalanced(node.left) && isBalanced(node.right))   //  abs mutlak deger ve burda sarti verdi
        return true;
        return false;
    }

       public void inorder(Node localRoot){     // left root right
        if(localRoot!=null)
        {
            inorder(localRoot.left);   
            localRoot.displaynode();   
            inorder(localRoot.right);

        }


    }

    public void preorder(Node localRoot) {  // kok left right
        if (localRoot != null) {
            localRoot.displaynode();   
            preorder(localRoot.left);
            preorder(localRoot.right);
        }
    }

    public void postorder(Node localRoot) {  // left right kok
        if (localRoot != null) {
            postorder(localRoot.left);
            postorder(localRoot.right);
            localRoot.displaynode();  // yazdirmak icin
        }
    }

}