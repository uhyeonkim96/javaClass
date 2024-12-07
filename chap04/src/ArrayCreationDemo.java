public class ArrayCreationDemo {
    public static void main(String[] args) {
        //방법1. 배열 선언과 동시에 초기화(선언과 생성을 한 번에 처리)
        int[] scoresMethod1 = {100,90,80,70,60};

        //방법2. new 키워드를 사용하여 배열 선언과 동시에 초기화
        int[] scoresMethod2 = new int[]{100,90,80,70,60};

        //방법3. 배열 선언 후, 나중에 new 키워드로 배열 생성과 초기화
        int[] scoresMethod3;
        scoresMethod3 = new int[]{100,90,80,70,60};

        // 배열 내용을 출력하여 확인
        System.out.println("방법1");
        for(int score: scoresMethod1){
            System.out.println(score + " ");
        }
        System.out.println();

        System.out.println("방법2");
        for(int score:scoresMethod2){
            System.out.println(score + " ");
        }
        System.out.println();

        System.out.println("방법3");
        for(int score:scoresMethod3){
            System.out.println(score+" ");
        }
        System.out.println();
    }
}
