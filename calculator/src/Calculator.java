import java.util.Random;

public class Calculator {

    private final Random random;

    public Calculator(Random random) {
        this.random = random;
    }

    public int add(int... operands) {
        int sum = 0;
        for (int operand : operands) {
            sum += operand;
        }
        return sum;
    }

    public int multiply(int quantity, int cost){
        return quantity * cost;
    }

    public int multiplyByRandom(int operand) {
        return operand * random.nextInt();
    }



}


