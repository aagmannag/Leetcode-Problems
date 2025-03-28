import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> s2;
    
    MinStack() {
        st = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        if(s2.isEmpty() || val <= s2.peek()){
            s2.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(s2.peek())){
            s2.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
