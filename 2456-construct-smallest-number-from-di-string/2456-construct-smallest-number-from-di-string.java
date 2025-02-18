class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        boolean[] used = new boolean[10];
        StringBuilder result = new StringBuilder();
        backtrack(pattern, 0, new int[n + 1], used, result);
        return result.toString();
    }

    private boolean backtrack(String pattern, int idx, int[] num, boolean[] used, StringBuilder result) {
        if (idx > pattern.length()) {
            for (int i = 0; i < num.length; i++) result.append(num[i]);
            return true;
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (!used[digit] && (idx == 0 || isValid(num[idx - 1], digit, pattern.charAt(idx - 1)))) {
                used[digit] = true;
                num[idx] = digit;
                if (backtrack(pattern, idx + 1, num, used, result)) return true;
                num[idx] = 0;
                used[digit] = false;
            }
        }
        return false;
    }

    private boolean isValid(int lastDigit, int currentDigit, char condition) {
        return (condition == 'I' && lastDigit < currentDigit) || (condition == 'D' && lastDigit > currentDigit);
    }
}
