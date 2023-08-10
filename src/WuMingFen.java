public class WuMingFen{
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
        System.out.println("面码："+theMa+",粉的份量："+quantity+",是否带汤："+likeSoup);
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;

    }
}