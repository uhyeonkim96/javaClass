package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;


        if(price>=10000){
            discount += 1000;
            System.out.println("만원이상 구매, 천원할인");

        }

        if(age<=10){
            discount += 1000;
            System.out.println("어린이 천원할인");
        }
        System.out.println("총할인금액"+discount+"원");
    }
}
