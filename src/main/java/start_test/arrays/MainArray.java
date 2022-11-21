package start_test.arrays;

public class MainArray {
    public static void main(String[] args) throws IllegalAccessException {

        // !!!! exercise 1
//        MaxMethod TestData1 = new MaxMethod();
//        int [] dataArrayTest1 = new int[] {-2, 14, 10, 12};
//        System.out.println(TestData1.methodFindMax(dataArrayTest1));

        // !!!! exercise 2
        SumOfEvenNumbers TestData2 = new SumOfEvenNumbers();
        int [] dataArrayTest2 = new int [0]; // if array is empty
        // int [] dataArrayTest2 = null; // if array is null
        // int [] dataArrayTest2 = new int [] {-2,10,0,5}; // if array with normal behavior
        System.out.println(TestData2.methodSumElement(dataArrayTest2));
    }
}
