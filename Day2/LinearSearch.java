public class LinearSearch {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};
        int target = 42;

        int result = search(arr, target);

        System.out.println("Target index: " + result);
    }
}