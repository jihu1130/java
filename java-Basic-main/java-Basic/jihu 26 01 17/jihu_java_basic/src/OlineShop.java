public class OlineShop {
    public static void main(String[] args) {
        // 온라인쇼핑몰 정책
        // 1. 나이 19세 이상
        // 2. 멤버이거나 쿠폰을 소지한 고객에게 할인을 제공함
        int age           = 22;
        boolean isMember  = true;
        boolean hasCoupon = false;

        boolean isDiscount = age >= 19 && (isMember || hasCoupon); // 19세 이상이면서 맴버거나 쿠폰이 있는사람

        if (isDiscount) {
            System.out.println("할인 대상입니다.");
        }
    }
}