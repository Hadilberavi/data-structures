public class Node {
        int data;
        int yukseklik;
        Node left,right;
        Node(int d){
            this.data =d;
            left= right = null;
            yukseklik = 0;
    
        }
       // yazdirma islemi
        public void displaynode(){
            System.out.println(" "+data+" ");
        }
    }
    

