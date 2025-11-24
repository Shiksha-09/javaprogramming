public class Alphabet {
    public static void main(String[] args) {
        char i = 'a';
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                if (c <= r) {
                    System.out.print(i); // / System.out.print((char)(i+r-1));

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            ++i;
        }

    }
}
