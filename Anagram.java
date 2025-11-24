public class Anagram {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DCBA";
        int count1 = 0;
        int count2 = 0;
        int j = 0;
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) == s2.charAt(j)) {
                ++j;
                count1 = j;
            }
            count2 = i;
        }
        if (count1 == count2 && s1.length() == s2.length())
            System.out.println("Anagram");
        else
            System.out.println("Not a Anagram");
    }
}
