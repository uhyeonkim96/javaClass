package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        while(num <= 20){
            num++;
            if(num % 2 == 1){
                continue;
            }

            System.out.println(num);

        }

        // 다른 방법
        int num2 = 2;
        int count2 = 1;
        while(count2 <= 10){
            System.out.println(num2);
            num2 += 2;
            count2++;
        }
    }
}
