import java.util.Random;
public class Lab1Ex10Corrected {
    public static void main(String[] args) {
        Random rand = new Random();
        long value = rand.nextLong();
        System.out.println("Value: " + value);
        String result = Long.toUnsignedString(value, 36);
        System.out.println("Result: " + result);
    }
}
