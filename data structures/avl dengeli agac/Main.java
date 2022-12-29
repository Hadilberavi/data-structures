public class Main {

    public static void main(String[] args){
    Binarrytree tree = new Binarrytree();   // tree adinda bir node
    tree.root =new Node(10);
    tree.root.left = new Node(7);
    tree.root.right = new Node(15);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(8);
    tree.root.left.right = new Node(18);
    tree.root.left.right.right = new Node(20);

    System.out.println("\n inorderin dolasmasi");
    tree.inorder(tree.getRoot());// inorderdeki kokleri yazdirma

    System.out.println("\n preorderin dolasmasi");
    tree.preorder(tree.getRoot());    // preorder koklerini yazdirma

    System.out.println("\n preorderin dolasmasi");
    tree.postorder(tree.getRoot());    // preorder koklerini yazdirma

    if ( tree. isBalanced(tree.root))
    System.out.println("dengeli agac");
    else
    System.out.println("dengesiz agac");
    
}
}   
