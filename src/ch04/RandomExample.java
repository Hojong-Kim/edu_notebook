package ch04;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6); // (int) -> int 형으로 수동형변환   // 괄호가 있으면 메소드
        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6) + 2;    // (int)(Math.random() * 6 + 2);
        System.out.println("num2 : " + num2);

        // 55~108
        int num3 = (int)(Math.random() * 54) + 55;
        System.out.println("num3 : " + num3);
    }
}
