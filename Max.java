public class Max {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > arr[0]) {
                max = arr[i];

            }
        }
        System.out.println("Maximum value is " + max);
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < arr[0]) {
                min = arr[i];

            }
        }
        System.out.println("Minimum value is " + min);
    }
}
