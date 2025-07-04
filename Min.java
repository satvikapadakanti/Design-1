class MinStack {
    Stack<Integer> s;
    int min;
    public MinStack() {
         s=new Stack<>();
         min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }
    
    public void pop() {
       int popp=s.pop();
       if(min==popp){
        min=s.pop();
       }
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
