// Binary Search Tree
public class ikiliAgac {
    Node root;
    Node aile;
    private class Node//node(düğüm) yapısı tanımlanır
    {
        private Node parent;//aile bilgisini tutmak için kullanılır
        private Node left;  //nodun sol dalını
        private Node right; //nodun sağ dalını
        private int data; // nodun verisini tutar
        
        Node(int k)         //node a gelecek int değeri node'a çevirir
        {
            left = right = null;    //nodun sol ve sağı null değer 
            data = k;               //veinin kendisi data değişkenine aatılır
        }
    }
    public void insert(int k)//ağaca ekleme metodu
    {
        Node n = new Node(k);//yeni bir eleman geldiyse bunu node a çevir
        insert(root,n);     //kök ile yeni nodu ekleye gönder
    }
    private void insert(Node kok, Node yeni)
    {
        if(root == null) 
            root = yeni;
        else{
            if(kok.data > yeni.data) // sola
            {
                aile=kok;
                if(kok.left == null) // en sola geldik
                {
                    kok.left = yeni;
                    //yeni.parent = kok.left;
                }
                else insert(kok.left,yeni); // en sola gitmek için fonksiyonumuzu recursive olarak çağırıyoruz
            }
            else
            { // sağa
                if(kok.right == null) // en sağa geldik
                {
                    kok.right = yeni;
                    //yeni.parent = kok.right;
                }
                else insert(kok.right,yeni); // en sağa gitmek için fonksiyonumuzu recursive olarak çağırıyoruz
            }
        }
    }
    // en küçük değer için ağacın en soluna gideriz
    int min(Node kok)
    {
        if(kok!=null)
        {
            min(kok.left);
        }
        return kok.data;
    }
    int max(Node kok)
    {
        if(kok!=null)
        {
            min(kok.right);
        }
        return kok.data;
    }
    
    public void printInorder(Node kok)//ağacı dolaşma sol->kök->sağ
    {
        if( kok != null )
        {
            printInorder(kok.left);
            System.out.print(kok.data + "->");
            printInorder(kok.right);
        }
    }
    public void printPreorder(Node kok)//ağacı dolaşma kök->sol->sağ
    {
        if( kok != null )
        {
            System.out.print(kok.data + "->");
            printPreorder(kok.left);
            printPreorder(kok.right);
        }
    }
    public void printPostorder(Node kok)//sol->sağ->kök
    {
        if( kok != null )
        {
            printPostorder(kok.left);
            printPostorder(kok.right);
            System.out.print(kok.data + "->");
        }
    }
}
/*
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
    System.out.print("Postorder sonucu: ");
    tree.printPostorder(tree.root);//sol-->sağ-->sağ
    System.out.println("");
    System.out.print("Predorder sonucu: ");
    tree.printPreorder(tree.root);//kök-->sol-->sağ
    //tree.search(18);
}
}
*/