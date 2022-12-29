public class Main {
        public static void main(String[] args) {
    
            List yeni = new List();   // list tipinde bir yeni tanimladik
            yeni.ekle("hedil");
            yeni.ekle("ayse");
            yeni.ekle("sara");
            yeni.ekle("malik");
            yeni.ekle("omer");
    
            yeni.listele();
            yeni.sil("ayse");   // sil elemani cagirma
            System.out.println("\n elemen sildikten sonra");
            yeni.listele();
        }
    }
    

