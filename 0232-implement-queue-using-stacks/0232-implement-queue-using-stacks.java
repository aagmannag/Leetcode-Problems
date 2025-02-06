class MyQueue {
    Stack<Integer> mt;
    Stack<Integer> st;

    public MyQueue() {
        mt = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int x) {
        mt.push(x);
    }
    
    public int pop() {
        if(st.isEmpty()){
            while(!mt.isEmpty()){
                st.push(mt.pop());
            }
        }
        return st.pop();
    }
    
    public int peek() {
        if(st.isEmpty()){
            while(!mt.isEmpty()){
                st.push(mt.pop());
            }
        }
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && mt.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */