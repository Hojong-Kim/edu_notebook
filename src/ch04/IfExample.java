package ch04;

public class IfExample {
    public static void main(String[] args) {
        int score = 89;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");    // false는 읽지 않음.
        }
        if(score < 90) {    // if문 둘은 각각 별개이다.
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
