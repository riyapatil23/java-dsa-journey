public class FindMinimum {

    public static int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 27, 8, 19};

        int result = findMinimum(arr);

        System.out.println("Minimum element: " + result);
    }
}