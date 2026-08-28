// Last updated: 8/28/2026, 11:16:31 AM
1import java.util.Stack;
2
3class MinStack {
4
5    Stack<Integer> stack;
6    Stack<Integer> minStack;
7
8    public MinStack() {
9        stack = new Stack<>();
10        minStack = new Stack<>();
11    }
12
13    public void push(int val) {
14        stack.push(val);
15
16        if (minStack.isEmpty() || val <= minStack.peek()) {
17            minStack.push(val);
18        } else {
19            minStack.push(minStack.peek());
20        }
21    }
22
23    public void pop() {
24        stack.pop();
25        minStack.pop();
26    }
27
28    public int top() {
29        return stack.peek();
30    }
31
32    public int getMin() {
33        return minStack.peek();
34    }
35}