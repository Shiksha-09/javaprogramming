// public class Sub {
//     public static void main(String[] args) {

//         String s1 = "ABCD";
//         String s2 = "BC";

//         char arr[] = s1.toCharArray();
//         char arr1[] = s2.toCharArray();

//         int first = -1;
//         int second = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == arr1[0]) {
//                 first = i;

//             }

//             else if (arr[i] == arr1[1]) {
//                 second = i;

//             }
//         }

//         if (first != -1 && second != -1 && first < second) {
//             System.out.println("Subsequence");
//         } else {
//             System.out.println("Not a subsequence");
//         }
//     }
// }

public class Sub {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "BC";
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                ++j;
            }
            ++i;
        }
        if (j == s2.length())
            System.out.println("Subsequence");
        else
            System.out.println("Not a subsequence");
    }
}