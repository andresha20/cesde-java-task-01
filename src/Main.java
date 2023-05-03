import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String outputChatbox;
        int n = 2;
        Scanner parser = new Scanner(System.in);
        outputChatbox = "Insert loop size:";
        System.out.println(outputChatbox);
        if (n > 1) {
            n = parser.nextInt();
        }
        int[] numbers = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int number = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            outputChatbox = String.valueOf(number);
            System.out.println(outputChatbox);
            numbers[i] = number;
        }
        outputChatbox = String.valueOf(numbers.length);
        System.out.println(outputChatbox);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && i % 2 == 1) {
                outputChatbox = "Number: " + String.valueOf(numbers[i]) + " | Index: " + String.valueOf(i);
                System.out.println(outputChatbox);
            }
        }
    }
}