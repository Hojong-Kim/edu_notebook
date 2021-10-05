package other;


public class PrivateClass {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
        // pc.defaultVal = 10;  default 패키지가 달라져서 접근 불가능
    }
}