package Product;

public class Clothing extends Product{
    @Override
    public void showInfo(){
        System.out.println("옷 입니다.");
    }

    public  void checkSize(){
        System.out.println("사이즈는 S,M,L,XL 가 있습니다.");
    }
}
