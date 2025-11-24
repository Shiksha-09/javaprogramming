public class Arr_largest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int slargest = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != max && slargest < arr[i]) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}
