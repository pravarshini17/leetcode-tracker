// Last updated: 9/29/2026, 3:00:35 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Special overflow case
5        if (dividend == Integer.MIN_VALUE &&
6            divisor == -1) {
7            return Integer.MAX_VALUE;
8        }
9
10        // Determine whether answer is negative
11        boolean negative = (dividend < 0) ^ (divisor < 0);
12
13        // Convert to long to safely handle MIN_VALUE
14        long a = Math.abs((long) dividend);
15        long b = Math.abs((long) divisor);
16
17        long quotient = 0;
18
19        // Subtract large doubled values
20        while (a >= b) {
21
22            long temp = b;
23            long multiple = 1;
24
25            while (a >= (temp << 1)) {
26                temp <<= 1;
27                multiple <<= 1;
28            }
29
30            a -= temp;
31            quotient += multiple;
32        }
33
34        // Apply sign
35        if (negative) {
36            quotient = -quotient;
37        }
38
39        // Handle integer range
40        if (quotient > Integer.MAX_VALUE) {
41            return Integer.MAX_VALUE;
42        }
43
44        if (quotient < Integer.MIN_VALUE) {
45            return Integer.MIN_VALUE;
46        }
47
48        return (int) quotient;
49    }
50}