public class Calculator {

    public int add(int... operands) {
        int sum = 0;
        for (int operand : operands) {
            sum += operand;
        }
        return sum;
    }
}
