public class Person {

    //private필드
    private String name;

    //생성자
    public Person(String name){
        this.name = name; // 초기이름설정
    }

    //접근자 메서드 - name필드값 반환
    public String getName(){
        return name;//현재 인스턴스의 name필드값을 반환
    }

    //설정자 메서드- name필드 값 변경
    public void setName(String newName){
        this.name = newName; //새로운값으로현재인스턴스의 name 필드 값 변경
    }

    //메인메서드
    public static void main(String[] args) {

        Person person = new Person("Jane Doe");
        System.out.println(person.getName());
        person.setName("John Doe");
        System.out.println(person.getName());
    }
}
