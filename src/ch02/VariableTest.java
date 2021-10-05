package ch02;

public class VariableTest {
    public static void main(String[] args) {
        //1. 정수는 실수값을 저장할 수 없다.
        //2. 작은 타입에서 큰 타입으로는 자동형변환이 이뤄진다. (수동도 가능하다.)
        //3. 큰 타입에서 작은 타입으로는 자동형변환이 안 된다. (무조건 수동으로 해야 한다.)

        int n1 = 10;    //int n1=10, n2=3, n3, n4, n5로도 가능은 하다. (가독성 때문에 잘 사용하진 않는다)
        int n2 = 3;

        double result = (double)n1  / n2;
        System.out.println("결과: " + result);


    }
}
