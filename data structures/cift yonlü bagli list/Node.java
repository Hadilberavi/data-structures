public class Node {
    String kisi;
    Node sonraki = null;
    Node onceki = null;

    public String getIsim() {
        return kisi;
    }

    public void setIsim(String sehir) {
        this.kisi = sehir;
    }

    public Node getSonraki() {
        return sonraki;
    }

    public void setSonraki(Node sonraki) {
        this.sonraki = sonraki;
    }

    public Node getOnceki() {
        return onceki;
    }

    public void setOnceki(Node onceki) {
        this.onceki = onceki;
    }
}