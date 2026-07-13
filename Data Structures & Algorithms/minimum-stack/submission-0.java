class MinStack {
    Deque<Integer> dq;
    public MinStack() {
        this.dq = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.dq.push(val);
    }
    
    public void pop() {
         this.dq.pop();
    }
    
    public int top() {
        return this.dq.peek();
    }
    
    public int getMin() {
         return this.dq.stream().min(Comparator.naturalOrder()).orElse(-1);
    }
}
