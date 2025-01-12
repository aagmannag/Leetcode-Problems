class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberS = new Stack<>();
        Stack<String> stringS = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numberS.push(num);
            }
            else if (currentChar == '[') {
                stringS.push(String.valueOf(currentChar));
            }
            else if (currentChar == ']') {
                StringBuilder temp = new StringBuilder();
                while (!stringS.isEmpty() && !stringS.peek().equals("[")) {
                    temp.insert(0, stringS.pop());
                }
                stringS.pop();
                int repeatCount = numberS.pop();
                String repeatedString = temp.toString().repeat(repeatCount);
                stringS.push(repeatedString);
            }
            else {
                stringS.push(String.valueOf(currentChar));
            }
        }
        while (!stringS.isEmpty()) {
            ans.insert(0, stringS.pop());
        }
        return ans.toString();
    }
}
