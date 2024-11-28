public class StringExample {
    public static void main(String[] args) {
        // 문자열 직접 할당
        String greeting = "안녕하세요";
        System.out.println(greeting); // 안녕하세요 출력

        // new 키워드를 사용하여 문자열 객체 생성
        String name = new String("Java 사용자");
        System.out.println(name); // Java 사용자 출력

        // 문자 배열을 사용하여 문자열 생성
        char[] charArray = {'J', 'a', 'v', 'a', ' ', '프', '로', '그', '래', '머'};
        String programmer = new String(charArray);
        System.out.println(programmer); // Java 프로그래머 출력

        // 문자열 연결
        String fullName = "kim" + " " + "uhyeon"; // kim과 uhyeon 연결
        System.out.println(fullName); // kim uhyeon 출력

        // StringBuilder를 사용하여 문자열 생성 및 연결
        StringBuilder sb = new StringBuilder();
        sb.append("문자열").append("생성").append("예제");
        String result = sb.toString(); // StringBuilder 내용을 문자열로 변환
        System.out.println(result);
    }
}
