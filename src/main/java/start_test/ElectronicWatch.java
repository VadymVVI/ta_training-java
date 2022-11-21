package start_test;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner timeData = new Scanner(System.in);
        int inputData = timeData.nextInt();
        int outHour = inputData/60;
        int outSec = inputData%60;
        System.out.println(0 + ":" + outHour + ":" + outSec);
    }
}
