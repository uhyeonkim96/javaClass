public class Demo {
    //클래스 필드
    int filed;

    public void showDiff(){
        //메서드 지역변수
        int local = 7;
        //클래스 필드에 지역변수의 값을 할당
        filed = local;

        System.out.println("클래스필드:"+ filed);
        System.out.println("메서드지역변수:"+local);


    }

    public void changeFiled(){
        //다른 메서드에서 클래스 필드의 값을 변경
        filed=10;

        //local변수는 여기서 접근할 수 없음
    }

    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showDiff();
        demoInstance.changeFiled();

        //필드값은 클래스 전체에서 유지되므로 변경된 값이 출력됨
        System.out.println("변경된 클래스 필드"+demoInstance.filed);
    }
}
