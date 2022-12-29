class main{

    public static void main (String[] args)
    {
        ikiliAgac tree = new ikiliAgac();
        tree.insert(20);
        tree.insert(18);
        tree.insert(32);
        tree.insert(15);
        tree.insert(19);
        tree.insert(40);
        tree.insert(25);
        tree.insert(30);
        System.out.print("Inorder sonucu: ");
        tree.printInorder(tree.root);//sol-->kök-->sağ
        System.out.println("");
        System.out.print("Predorder sonucu: ");
        tree.printPreorder(tree.root);//kök-->sol-->sağ
        System.out.println("");
        System.out.print("Postorder sonucu: ");
        tree.printPostorder(tree.root);//sol-->sağ-->kök
        System.out.println("");
        //System.out.println("Minimum değer= "+ tree.min(tree.root));
        System.out.println("");
        //System.out.println("maximum değer= "+ tree.max(tree.root));
        //tree.search(18);
    }
}