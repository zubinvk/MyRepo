package programs;

public class CombineStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "defg";
        String R = "abcdefgh";
        
        
//        Arrays.
        if (combineStrings(s1, s2, R)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean combineStrings(String s1, String s2, String R) {
        if (s1.length() + s2.length() != R.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[Character.toLowerCase(c) - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            s2Count[Character.toLowerCase(c) - 'a']++;
        }

        for (char c : R.toCharArray()) {
            int index = c - 'a';
            if (s1Count[index] > 0) {
                s1Count[index]--;
            } else if (s2Count[index] > 0) {
                s2Count[index]--;
            } else {
                return false;
            }
        }

        return true;
    }
}
