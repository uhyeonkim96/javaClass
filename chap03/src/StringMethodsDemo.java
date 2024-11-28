public class StringMethodsDemo {
    public static void main(String[] args) {
        //초기 문자열
        String originalString = "     Java Programming";

        // substring 메서드를 사용하여 부분 문자열 추출
        String subString = originalString.substring(5);
        System.out.println("substring(5)결과:" + subString);

        // toLowerCase 메서드를 사용하여 문자열을 소문자로 변환
        String lowerCaseString = originalString.toLowerCase();
        System.out.println(lowerCaseString);

        String upperCaseString = originalString.toUpperCase();
        System.out.println(upperCaseString);

        String trimmedString = originalString.trim();
        System.out.println(trimmedString);
    }
}
