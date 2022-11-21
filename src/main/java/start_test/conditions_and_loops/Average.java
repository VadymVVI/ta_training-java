package start_test.conditions_and_loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int dataMax=0, dataTemp;
        Scanner data = new Scanner(System.in);
        while (data.nextInt() !=0) {
            dataTemp = data.nextInt();
            if (dataTemp  > dataMax) {
                dataMax = dataTemp;
            } else {
                dataMax = dataMax;
            }
        }
        System.out.println(dataMax);
    }
}
