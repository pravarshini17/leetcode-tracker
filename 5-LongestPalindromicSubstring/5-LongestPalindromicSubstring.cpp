// Last updated: 7/9/2026, 10:10:41 AM
class Solution {
public:
    string longestPalindrome(string s) {
        if (s.empty()) return "";
        int start = 0, maxLen = 1;

        auto expand = [&](int left, int right) {
            while (left >= 0 && right < s.size() && s[left] == s[right]) {
                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }
        };

        for (int i = 0; i < s.size(); i++) {
            expand(i, i);       // odd length palindrome
            expand(i, i + 1);   // even length palindrome
        }

        return s.substr(start, maxLen);
    }
};
