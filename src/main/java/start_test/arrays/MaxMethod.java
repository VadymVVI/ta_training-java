package start_test.arrays;

import java.util.Arrays;

public class MaxMethod {
    public int methodFindMax(int [] dataArray1) {
//        System.out.println(Arrays.stream(dataArray).max()); // test other method
        int resultMax = dataArray1[0];
        for (int i = 1; i < dataArray1.length; i++) {
            if (Integer.MIN_VALUE <= dataArray1[i] && dataArray1[i] <= Integer.MAX_VALUE) {
                if (resultMax > dataArray1[i]) {
                    resultMax = resultMax;
                } else {
                    resultMax = dataArray1[i];
                }
            } else {
                System.out.println("It's not Int");
            }
        }
        return resultMax;
//    return 1; // test for System.out.println(Arrays.stream(dataArray).max());
    }
}
