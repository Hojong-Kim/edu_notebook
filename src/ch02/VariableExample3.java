package ch02;

public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'A';   // 쌍따옴표 레퍼런스 타입, 형변환 안 됨.
        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl = false; // boolean 타입은 값을 두 가지밖에 저장 못 함. (ture, false)
        System.out.println(bl);

    }
}
// boolean
// byte < char < short < int < long < float < double < String
// 무엇이든 String을 만나면 String으로 변한다. 대신 +밖에 되지 않는다.