// Last updated: 7/9/2026, 10:10:38 AM
class Solution {
public:
    int reverse(int x) {
        long long rev = 0; // use long long to detect overflow
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        if (rev < INT_MIN || rev > INT_MAX) return 0;
        return (int)rev;
    }
};
