public class MultiDimensionArrayDemo {
    public static void main(String[] args) {
        //3행 5열의 2차원 배열 선언 및 초기화
        int[][] scores = {{100,90,80,70,60},{10,20,30,40,50},{50,60,70,30,40}};

        //첫번째행의 첫번째 열에 있는 점수에 접근
        int firstRowFirstCol = scores[0][0];
        System.out.println("첫번재행의 첫번째 점수:"+firstRowFirstCol);

        //두번째행의 세번째 열에 있는 점수에 접근
        int secondRowThirdCol = scores[1][2];
        System.out.println("두번째행의 세번째 점수:"+secondRowThirdCol);

        //배열의 크기 출력
        System.out.println("2차원 배열의 행의수:"+scores.length);
        System.out.println("첫번째 행의 열의수:"+scores[0].length);

        //2차원 배열의 모든 원소를 순회하며 출력
        System.out.println("2차원 배열의 모든점수:");
        for(int i =0; i<scores.length;i++){
            for(int j =0; j<scores[i].length;j++){
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }

    }
}
