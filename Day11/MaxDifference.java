
public class MaxDifference {

    public static int findMaxDifference(int[] arr) {
        int minSoFar = arr[0];
        int maxDifference = 0;

        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - minSoFar;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < minSoFar) {
                minSoFar = arr[i];
            }
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        int result = findMaxDifference(arr);
        System.out.println("Maximum difference: " + result);
    }
}