import java.util.Random;

public class Calculator {

    public int add(int... operands) {
        int sum = 0;
        for (int operand : operands) {
            sum += operand;
        }
        return sum;
    }

    public int totalCostForItems(int quantity, int cost){
        return quantity * cost;
    }

    public int multiplyCostByRandomNumber(Random randomNumber, int itemCost) {
        return itemCost * randomNumber.nextInt();
    }
}
