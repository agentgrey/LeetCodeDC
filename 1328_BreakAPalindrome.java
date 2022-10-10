class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome == null) return "";

        int n = palindrome.length();

        if (n == 0 || n == 1) return "";

        char[] pal = palindrome.toCharArray();

        StringBuilder result = new StringBuilder();

        int left = 0, right = n - 1;

        while (left < right && pal[left] == 'a') {
            left++;
            right--;
        }

        if (left >= right) {
            pal[n - 1] = 'b';
        } else {
            pal[left] = 'a';
        }
        result.append(pal);
        return result.toString();
    }
}