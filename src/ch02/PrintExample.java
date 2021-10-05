package ch02;

public class PrintExample {
    public static void main (String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm = "홍길동";
        int age = 1700;
        float height = 180.8243f;
        char bloodtype = 'A';

        //홍길동의 키는 180.8cm, 나이는 17세, 혈액형은 A형이다.

        System.out.println(nm + "의 키는 " + height + "cm, 나이는"
                + age + "세, 혈액형은 " + bloodtype + "형이다.");

        //2020, 8, 9 > 20200809

        System.out.printf("%s의 키는 %.2fcm, 나이는 %,09d세, 혈액형은 %c형이다.",
                            nm, height, age, bloodtype);

    }
}
