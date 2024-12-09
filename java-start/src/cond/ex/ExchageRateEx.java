package cond.ex;

public class ExchageRateEx {
    public static void main(String[] args) {
        int dollar = 6;
        if(dollar<0){
            System.out.println("잘못된 금액입니다.");
        }else if(dollar==0){
            System.out.println("환전할 금액이 없습니다.");
        }else{
            int exchage = 1300 * dollar;
            System.out.println("환전금액은" + exchage + "입니다.");
        }
    }
}
