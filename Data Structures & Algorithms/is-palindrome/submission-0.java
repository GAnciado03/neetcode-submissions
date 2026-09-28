class Solution {
    public boolean isPalindrome(String s) {
        char[] x = new char[s.length()];
        int n = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                x[n++] = Character.toLowerCase(c);
            }
        }

        int a = 0, b = n - 1;
        while(a < b) {
            if(x[a] != x[b]) return false;
            a++;
            b--;
        }
        return true;
    }
}
