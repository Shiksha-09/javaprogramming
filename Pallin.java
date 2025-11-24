public class Pallin {

    public static void main(String[] args) {
        String name = "madam";
        char arr[] = name.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean pallin = true;
        while (start < end) {
            if (arr[start] != arr[end]) {
                pallin = false;
                break;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        if (pallin)
            System.out.println("pallindrome");
        else
            System.out.println("not pallindrome");

    }
}
