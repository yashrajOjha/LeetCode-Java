class Solution {
    public int longestPalindrome(String s) {
        // Count odd letters --> Set
        // Edge case
        if(s == null || s.length() == 0) return 0;
        
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) set.remove(c);
            else    set.add(c);
        }
        return set.size() == 0 ? s.length() : s.length() - set.size() + 1;
    }
}