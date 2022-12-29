class Main {

    public static void main(String[] args) {

        List theTree = new List();

        System.out.println("sayilar:");
        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random() * 100);
            System.out.println("\n" + sayi);
            theTree.insert(sayi);
        }
        ;

        System.out.println("\n  agacin inorder dolasilmasi ");
        theTree.inOrder(theTree.getRoot());
        System.out.println("\n  agacin oreorder dolasilmasi ");
        theTree.preOrder(theTree.getRoot());
        System.out.println("\n  agacin postorder dolasilması  ");
        theTree.postOrder(theTree.getRoot());

    }

}
