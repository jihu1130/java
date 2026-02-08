package Product;

public class Book extends Product{
    @Override
    public void showInfo(){
        System.out.println("책 입니다.");
    }

    public void readSample(){
        System.out.println("미리보기 . . .");
    }
}
