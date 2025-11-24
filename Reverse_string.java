public class Reverse_string {
    public static void main(String[] args) {
        String name = "Hello";
        char arr[] = name.toCharArray();
        // int n = arr.length;
        // for (int i = 0; i < n; ++i) {
        // char temp = arr[i];
        // arr[i] = arr[n - i - 1];
        // arr[n - i - 1] = temp;
        // System.out.println(arr[i]);
        // }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String rev = new String(arr);
        System.out.println(rev);

    }
}
