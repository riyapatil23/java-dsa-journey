public class FindFirstRepeating {

    public static int findFirstRepeating(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 3, 5};

        int result = findFirstRepeating(arr);

        System.out.println("First repeating element: " + result);
    }
}