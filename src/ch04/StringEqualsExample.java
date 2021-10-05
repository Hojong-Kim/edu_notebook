package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
        // 문자열값 비교할 때, 절대 ==로 비교하면 안 된다.

        String str1 = new String("안녕하세요");  // new는 새로운 주소값을 부여한다.
        String str2 = new String("안녕하세요");
        System.out.println(str1 == str2);   // 주소값이 다르기 때문에 false

        String str3 = str2; // 같은 값을 복사하였으므로 true
        System.out.println(str3 == str2);

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }


}
