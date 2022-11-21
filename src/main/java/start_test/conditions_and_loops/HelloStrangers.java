package start_test.conditions_and_loops;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner meetStrangers = new Scanner(System.in);
        int amountOfStrangers = meetStrangers.nextInt();
        if (amountOfStrangers > 0) {
            for (int i=0; i < 3; i++) {
                Scanner inName = new Scanner(System.in);
                String nameStrangers = inName.next();
                System.out.println("Hello, " + nameStrangers);
            }
        } else {
            if (amountOfStrangers == 0) {
                throw new IllegalAccessException("Oh, it looks like there is no one here");
            } else {
                if (amountOfStrangers < 0) {
                    throw new IllegalAccessException("Seriously? Why so negative?");
                }
            }
        }
    }
}
