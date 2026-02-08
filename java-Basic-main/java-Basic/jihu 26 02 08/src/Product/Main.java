package Product;

public class Main {
    public static void main(String[] args) {
        Product[] p1 = {new Book(), new Clothing()};

        for (int i = 0; i < p1.length; i++){
            p1[i].showInfo();

            if (p1[i] instanceof Book){
                ((Book) p1[i]).readSample();
            } else if (p1[i] instanceof Clothing) {
                Clothing clothing = (Clothing) p1[i];
                clothing.checkSize();
            }

        }
    }
}
