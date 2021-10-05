package ch04;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 89;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");    // false는 읽지 않음.
        }
        else {  // else가 있으면 무조건 하나는 실행된다.
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
