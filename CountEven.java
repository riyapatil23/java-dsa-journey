public class CountEven {

    public static int countEven(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 6};

        int result = countEven(arr);

        System.out.println("Number of even elements: " + result);
    }
}