public class Sum_pair {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int target = 5;
        int keyarr[] = new int[100];
        int index = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] + arr[j] == target) {
                    int num1 = arr[i];
                    int num2 = arr[j];
                    if (num1 > num2) {
                        int temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                    int keypair = num1 * 10 + num2;
                    boolean duplicate = false;
                    for (int k = 0; k < index; ++k) {
                        if (keypair == keyarr[k]) {
                            duplicate = true;

                        }
                    }
                    if (!duplicate) {
                        System.out.println(num1 + " " + num2);
                        keyarr[index++] = keypair;

                    }
                }
            }
        }
    }
}
