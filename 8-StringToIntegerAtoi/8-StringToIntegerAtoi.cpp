// Last updated: 7/9/2026, 10:10:37 AM
class Solution {
public:
    int myAtoi(string s) {
        int i = 0, n = s.size();
        // Step 1: Skip leading whitespace
        while (i < n && s[i] == ' ') i++;

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s[i] == '+' || s[i] == '-')) {
            sign = (s[i] == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        long long result = 0;
        while (i < n && isdigit(s[i])) {
            result = result * 10 + (s[i] - '0');
            // Step 4: Clamp to 32-bit range
            if (sign * result <= INT_MIN) return INT_MIN;
            if (sign * result >= INT_MAX) return INT_MAX;
            i++;
        }

        return (int)(sign * result);
    }
};
