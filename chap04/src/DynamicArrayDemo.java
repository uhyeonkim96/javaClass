import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        //string 타입의 arrayList생성
        ArrayList<String> stringList = new ArrayList<>();

        //ArrayList에 요소 추가
        stringList.add("JAVA");
        stringList.add("Python");
        stringList.add("C++");

        //ArrayList에서 요소 제거
        stringList.remove("Python");

        //ArrayList 에서 특정 인덱스의 요소 가져오기
        String elementAtIndex = stringList.get(1);

        //ArrayList의 크기 가져오기
        int size = stringList.size();

        //결과출력
        System.out.println("인덱스1의 요소:"+elementAtIndex);
        System.out.println("ArrayList의 크기"+size);
        System.out.println("ArrayList의 현재 요소들");
        for(String s: stringList){
            System.out.println(s);
        }
    }
}
