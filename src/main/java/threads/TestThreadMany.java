package threads;
import java.util.Scanner;
public class TestThreadMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the threads number:");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                MultiThreading thread = new MultiThreading();
                thread.start();
            }
        } else {
            throw new IllegalArgumentException("Please write a positive number");
        }
    }
}