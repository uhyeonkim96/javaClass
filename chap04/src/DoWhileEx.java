public class DoWhileEx {
    public static void main(String[] args) {
        int i =1, j=1;

        //while반복문이 조건에 맞지 않으므로 실행되지 않음
        while(i<1){
            System.out.println("while루프"+i+"번째 반복실행중");
            i++;
        }
        System.out.println("while루프 종료후 변수 i의 값은"+i);

        //do-while반복문은 조건과 상관없이 무조건 한번 실행됨
        do{
            System.out.println("do/while루프"+j+"번째 반복실행중");
            j++;
        }while(j<1);
        System.out.println("do/while루프 종료후 변수j의 값은"+j);
    }
}
