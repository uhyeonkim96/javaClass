public class ForEx {
    public static void main(String[] args) {
        //초기화 부분에서 두 변수를 선언하고 초기화
        int i, sum =0;

        //5번 반복하는 for문
        for(i=0;i<5;i++){
            sum+=i;//sum에 i를 더해서 누적 합계를 구함
            System.out.println("for루프"+(i+1)+"번째 반복실행중");
        }

        //루프가 종료된 후 반복횟수와 누적합계출력
        System.out.println("for루프 종료후 반복횟수"+i);
        System.out.println("누적합계"+sum);

        //확정된 for문 사용 예
        int[] numbers={1,2,3,4,5};
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
