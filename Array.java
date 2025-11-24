public class Array {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4 };
        // Subscript [] is written anywhere around a array
        // with size we cannot initialise array

        // int arr[]
        // no size can be alot when the declaration of array because in java array is an
        // object

        // [I@251a69d7---- [= shows which type of array is one dimension,2dimension and
        // 3dimension
        // i=type of array i.e integer,character
        // 2551a69d7= haxcode

        // int arr[] = new int[5];
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);
        System.out.println(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }
}
