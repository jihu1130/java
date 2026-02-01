import java.util.Scanner;

public class oper {
    public static void main(String[] args) {
        //19세 이상
        int     age         = 22;       //나이
        boolean isMamber    = true;     //맴버인가?
        boolean hasCoupon   = true;     //쿠폰이 있는가?

        boolean isDiscount  = age >= 19 && (isMamber || hasCoupon); //할인 대상판단


        if(isDiscount)      System.out.println("할인대상 입니다.");
        else                System.out.println("할인대상이 아닙니다.");

  /*      int age = 19;
        String gander = "Male";
        boolean graduate = true;
        //만 19세 이고 남자이며 졸업한 사람
         boolean canComein = age >= 19 && gander.equals("Male") && graduate == true;

        if(canComein){
             System.out.println("만 19세 이고 남자이며 졸업한 사람");
      }*/
    }
}