public class Shopping {
    public static int clothes = 5;

    public static void main(String[] args) {
        for (int i =0; i< 6; i++){
            System.out.println("현재 상품 수량: " + clothes);
            reduceQuantity();
        }
    }
    public static void reduceQuantity () throws OutOfStockException{
        if (clothes > 0) clothes--;

        if (clothes <= 0) throw new OutOfStockException("재고가 없습니다.");

    }
}
