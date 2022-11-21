package start_test.conditions_and_loops;

import java.util.Scanner;

public class MeetAnAgent {

    final static int PASSWORD = 133976;

    public static void main(String[] args) throws IllegalAccessException {

        Scanner inPassword = new Scanner(System.in);
        int dataPassword = inPassword.nextInt();
        if (dataPassword == PASSWORD){
            System.out.println("Hello, Agent");
        } else {
            //System.out.println("Access denied");
            throw new IllegalAccessException("Access denied");
        }
    }
}
