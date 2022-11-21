package start_test.arrays;

public class SumOfEvenNumbers {
    public int methodSumElement(int[] dataArray2) throws IllegalAccessException {
        int sumElement = 0;
        if (dataArray2 == null) {
            throw new IllegalAccessException("Array is NULL");
            //System.out.println("Array is NULL");
        } else {
            if (dataArray2.length == 0 ) {
                throw new IllegalAccessException("Array is empty");
                // System.out.println("Array is empty");
            } else {
                for (int i=0; i < dataArray2.length; i++) {
                    if (Integer.MIN_VALUE <= dataArray2[i] && dataArray2[i] <= Integer.MAX_VALUE) {
                        sumElement += dataArray2[i];
                    } else {
                        System.out.println("It's not Int");
                    }
                }
            }
        }
        return sumElement;
    }
}
