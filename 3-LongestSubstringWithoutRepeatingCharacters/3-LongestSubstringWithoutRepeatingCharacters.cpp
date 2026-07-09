// Last updated: 7/9/2026, 10:10:44 AM
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> seen; // stores last index of each character
        int maxLen = 0;
        int start = 0; // start of current window

        for (int i = 0; i < s.size(); i++) {
            char c = s[i];
            if (seen.count(c) && seen[c] >= start) {
                // move start to one past the last occurrence of c
                start = seen[c] + 1;
            }
            seen[c] = i; // update last index of c
            maxLen = max(maxLen, i - start + 1);
        }

        return maxLen;
    }
};
