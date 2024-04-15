class Solution {
    public String minRemoveToMakeValid(String s) {
      StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean[] invalidIndices = new boolean[s.length()]; // Mark invalid indices

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    invalidIndices[i] = true; // Mark invalid closing parentheses
                }
            }
        }

        // Mark remaining invalid opening parentheses
        while (!stack.isEmpty()) {
            invalidIndices[stack.pop()] = true;
        }

        // Build the result string, excluding marked indices
        for (int i = 0; i < s.length(); i++) {
            if (!invalidIndices[i]) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}