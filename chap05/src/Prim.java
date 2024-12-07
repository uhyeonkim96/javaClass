//Ball클래스 정의
class Ball{
    double radius;//반지름

    public Ball(double r){
        this.radius = r;
    }

    public void setRadius(double r){
        this.radius = r;
    }
}


// 메인 클래스
public class Prim {
    public static void main(String[] args) {
        int a =10; // 기본타입변수선언과 초기화
        int b=a;//기본타입값복사
        b=20;//b의값 변경

        System.out.println("a의값"+a);//a의 값은 변경되지 않음
        System.out.println("b의값"+b);//b의 값은 변경됨

        //Ball객체 생성 및 참조변수 할당
        Ball myBall = new Ball(4.0);//참조타입변수선언과 객체 할당
        Ball yourBall = myBall;//참조타입값 복사
        yourBall.setRadius(5.0);//yourBall을 통해 객체의 radius변경

        System.out.println(myBall.radius);
        System.out.println(yourBall.radius);
    }
}
