package math.a01mathdemo1;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 4, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
