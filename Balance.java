public class Balance {
    public static void main(String[] args) {
        String brac = "{([ ])}";
        char arr[] = brac.toCharArray();
        int curly = 0;
        int square = 0;
        int circle = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{')
                curly++;
            else if (arr[i] == '(')
                circle++;
            else if (arr[i] == '[')
                square++;
            else if (arr[i] == ']')
                square--;
            else if (arr[i] == ')')
                circle--;
            else if (arr[i] == '}')
                curly--;
        }
        if (curly == 0 && square == 0 && circle == 0) {
            System.out.println("Balance");
        } else
            System.out.println("Not balance");
    }
}
