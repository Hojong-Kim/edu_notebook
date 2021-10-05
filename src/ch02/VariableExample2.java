package ch02;

public class VariableExample2 {
    public static void main (String[] args) {
        float f;
        double d;

        int n1;
        // n1 = 10.1;   불가능
        f = 10.1f;  // literal = 값 그 자체인 것
        d = 10.1;   // literal에도 타입이 있다. 실수만 적었을 경우 더블 타입이다.

        double d2 = f * f;  // 자동 형변환
        double d3 = (double)f * f;  // 계산을 위해 f가 더블 타입으로 변한다.
        // double d2 = (double)(f * f);

        //float f2 = d * d; // 자동 형변환 불가능
        float f2 = (float)(d * d); // 수동으로 형변환 해야 함
        float f3 = (float)(d) * (float)(d); // (float)((float)d * d);

    }
}
